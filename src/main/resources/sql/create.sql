DROP TABLE IF EXISTS Coordinates
DROP TABLE IF EXISTS Questions

CREATE TABLE Questions
(
    ID      int primary key identity (1,1),
    CONTENT nvarchar(1024) not null,
    ANSWERS nvarchar(max)  not null,
    CORRECT varchar(1)     not null,

    CONSTRAINT [Answers record should be formatted as JSON]
        CHECK (ISJSON(answers) = 1)
)


CREATE TABLE Coordinates
(
    ID          int primary key identity (1,1),
    NAME        varchar(255) not null,
    LON         float        not null,
    LAT         float        not null,
    QUESTION_ID int,

    FOREIGN KEY (QUESTION_ID) references Questions (ID),
);

INSERT INTO Questions (CONTENT, ANSWERS, CORRECT)
VALUES ('Test 123',
        '{"a": "test"}',
        'a')


INSERT INTO Coordinates (NAME, LON, LAT, QUESTION_ID)
VALUES ('Coord name', 19.030259, 49.804172, 1)