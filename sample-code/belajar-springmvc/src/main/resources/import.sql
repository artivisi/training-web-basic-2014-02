-- sample user 
insert into m_user (id,username,fullname,email) values ('endy', 'endy', 'Endy Muhardin', 'endy@artivisi.com');
insert into m_user (id,username,fullname,email) values ('dadang', 'dadang', 'Dadang Iswan', 'dadang@artivisi.com');
insert into m_user (id,username,fullname,email) values ('adi', 'adi', 'Adi Sulistiono', 'adi@artivisi.com');
insert into m_user (id,username,fullname,email) values ('adi1', 'adi1', 'Adi Sulistiono', 'adi1@artivisi.com');
insert into m_user (id,username,fullname,email) values ('adi2', 'adi2', 'Adi Sulistiono', 'adi2@artivisi.com');
insert into m_user (id,username,fullname,email) values ('adi3', 'adi3', 'Adi Sulistiono', 'adi3@artivisi.com');
insert into m_user (id,username,fullname,email) values ('adi4', 'adi4', 'Adi Sulistiono', 'adi4@artivisi.com');
insert into m_user (id,username,fullname,email) values ('adi5', 'adi5', 'Adi Sulistiono', 'adi5@artivisi.com');
insert into m_user (id,username,fullname,email) values ('adi6', 'adi6', 'Adi Sulistiono', 'adi6@artivisi.com');
insert into m_user (id,username,fullname,email) values ('adi7', 'adi7', 'Adi Sulistiono', 'adi7@artivisi.com');
insert into m_user (id,username,fullname,email) values ('adi8', 'adi8', 'Adi Sulistiono', 'adi8@artivisi.com');
insert into m_user (id,username,fullname,email) values ('adi9', 'adi9', 'Adi Sulistiono', 'adi9@artivisi.com');
insert into m_user (id,username,fullname,email) values ('adi0', 'adi0', 'Adi Sulistiono', 'adi0@artivisi.com');
insert into m_user (id,username,fullname,email) values ('adi12', 'adi12', 'Adi Sulistiono', 'adi12@artivisi.com');
insert into m_user (id,username,fullname,email) values ('adi13', 'adi13', 'Adi Sulistiono', 'adi13@artivisi.com');
insert into m_user (id,username,fullname,email) values ('adi14', 'adi14', 'Adi Sulistiono', 'adi14@artivisi.com');
insert into m_user (id,username,fullname,email) values ('adi15', 'adi15', 'Adi Sulistiono', 'adi15@artivisi.com');

-- sample role
insert into m_roles(roles_id, role_name) values('r1','host');
insert into m_roles(roles_id, role_name) values('r2','administrator');
insert into m_roles(roles_id, role_name) values('r3','agent');

-- sample role user
insert into m_user_roles(user_id, roles_id) values ('endy','r3');
insert into m_user_roles(user_id, roles_id) values ('dadang','r2');
insert into m_user_roles(user_id, roles_id) values ('adi','r2');
insert into m_user_roles(user_id, roles_id) values ('adi','r1');

-- sample menu
insert into m_menu (menu_id, menu_name, menu_description, create_by, create_date) value ('aaaa-bbbb-cccc-dddd', 'Login', 'First Page', 'John', NOW());
insert into m_menu (menu_id, menu_name, menu_description, create_by, create_date) value ('eeee-ffff-gggg-hhhh', 'Home', 'Second Page', 'John', NOW());
insert into m_menu (menu_id, menu_name, menu_description, create_by, create_date) value ('iiii-jjjj-kkkk-llll', 'Report', 'Third Page', 'John', NOW());

-- sample news
insert into m_news (newsId,news_code,news_createdate,news_createuser,news_date,news_desc) values ('1', '001', '2014-06-11', 'FERRY','2014-06-09','TRAINING DAYS 1 CUI');
insert into m_news (newsId,news_code,news_createdate,news_createuser,news_date,news_desc) values ('2', '002', '2014-06-11', 'DANNY','2014-06-10','TRAINING DAYS 2 CUI');
insert into m_news (newsId,news_code,news_createdate,news_createuser,news_date,news_desc) values ('3', '003', '2014-06-11', 'IMMAN','2014-06-11','TRAINING DAYS 3 CUI');
insert into m_news (newsId,news_code,news_createdate,news_createuser,news_date,news_desc) values ('4', '004', '2014-06-11', 'KENNY','2014-06-12','TRAINING DAYS 4 CUI');
insert into m_news (newsId,news_code,news_createdate,news_createuser,news_date,news_desc) values ('5', '005', '2014-06-11', 'SUGAN','2014-06-12','TRAINING DAYS 5 CUI');
-- sample general info
insert into m_general_info (infoid,infoname,infolink) values ('endy', 'endy', 'sample info link endy');
insert into m_general_info (infoid,infoname,infolink) values ('dadang', 'dadang', 'sample info link dadang');
insert into m_general_info (infoid,infoname,infolink) values ('adi', 'adi', 'sample info link adi');

-- sample user activity
insert into user_activity(activity_id, user_id, user_activity, activity_date) values('1', 'adi', 'login', '2014-06-11 17:00:00');
insert into user_activity(activity_id, user_id, user_activity, activity_date) values('2', 'adi', 'news', '2014-06-11 18:00:00');
insert into user_activity(activity_id, user_id, user_activity, activity_date) values('3', 'dadang', 'general_info', '2014-06-22 15:00:00');
-- sample user password
insert into m_user_password(user_id,user_password) values ('endy', '123');
insert into m_user_password(user_id,user_password) values ('dadang', '123');
insert into m_user_password(user_id,user_password) values ('adi', '123');