-- sample user 
insert into m_user (id,username,fullname,email) values ('endy', 'endy', 'Endy Muhardin', 'endy@artivisi.com');
insert into m_user_password(user_id,user_password) values ('endy', '123');
insert into m_user (id,username,fullname,email) values ('dadang', 'dadang', 'Dadang Iswan', 'dadang@artivisi.com');
insert into m_user_password(user_id,user_password) values ('dadang', '123');
insert into m_user (id,username,fullname,email) values ('adi', 'adi', 'Adi Sulistiono', 'adi@artivisi.com');
insert into m_user_password(user_id,user_password) values ('adi', '123');

-- sample role
insert into m_roles(roles_id, role_name) values('r1','host');
insert into m_roles(roles_id, role_name) values('r2','administrator');
insert into m_roles(roles_id, role_name) values('r3','agent');

-- sample menu

-- sample news

-- sample general info

-- sample user activity

-- sample user password