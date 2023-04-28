set serveroutput on;

CREATE TABLE albums (
    id number unique,
    release_year number,
    title varchar(30),
    artist varchar(20),
    genre varchar(20)
);

CREATE TABLE artists (
    id number unique,
    name varchar(30)
);

CREATE TABLE genres (
    id number unique,
    name varchar(20)
);

CREATE TABLE album_genre (
    album_id number,
    genre_id number,
    FOREIGN KEY (album_id) REFERENCES albums(id),
    FOREIGN KEY (genre_id) REFERENCES genres(id)
);

drop table albums;
drop table artists;
drop table genres;
drop table album_genre;

insert into albums values(1, 2021, 'The Nightmare of Being', 'At the Gates', 'Death Metal');
insert into albums values(2, 2020, 'Unconquered', 'Kataklysm', 'Death Metal');
insert into albums values(3, 2004, 'Asfalt', 'Luna Amara', 'Rock');
insert into albums values(4, 2022, 'Her Loss', 'Drake','Rap'); 

insert into artists values(1,'At the Gates');
insert into artists values(2,'Kataklysm');
insert into artists values(3,'Luna Amara');
insert into artists values(4,'Drake');

insert into genres values(1, 'Death Metal');
insert into genres values(2, 'Rock');
insert into genres values(3, 'Rap');

insert into album_genre values (1,1);
insert into album_genre values(2,1);
insert into album_genre values (3,2);
insert into album_genre values (4,3);

select * from albums;
