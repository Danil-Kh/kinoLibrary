CREATE TABLE IF NOT EXISTS Movies(
    id SERIAL PRIMARY KEY,
    imdb_id VARCHAR(20) NOT NULL,
    title VARCHAR(70)NOT NULL,
    year VARCHAR(10) NOT NULL,
    rated VARCHAR(5) NOT NULL,
    released date NOT NULL,
    runtime VARCHAR(20) NOT NULL,
    genre VARCHAR(50) NOT NULL,
    director VARCHAR(30) NOT NULL,
    writer VARCHAR(50),
    actors VARCHAR(50),
    plot TEXT,
    language VARCHAR(50),
    country VARCHAR(30),
    awards VARCHAR(30),
    poster TEXT,
    type VARCHAR(20),
    box_office varchar(20)
);
CREATE TABLE IF NOT EXISTS Ratings(
    id SERIAL PRIMARY KEY,
    move_id INT NOT NULL REFERENCES Movies(id) ON DELETE CASCADE,
    sourse VARCHAR(20) NOT NULL,
    value VARCHAR(10) NOT NULL,
    metascore varchar(5) NOT NULL,
    imdb_rating varchar(5) NOT NULL,
    imdb_votes varchar(20) NOT NULL
);
CREATE TABLE IF NOT EXISTS Users(
    id SERIAL PRIMARY KEY,
    username VARCHAR(50) NOT NULL ,
    email VARCHAR(50) NOT NULL,
    password VARCHAR(50) NOT NULL
);
CREATE TABLE IF NOT EXISTS UsersMovies(
    movies_id INT,
    users_id INT,
    CONSTRAINT fk_movies_userMovies_id FOREIGN KEY (movies_id) REFERENCES Movies(id) ON DELETE CASCADE,
    CONSTRAINT fk_user_userMovies_id FOREIGN KEY (users_id) REFERENCES Users(id) ON DELETE CASCADE

);


