insert into roles (code, name) values ('ROLE_ADMIN', 'Administrator');
insert into roles (code, name) values ('ROLE_USER', 'Uzytkownik');

insert into users (id, firstname, lastname, username, password, role_code) values (1, 'Kacper', 'Ostrowski', 'admin', 'admin', 'ROLE_ADMIN');
insert into users (id, firstname, lastname, username, password, role_code) values (2, 'Kajtek', 'Ostrowski', 'user', 'user', 'ROLE_ADMIN');

insert into contacts (id, name, last_name, email, contact_phone, position) values (1, 'Sławomir', 'Zapała', 's.zapala@wp.pl', '+48123456789', 'kierowsnik');
insert into contacts (id, name, last_name, email, contact_phone, position) values (2, 'Władysław', 'Zapala', 's.zapala@wp.pl', '+48123456789', 'kierowsnik');
insert into contacts (id, name, last_name, email, contact_phone, position) values (3, 'Zenon', 'Zapala', 's.zapala@wp.pl', '+48123456789', 'kierowsnik');
insert into contacts (id, name, last_name, email, contact_phone, position) values (4, 'Stanisław', 'Zapala', 's.zapala@wp.pl', '+48123456789', 'kierowsnik');
insert into contacts (id, name, last_name, email, contact_phone, position) values (5, 'Zdzisław', 'Zapala', 's.zapala@wp.pl', '+48123456789', 'kierowsnik');
insert into contacts (id, name, last_name, email, contact_phone, position) values (6, 'Marek', 'Zapala', 's.zapala@wp.pl', '+48123456789', 'kierowsnik');
insert into contacts (id, name, last_name, email, contact_phone, position) values (7, 'Paweł', 'Zapala', 's.zapala@wp.pl', '+48123456789', 'kierowsnik');
insert into contacts (id, name, last_name, email, contact_phone, position) values (8, 'Lech', 'Wałęsa', 's.zapala@wp.pl', '+48123456789', 'kierowsnik');
insert into contacts (id, name, last_name, email, contact_phone, position) values (9, 'Aleksander', 'Kwaśniewski', 's.zapala@wp.pl', '+48123456789', 'kierowsnik');
insert into contacts (id, name, last_name, email, contact_phone, position) values (10, 'Bronisław', 'Komorowski', 's.zapala@wp.pl', '+48123456789', 'kierowsnik');
insert into contacts (id, name, last_name, email, contact_phone, position) values (11, 'Andrzej', 'Duda', 's.zapala@wp.pl', '+48123456789', 'kierowsnik');
insert into contacts (id, name, last_name, email, contact_phone, position) values (12, 'Jarosław', 'Kaczyński', 's.zapala@wp.pl', '+48123456789', 'kierowsnik');
insert into contacts (id, name, last_name, email, contact_phone, position) values (13, 'Antoni', 'Macierewicz', 's.zapala@wp.pl', '+48123456789', 'kierowsnik');
insert into contacts (id, name, last_name, email, contact_phone, position) values (14, 'Elżbieta', 'Rafalalska', 's.zapala@wp.pl', '+48123456789', 'kierowsnik');
insert into contacts (id, name, last_name, email, contact_phone, position) values (15, 'Jacek', 'Kurski', 's.zapala@wp.pl', '+48123456789', 'kierowsnik');
insert into contacts (id, name, last_name, email, contact_phone, position) values (16, 'Rafał', 'Jackiewicz', 's.zapala@wp.pl', '+48123456789', 'kierowsnik');
insert into contacts (id, name, last_name, email, contact_phone, position) values (17, 'Andrzej', 'Gołota', 's.zapala@wp.pl', '+48123456789', 'kierowsnik');
insert into contacts (id, name, last_name, email, contact_phone, position) values (18, 'Dariusz', 'Michalczewski', 's.zapala@wp.pl', '+48123456789', 'kierowsnik');
insert into contacts (id, name, last_name, email, contact_phone, position) values (19, 'Tomasz', 'Adamek', 's.zapala@wp.pl', '+48123456789', 'kierowsnik');
insert into contacts (id, name, last_name, email, contact_phone, position) values (20, 'Krzysztof', 'Włodarczyk', 's.zapala@wp.pl', '+48123456789', 'kierowsnik');
insert into contacts (id, name, last_name, email, contact_phone, position) values (21, 'Krzysztof', 'Głowacki', 's.zapala@wp.pl', '+48123456789', 'kierowsnik');
insert into contacts (id, name, last_name, email, contact_phone, position) values (22, 'Mammed', 'Khalidov', 's.zapala@wp.pl', '+48123456789', 'kierowsnik');

