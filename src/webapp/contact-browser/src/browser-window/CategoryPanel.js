import 'rc-tree/assets/index.css';
import React, {Component} from 'react';
import ReactDOM from 'react-dom';
import Tree, { TreeNode } from 'rc-tree';
import cssAnimation from 'css-animation';
import axios from 'axios';

const STYLE = `
.collapse {
  overflow: hidden;
  display: block;
}

.collapse-active {
  transition: height 0.3s ease-out;
}
`;

function animate(node, show, done) {
  let height = node.offsetHeight;
  return cssAnimation(node, 'collapse', {
    start() {
      if (!show) {
        node.style.height = `${node.offsetHeight}px`;
      } else {
        height = node.offsetHeight;
        node.style.height = 0;
      }
    },
    active() {
      node.style.height = `${show ? height : 0}px`;
    },
    end() {
      node.style.height = '';
      done();
    },
  });
}

const animation = {
  enter(node, done) {
    return animate(node, true, done);
  },
  leave(node, done) {
    return animate(node, false, done);
  },
  appear(node, done) {
    return animate(node, true, done);
  },
};

class CategoryPanel extends Component {

    constructor(props) {
      super(props);
    }

    state = {
      categories: []
    }
  
    componentDidMount() {
      if(this.state.categories.length == 0) {
        axios.get('http://localhost:8080/category_tree')
        .then((res) => {
          console.log(res);
          this.setState({
            categories: res.data
          });
        })
        .catch((err) => {
          console.log(err);
        });
      }
    }

    prepareTreeStructureToDisplay = (categoryData, categoryTreeNode) => {
      if(categoryData.subCategories.length > 0) {
        for(let i =0; i<categoryData.subCategories.length; i++) {
          const cat = categoryData.subCategories[i];
          const newNode = <TreeNode children={[]} key={cat.id} parentID={cat.parentID} title={cat.name} />;
          categoryTreeNode.props.children.push(this.prepareTreeStructureToDisplay(cat, newNode));
        }
      }
      return categoryTreeNode;
    }

    render() {

      const treeNodes = [];
      for(let i =0; i<this.state.categories.length; i++) {
        const cat = this.state.categories[i];
        const newNode = <TreeNode children={[]} key={cat.id} parentID={cat.parentID} title={cat.name} />;
        treeNodes.push(this.prepareTreeStructureToDisplay(cat, newNode));
      }

      return(
        <div>
          <h2>expanded</h2>
          <style dangerouslySetInnerHTML={{ __html: STYLE }}/>
          <Tree
            defaultExpandAll={false}
            defaultExpandedKeys={['p1']}
            openAnimation={animation}
          >
            {
              treeNodes            
            }
          </Tree>
        </div>);
    }
  }
  
  
  export default CategoryPanel;