CREATE TABLE accounts (
    id serial PRIMARY KEY,
    password VARCHAR ( 50 ) UNIQUE NOT NULL,
    email VARCHAR ( 255 ) UNIQUE NOT NULL,
    created_on TIMESTAMP NOT NULL,
    last_login TIMESTAMP NOT NULL
);

CREATE TABLE users (
    id INT UNIQUE NOT NULL,
    name VARCHAR(120) NOT NULL,
    surname VARCHAR(120) NOT NULL,
    lastname VARCHAR(120),
    date_of_birth DATE NOT NULL,
    card VARCHAR(16) UNIQUE,
    account_id INT UNIQUE NOT NULL,
    FOREIGN KEY (account_id)
        REFERENCES accounts (id)
);

CREATE TABLE planes (
    id serial PRIMARY KEY,
    company VARCHAR(40) NOT NULL,
    number VARCHAR(50) UNIQUE NOT NULL
);

CREATE TABLE races (
    id serial PRIMARY KEY,
    plane_id INT NOT NULL,
    takeoff_time DATE NOT NULL,
    landing_time DATE NOT NULL,
    delay TIMESTAMP,
    number_of_tickets INT NOT NULL
);

CREATE TABLE tickets (
    id serial PRIMARY KEY,
    code VARCHAR(80) UNIQUE NOT NULL,
    race_id INT NOT NULL,
    user_id INT NOT NULL,
    FOREIGN KEY (race_id)
      REFERENCES races (id),
    FOREIGN KEY (user_id)
      REFERENCES users (id)
);

CREATE TABLE seats (
    id serial PRIMARY KEY,
    plane_id INT UNIQUE NOT NULL,
    number VARCHAR(50) NOT NULL,
    ticket_id INT UNIQUE NOT NULL,
    vip BIT NOT NULL
);

ALTER TABLE seats ADD CONSTRAINT FK_tickets_seats FOREIGN KEY(ticket_id) REFERENCES tickets(id);
ALTER TABLE seats ADD CONSTRAINT FK_planes_seats FOREIGN KEY(plane_id) REFERENCES planes(id);