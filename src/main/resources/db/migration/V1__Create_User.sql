CREATE TABLE if not exists users.user (
	id varchar(250),
	user_name varchar(250),
	password varchar(250),
	created_at timestamp,
	updated_at timestamp,
	active boolean default true,
	PRIMARY KEY (id)
);