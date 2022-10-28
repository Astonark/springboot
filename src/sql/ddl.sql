CREATE EXTENSION IF NOT EXISTS "uuid-ossp";

CREATE TABLE author(
    id UUID NOT NULL,
    first_name VARCHAR(255) NOT NULL,
    last_name VARCHAR(255) NOT NULL,
    birthdate DATE,

    PRIMARY KEY (id)
);

CREATE TABLE book(
    id UUID NOT NULL,
    author_id UUID NOT NULL,
    title VARCHAR(255) NOT NULL,

    PRIMARY KEY (id),
    FOREIGN KEY (author_id) REFERENCES author(id)
);

INSERT INTO  author (id, first_name, last_name, birthdate)
VALUES (uuid_generate_v4(), 'Terry', 'Pratchett', '1948-04-28'),
       (uuid_generate_v4(), 'Jean-Philippe', 'Jaworski', '1969-01-01');

INSERT INTO book (id, author_id, title)
VALUES (uuid_generate_v4(), (SELECT id FROM author WHERE last_name = 'Pratchett'), 'Mortimer'),
       (uuid_generate_v4(), (SELECT id FROM author WHERE last_name = 'Pratchett'), 'Les Petits Dieux'),
       (uuid_generate_v4(), (SELECT id FROM author WHERE last_name = 'Jaworski'), 'Gagner la Guerre');