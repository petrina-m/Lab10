DROP TABLE movies CASCADE CONSTRAINTS
/
DROP TABLE genres CASCADE CONSTRAINTS
/
DROP TABLE associative CASCADE CONSTRAINTS
/

CREATE TABLE movies{
	id INT NOT NULL PRIMARY KEY;
	title VARCHAR(25) NOT NULL;
	realease_date DATE;
	duration INT;
	score INT;
}S
/
CREATE TABLE genres{
	id INT NOT NULL PRIMARY KEY;
	nume VARCHAR(20) NOT NULL;

}
/
CREATE TABLE associative{
	id_movie INT NOT NULL;
	id_genre INT NOT NULL;
	CONSTRAINT fk_ea_id_movie FOREIGN KEY (id_movie) REFERENCES movies(id),
	CONSTRAINT fk_ea_id_genre FOREIGN KEY (id_genre) REFERENCES genres(id),
	CONSTRAINT uni UNIQUE(id_artist, id_melodie)


}
