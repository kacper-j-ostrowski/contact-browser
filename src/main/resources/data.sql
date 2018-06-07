insert into roles (code, name) values ('ROLE_ADMIN', 'Administrator');
insert into roles (code, name) values ('ROLE_USER', 'Uzytkownik');

insert into users (id, firstname, lastname, username, password, role_code) values (1, 'Kacper', 'Ostrowski', 'admin', 'admin', 'ROLE_ADMIN');
insert into users (id, firstname, lastname, username, password, role_code) values (2, 'Kajtek', 'Ostrowski', 'user', 'user', 'ROLE_ADMIN');

insert into contacts (id, name, last_name, email, contact_phone, position) values (1, 'Slawomir', 'Zapala', 's.zapala@wp.pl', '+48123456789', 'kierowsnik');
insert into contacts (id, name, last_name, email, contact_phone, position) values (2, 'Slawomir', 'Zapala', 's.zapala@wp.pl', '+48123456789', 'kierowsnik');
insert into contacts (id, name, last_name, email, contact_phone, position) values (3, 'Slawomir', 'Zapala', 's.zapala@wp.pl', '+48123456789', 'kierowsnik');
insert into contacts (id, name, last_name, email, contact_phone, position) values (4, 'Slawomir', 'Zapala', 's.zapala@wp.pl', '+48123456789', 'kierowsnik');
insert into contacts (id, name, last_name, email, contact_phone, position) values (5, 'Slawomir', 'Zapala', 's.zapala@wp.pl', '+48123456789', 'kierowsnik');
insert into contacts (id, name, last_name, email, contact_phone, position) values (6, 'Slawomir', 'Zapala', 's.zapala@wp.pl', '+48123456789', 'kierowsnik');
insert into contacts (id, name, last_name, email, contact_phone, position) values (7, 'Slawomir', 'Zapala', 's.zapala@wp.pl', '+48123456789', 'kierowsnik');

insert into companies (id, company_name, krs, regon, contact_id) values (1, 'acme', '4423423', '43534534', 1);
insert into companies (id, company_name, krs, regon, contact_id) values (2, 'acme', '4423423', '43534534', 2);
insert into companies (id, company_name, krs, regon, contact_id) values (3, 'acme', '4423423', '43534534', 3);
insert into companies (id, company_name, krs, regon, contact_id) values (4, 'acme', '4423423', '43534534', 4);
insert into companies (id, company_name, krs, regon, contact_id) values (5, 'acme', '4423423', '43534534', 5);
insert into companies (id, company_name, krs, regon, contact_id) values (6, 'acme', '4423423', '43534534', 6);
insert into companies (id, company_name, krs, regon, contact_id) values (7, 'acme', '4423423', '43534534', 7);

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

insert into categories_companies(company_id, category_id) values (1,1);
insert into categories_companies(company_id, category_id) values (2,2);
insert into categories_companies(company_id, category_id) values (3,6);
insert into categories_companies(company_id, category_id) values (4,15);
insert into categories_companies(company_id, category_id) values (5,10);
insert into categories_companies(company_id, category_id) values (6,14);
insert into categories_companies(company_id, category_id) values (7,4);