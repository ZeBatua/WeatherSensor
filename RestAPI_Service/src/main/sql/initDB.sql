CREATE TABLE Sensor (
    id int PRIMARY KEY GENERATED ALWAYS AS IDENTITY,
    name varchar(200) NOT NULL UNIQUE
);

CREATE TABLE Measurements (
    id int PRIMARY  KEY GENERATED ALWAYS AS IDENTITY,
    temperature double precision NOT NULL,
    rain_status boolean NOT NULL,
    measurement_time timestamp NOT NULL,
    sensor varchar(100) references Sensor(name)
);
