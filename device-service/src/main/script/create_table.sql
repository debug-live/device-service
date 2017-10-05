DROP TABLE IF EXISTS `tb_device`;
CREATE TABLE `tb_device` (
 id int AUTO_INCREMENT PRIMARY KEY,
 serial_num VARCHAR(12) NOT NULL UNIQUE ,
 model VARCHAR(2)
 );

DROP TABLE IF EXISTS `tb_connect_history`;
CREATE TABLE `tb_connect_history` (
 id int AUTO_INCREMENT PRIMARY KEY,
 device_id VARCHAR(12) NOT NULL UNIQUE ,
 connect_time TIMESTAMP
 );

