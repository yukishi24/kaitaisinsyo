use java;
DROP TABLE IF EXISTS m_user;
CREATE TABLE m_user (
    user_id VARCHAR(50) PRIMARY KEY,
    password VARCHAR(100),
    user_name VARCHAR(50),
    birthday DATE,
    age INT,
    gender INT,
    department_id INT,
    role VARCHAR(50)
);
INSERT INTO m_user (user_id,password,user_name,birthday,age,gender,department_id,role)VALUES('system@co.jp','password','システム管理者','2000-01-01',21,1,1,'ROLE_ADMIN'),
('user@co.jp','password','ユーザー1','2000-01-01',21,1,2,'ROLE_GENERAL');