insert into companies (id, company_name, krs, regon, contact_id) values (1, 'acme', '4423423', '43534534', 1);
insert into companies (id, company_name, krs, regon, contact_id) values (2, 'blacharstwo', '4423423', '43534534', 2);
insert into companies (id, company_name, krs, regon, contact_id) values (3, 'lakiernictwo', '4423423', '43534534', 3);
insert into companies (id, company_name, krs, regon, contact_id) values (4, 'murarstwo', '4423423', '43534534', 4);
insert into companies (id, company_name, krs, regon, contact_id) values (5, 'ślusarstwo', '4423423', '43534534', 5);
insert into companies (id, company_name, krs, regon, contact_id) values (6, 'tokarstwo', '4423423', '43534534', 6);
insert into companies (id, company_name, krs, regon, contact_id) values (7, 'tynkarstwo', '4423423', '43534534', 7);
insert into companies (id, company_name, krs, regon, contact_id) values (8, 'bokserstwo', '4423423', '43534534', 8);
insert into companies (id, company_name, krs, regon, contact_id) values (9, 'fuszerka', '4423423', '43534534', 9);
insert into companies (id, company_name, krs, regon, contact_id) values (10, 'glazurnoctwo', '4423423', '43534534', 10);
insert into companies (id, company_name, krs, regon, contact_id) values (11, 'śpiewanie', '4423423', '43534534', 11);
insert into companies (id, company_name, krs, regon, contact_id) values (12, 'tańczenie', '4423423', '43534534', 12);
insert into companies (id, company_name, krs, regon, contact_id) values (13, 'picie i palenie', '4423423', '43534534', 13);
insert into companies (id, company_name, krs, regon, contact_id) values (14, 'BUD-TRANS usługi transportowe', '4423423', '43534534', 14);
insert into companies (id, company_name, krs, regon, contact_id) values (15, 'tynkarstwo', '4423423', '43534534', 15);
insert into companies (id, company_name, krs, regon, contact_id) values (16, 'tynkarstwo', '4423423', '43534534', 16);
insert into companies (id, company_name, krs, regon, contact_id) values (17, 'tynkarstwo', '4423423', '43534534', 17);
insert into companies (id, company_name, krs, regon, contact_id) values (18, 'tynkarstwo', '4423423', '43534534', 18);
insert into companies (id, company_name, krs, regon, contact_id) values (19, 'tynkarstwo', '4423423', '43534534', 19);
insert into companies (id, company_name, krs, regon, contact_id) values (20, 'tynkarstwo', '4423423', '43534534', 20);
insert into companies (id, company_name, krs, regon, contact_id) values (21, 'tynkarstwo', '4423423', '43534534', 21);
insert into companies (id, company_name, krs, regon, contact_id) values (22, 'tynkarstwo', '4423423', '43534534', 22);


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
insert into categories_companies(company_id, category_id) values (8,4);
insert into categories_companies(company_id, category_id) values (9,4);
insert into categories_companies(company_id, category_id) values (10,4);
insert into categories_companies(company_id, category_id) values (11,4);
insert into categories_companies(company_id, category_id) values (12,4);
insert into categories_companies(company_id, category_id) values (13,4);
insert into categories_companies(company_id, category_id) values (14,4);
insert into categories_companies(company_id, category_id) values (15,4);
insert into categories_companies(company_id, category_id) values (16,4);
insert into categories_companies(company_id, category_id) values (17,4);
insert into categories_companies(company_id, category_id) values (18,4);
insert into categories_companies(company_id, category_id) values (19,4);
insert into categories_companies(company_id, category_id) values (20,4);
insert into categories_companies(company_id, category_id) values (21,4);
insert into categories_companies(company_id, category_id) values (22,4);