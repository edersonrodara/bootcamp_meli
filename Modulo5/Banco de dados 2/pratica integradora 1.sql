SELECT s.title, g.name FROM series as s INNER JOIN genres as g ON s.genre_id = g.id;
SELECT * FROM actors;
SELECT a.first_name, a.last_name, e.title FROM actor_episode as ae INNER JOIN actors as a ON ae.actor_id = a.id INNER JOIN episodes as e ON ae.episode_id = e.id;
SELECT ser.title, count(serie_id) as "qntd temporadas" FROM seasons as sea INNER JOIN series as ser ON sea.serie_id = ser.id GROUP BY serie_id;
SELECT g.name, count(g.id) as qntd_genero FROM movies as m INNER JOIN genres as g ON m.genre_id = g.id GROUP BY genre_id HAVING qntd_genero >= 3;
SELECT DISTINCT a.first_name, a.last_name FROM movies as m INNER JOIN actor_movie AS am ON am.movie_id = m.id INNER JOIN actors AS a ON a.id = am.actor_id WHERE m.title LIKE "la%";