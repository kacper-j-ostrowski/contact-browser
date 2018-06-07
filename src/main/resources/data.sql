insert into roles (code, name) values ('ROLE_ADMIN', 'Administrator');
insert into roles (code, name) values ('ROLE_USER', 'Uzytkownik');

insert into users (id, firstname, lastname, username, password, role_code) values (1, 'Kacper', 'Ostrowski', 'admin', 'admin', 'ROLE_ADMIN');
insert into users (id, firstname, lastname, username, password, role_code) values (2, 'Kajtek', 'Ostrowski', 'user', 'user', 'ROLE_ADMIN');
