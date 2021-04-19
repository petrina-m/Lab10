DROP TABLE movies 
/
DROP TABLE genres
/
DROP TABLE associative CASCADE CONSTRAINTS
/

CREATE TABLE movies(
	id INT NOT NULL PRIMARY KEY,
	title VARCHAR(25) NOT NULL,
	realease_date DATE,
	duration INT,
	score FLOAT
);
/
CREATE TABLE genres(
	id INT NOT NULL PRIMARY KEY,
	nume VARCHAR(20) NOT NULL
);
/
CREATE TABLE associative(
	id_movie INT NOT NULL,
	id_genre INT NOT NULL,
	CONSTRAINT fk_ea_id_movie FOREIGN KEY (id_movie) REFERENCES movies(id),
	CONSTRAINT fk_ea_id_genre FOREIGN KEY (id_genre) REFERENCES genres(id)
);
/
CREATE TABLE actors(
	id INT NOT NULL PRIMARY KEY,
	nume VARCHAR(20) NOT NULL
);
/
CREATE TABLE directors(
	id INT NOT NULL PRIMARY KEY,
	nume VARCHAR(20) NOT NULL
);
/
CREATE TABLE movie_actor(
	id_movie INT NOT NULL,
	id_actor INT NOT NULL,
	CONSTRAINT fk_ea_id_movie FOREIGN KEY (id_movie) REFERENCES movies(id),
	CONSTRAINT fk_ea_id_actor FOREIGN KEY (id_actor) REFERENCES actors(id)
);
/
CREATE TABLE movie_director(
	id_movie INT NOT NULL,
	id_director INT NOT NULL,
	CONSTRAINT fk_ea_id_movie FOREIGN KEY (id_movie) REFERENCES movies(id),
	CONSTRAINT fk_ea_id_director FOREIGN KEY (id_director) REFERENCES directors(id)
);
/


