USE java;
DROP TABLE IF EXISTS employee;
CREATE TABLE employee (
  id VARCHAR(50) PRIMARY KEY,
  name VARCHAR(50),
  age INT
);
INSERT INTO employee (id,name,age)VALUES('1','Tom',30);