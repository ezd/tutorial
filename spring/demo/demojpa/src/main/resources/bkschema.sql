DROP TABLE IF EXISTS TBL_STUDENTS;
  
CREATE TABLE TBL_STUDENTS (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  fname VARCHAR(250) NOT NULL,
  lname VARCHAR(250) NOT NULL,
  email VARCHAR(250) DEFAULT NULL
);