# MonolithicQuizAppUsingSpringBoot

1) This is a quiz app using SpringBoot which is based on Monolithic Architecture. In this app MySQL is used for database and a table is created as described below.
+-----------------+--------------+------+-----+---------+----------------+
| Field           | Type         | Null | Key | Default | Extra          |
+-----------------+--------------+------+-----+---------+----------------+
| id              | int          | NO   | PRI | NULL    | auto_increment |
| question_title  | varchar(100) | YES  |     | NULL    |                |
| option1         | varchar(50)  | YES  |     | NULL    |                |
| option2         | varchar(50)  | YES  |     | NULL    |                |
| option3         | varchar(50)  | YES  |     | NULL    |                |
| option4         | varchar(50)  | YES  |     | NULL    |                |
| right_answer    | varchar(50)  | YES  |     | NULL    |                |
| difficultylevel | varchar(20)  | YES  |     | NULL    |                |
+-----------------+--------------+------+-----+---------+----------------+