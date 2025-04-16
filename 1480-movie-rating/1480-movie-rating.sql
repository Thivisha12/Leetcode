-- Get the user who gave the most ratings
(
    SELECT u.name AS results
    FROM users u
    JOIN movierating m ON u.user_id = m.user_id
    GROUP BY u.user_id
    ORDER BY COUNT(m.rating) DESC, u.name ASC
    LIMIT 1
)

UNION ALL

-- Get the movie with the highest average rating in Feb 2020
(
    SELECT mo.title AS results
    FROM movies mo
    JOIN movierating mr ON mo.movie_id = mr.movie_id
    WHERE mr.created_at LIKE '2020-02%'
    GROUP BY mo.movie_id
    ORDER BY AVG(mr.rating) DESC, mo.title ASC
    LIMIT 1
);