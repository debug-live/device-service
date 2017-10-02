DROP TABLE IF EXISTS tb_connect_history;

CREATE TABLE `tb_connect_history` (
  `id`         INT PRIMARY KEY AUTO_INCREMENT,
  `device_id`  INT       NOT NULL,
  connect_time TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP
);

DROP TABLE IF EXISTS tb_device;

CREATE TABLE tb_device (
  id         INT PRIMARY KEY AUTO_INCREMENT,
  serial_num VARCHAR(30) NOT NULL UNIQUE,
  model      VARCHAR(2)  NOT NULL
);

ALTER TABLE `tb_connect_history` ADD FOREIGN KEY (id) REFERENCES tb_device (id);