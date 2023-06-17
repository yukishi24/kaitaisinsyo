use java;
DROP TABLE IF EXISTS m_department;
CREATE TABLE IF NOT EXISTS m_department (
    department_id INT PRIMARY KEY,
    department_name VARCHAR(50)
);
INSERT INTO m_department (department_id,department_name)VALUES(1,'システム管理部'),
(2,'営業部');