INSERT INTO tb_user (name, email, password) VALUES ('Joselito', 'joselito@mail.com', '$2y$12$qHwKy.wfRq6Mh6rOib5zsetInBP636DmuIiHlZkyIHrxKQoTddbfG');
INSERT INTO tb_user (name, email, password) VALUES ('Leia Vermelho', 'leiav@mail.com', '$2a$10$lZXlkBqX4unyZUFfKVpck.DeNgEuf9M.BywmAv/g./Oo4if.8lpg6');

INSERT INTO tb_role (role_name) VALUES ('ROLE_OPERATOR');
INSERT INTO tb_role (role_name) VALUES ('ROLE_ADMIN');

INSERT INTO tb_user_role (user_id, role_id) VALUES (1, 1);
INSERT INTO tb_user_role (user_id, role_id) VALUES (2, 1);
INSERT INTO tb_user_role (user_id, role_id) VALUES (2, 2);
