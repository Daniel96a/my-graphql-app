CREATE TABLE User
(
    id INT AUTO_INCREMENT PRIMARY KEY NOT NULL,
    firstname VARCHAR(30) NOT NULL,
    lastname VARCHAR(30) NOT NULL,
    ssn VARCHAR(12) NOT NULL UNIQUE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 AUTO_INCREMENT=1;

