select* From users;
insert into users (first_name,last_name,email)
values ("ghatih" ,"jridi", "ghaithjridi@gmail.com");
select first_name,email FROM users WHERE id = 1;
select* From users
where email="ghaithjridi@gmail.com";
update users set last_name="pancakes"
where users.id=3;
delete from users
where id=2;
select*from users
order by first_name desc;


