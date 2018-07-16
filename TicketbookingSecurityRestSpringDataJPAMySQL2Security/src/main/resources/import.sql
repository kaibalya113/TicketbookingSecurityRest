









insert into ticket(ticketid, datetime, name,sstaton, destination) values(1, '2018/12/12','ami','mumbai', 'pune');
insert into ticket(ticketid, datetime, name,sstaton, destination) values(2, '2018/06/03','jipu','mumbai', 'pune');
insert into ticket(ticketid, datetime, name,sstaton, destination) values(3, '2018/06/03','mama','goa', 'pune');
insert into ticket(ticketid, datetime, name,sstaton, destination) values(4, '2018/06/03','jayakrushna','bhubaneswar', 'pune');
insert into ticket(ticketid, datetime, name,sstaton, destination) values(5, '2018/06/03','sujata','mumbai', 'bhubaneswar');
insert into ticket(ticketid, datetime, name,sstaton, destination) values(6, '2018/06/03','krishna','mumbai', 'delhi');

insert into ticket(ticketid, datetime, name,sstaton, destination) values(7, '2018/06/03','kaibalya','cuttack', 'bhubaneswar');
insert into ticket(ticketid, datetime, name,sstaton, destination) values(8, '2018/06/03','rita','thane', 'andheri');
insert into ticket(ticketid, datetime, name,sstaton, destination) values(9, '2018/06/03','nita','bhosari', 'pimpri');
insert into ticket(ticketid, datetime, name,sstaton, destination) values(10, '2018/06/03','deabsis','bangalora', 'pune');
insert into ticket(ticketid, datetime, name,sstaton, destination) values(11, '2018/06/03','sibasis','mumbai', 'bangalore');
insert into ticket(ticketid, datetime, name,sstaton, destination) values(12, '2018/06/03','amrita','mumbai', 'pune');
insert into ticket(ticketid, datetime, name,sstaton, destination) values(13, '2018/12/12','nitu','mumbai', 'pune');
insert into ticket(ticketid, datetime, name,sstaton, destination) values(14, '2018/12/12','namrata','mumbai', 'pune');
insert into ticket(ticketid, datetime, name,sstaton, destination) values(15, '2018/12/12','null','mumbai', 'pune');











create table users(name varchar(10), password varchar(20), enabled tinyint not null default 1, primary key(name));

create table roles(role_id int(11) not null auto_increment, name varchar(10), role varchar(10), primary key(role_id), unique key uni_name_role(role,name), key fk_name_idx(name), constraint fk_name foreign key(name) references users(name));


insert into users(name , password, enabled) values('krishna', '123', true);


insert into roles(name, role) values ('krishna' , 'ROLE_ADMIN');



