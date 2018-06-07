insert into roles (code, name) values ('ROLE_ADMIN', 'Administrator');
insert into roles (code, name) values ('ROLE_USER', 'Uzytkownik');

insert into users (id, firstname, lastname, username, password, role_code) values (1, 'Kacper', 'Ostrowski', 'admin', 'admin', 'ROLE_ADMIN');
insert into users (id, firstname, lastname, username, password, role_code) values (2, 'Kajtek', 'Ostrowski', 'user', 'user', 'ROLE_ADMIN');

insert into contacts (id, name, last_name, email, contact_phone, position) values (1, 'Slawomir', 'Zapala', 's.zapala@wp.pl', '+48123456789', 'kierowsnik');

insert into companies (id, company_name, krs, regon, contact_id) values (1, 'acme', '4423423', '43534534', 1);

insert into categories(id, name, parentid) values (1, 'glowna_1', null);
insert into categories(id, name, parentid) values (2, 'glowna_2', null);
insert into categories(id, name, parentid) values (3, 'glowna_3', null);
insert into categories(id, name, parentid) values (4, 'glowna_4', null);

insert into categories(id, name, parentid) values (5, 'podrzedna', 1);
insert into categories(id, name, parentid) values (6, 'podrzedna', 1);
insert into categories(id, name, parentid) values (7, 'podrzedna', 1);
insert into categories(id, name, parentid) values (8, 'podrzedna', 1);
insert into categories(id, name, parentid) values (9, 'podrzedna', 1);

insert into categories(id, name, parentid) values (10, 'podrzedna', 5);
insert into categories(id, name, parentid) values (11, 'podrzedna', 5);
insert into categories(id, name, parentid) values (12, 'podrzedna', 5);
insert into categories(id, name, parentid) values (13, 'podrzedna', 8);
insert into categories(id, name, parentid) values (14, 'podrzedna', 8);

insert into categories(id, name, parentid) values (15, 'podrzedna', 4);
insert into categories(id, name, parentid) values (16, 'podrzedna', 4);