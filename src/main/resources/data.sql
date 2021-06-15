DROP TABLE IF EXISTS students;

CREATE TABLE students (
                              id INT AUTO_INCREMENT  PRIMARY KEY,
                              name VARCHAR(250) NOT NULL
);
insert into students values (1,'ciccio'),(2,'mario'),(3,'pasquale');