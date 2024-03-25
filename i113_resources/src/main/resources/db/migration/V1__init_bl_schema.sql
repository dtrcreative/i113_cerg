create schema if not exists resources;

SET search_path TO resources;

DROP TABLE IF EXISTS languages;

CREATE TABLE IF NOT EXISTS languages
(
    id    SERIAL PRIMARY KEY,
    param VARCHAR(30)  NOT NULL,
    eng   VARCHAR(200) NOT NULL,
    rus   VARCHAR(200) NOT NULL
);

CREATE TABLE IF NOT EXISTS user_settings
(
    id    SERIAL PRIMARY KEY,
    userid INTEGER  NOT NULL

);

CREATE TABLE IF NOT EXISTS users
(
    id    SERIAL PRIMARY KEY,
    userid VARCHAR(200)  NOT NULL
);




