use java;
DROP TABLE IF EXISTS t_salary;
CREATE TABLE IF NOT EXISTS t_salary(
    user_id VARCHAR(50),
    yearMonth VARCHAR(50),
    salary INT,
    PRIMARY KEY(user_id, yearMonth)
);

INSERT INTO t_salary (user_id,yearMonth,salary)
VALUES('user@co.jp','2020/11',280000),
('user@co.jp','2020/12',290000),
('user@co.jp','2021/01',300000);