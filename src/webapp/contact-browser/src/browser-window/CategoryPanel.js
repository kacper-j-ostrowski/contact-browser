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
      axios.get('')
      .then((res) => {
        this.setState({
          categories: res
        });
      })
      .catch((err) => {
        console.log(err);
      });
    }

    render() {
      return(
        <div>
          <h2>expanded</h2>
          <style dangerouslySetInnerHTML={{ __html: STYLE }}/>
          <Tree
            defaultExpandAll={false}
            defaultExpandedKeys={['p1']}
            openAnimation={animation}
          >
            <TreeNode title="parent 1" key="p1">
              <TreeNode key="p10" title="leaf"/>
              <TreeNode title="parent 1-1" key="p11">
                <TreeNode title="parent 2-1" key="p21">
                  <TreeNode title="leaf"/>
                  <TreeNode title="leaf"/>
                </TreeNode>
                <TreeNode key="p22" title="leaf"/>
              </TreeNode>
            </TreeNode>
          </Tree>
        </div>);
    }
  }
  
  
  export default CategoryPanel;