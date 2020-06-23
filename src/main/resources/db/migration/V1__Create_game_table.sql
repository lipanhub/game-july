CREATE TABLE `game`
(
    `id`          bigint(16) NOT NULL AUTO_INCREMENT,
    `request`   varchar(16)   NOT NULL,
    `answer` varchar(16) NOT NULL,
    `victory` tinyint(1) NOT NULL,
    `gmt_create` bigint(32) NOT NULL,
    PRIMARY KEY (`id`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8;
