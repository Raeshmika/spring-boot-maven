CREATE TABLE team (team_id serial primary key, team_name varchar(100) not null);
CREATE TABLE developer(developer_id serial primary key, team_id integer, name character varying(100), phone_number character varying(100)
foreign key team_id references team(team_id));
