CREATE TABLE IF NOT EXISTS Movies(
                                     movie_id SERIAL PRIMARY KEY,
                                     imdb_id VARCHAR(20) NOT NULL,
                                     title VARCHAR(70)NOT NULL,
                                     year VARCHAR(10) NOT NULL,
                                     rated VARCHAR(5) NOT NULL,
                                     released VARCHAR(20) NOT NULL,
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
                                     imdb_rating varchar(5) NOT NULL,
                                     imdb_votes varchar(20) NOT NULL,
                                     metascore varchar(5) NOT NULL,
                                     box_office varchar(20)
);
CREATE TABLE Ratings (
    rating_id SERIAL PRIMARY KEY,
    source VARCHAR(255) NOT NULL,
    value VARCHAR(255) NOT NULL,
    movie_id INT,
    FOREIGN KEY (movie_id) REFERENCES movies (movie_id) ON DELETE CASCADE
);
CREATE TABLE IF NOT EXISTS Users(
    user_id SERIAL PRIMARY KEY,
    username VARCHAR(50) NOT NULL ,
    email VARCHAR(50) NOT NULL,
    password VARCHAR(50) NOT NULL
);
CREATE TABLE IF NOT EXISTS Users_Movies(
    user_movie_id SERIAL,
    movies_id INT,
    users_id INT,
    status VARCHAR(10) CHECK (status IN ('favorites','Viewed', ('null'))),
    CONSTRAINT fk_movies_userMovies_id FOREIGN KEY (movies_id) REFERENCES Movies(movie_id) ON DELETE CASCADE,
    CONSTRAINT fk_user_userMovies_id FOREIGN KEY (users_id) REFERENCES Users(user_id) ON DELETE CASCADE
);
ALTER TABLE Movies ADD CONSTRAINT uk_movies_imdb_id UNIQUE (imdb_id);

ALTER TABLE Users_Movies drop user_id
ALTER TABLE Users_Movies drop movie_id