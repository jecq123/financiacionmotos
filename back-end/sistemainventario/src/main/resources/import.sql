INSERT INTO producto (idproducto,nombre,codigo,activo) values (1,'Boxer CT 2022','001',true)
INSERT INTO producto (idproducto,nombre,codigo,activo) values (2,'Dominar 300','002',true)

INSERT INTO inventario (idinventario,idproducto,cantidad) values (1,1,100)
INSERT INTO inventario (idinventario,idproducto,cantidad) values (2,2,100)


INSERT INTO usuario (id_usuario,nombre_usuario, password, enabled ) values (1,'juan','$2a$10$LXvl9cEhPNTO9pX9ApvPG.sPlrm0LuvxHDLmmw8gMFE6BZiwGCwhO', true)
INSERT INTO usuario (id_usuario,nombre_usuario, password, enabled ) values (2,'juanes','$2a$10$67.bRA3bwhfWYIixkwZl3O/KzLjUB8jzQH7azaAVZ.nKf488wAM5q', true)
INSERT INTO usuario (id_usuario,nombre_usuario, password, enabled ) values (3,'admin','$2a$10$Tl2wElm/nFoyF0BzQLTaC.5qchC2JEFRUKyZ6Ssasp6ALgE/SGiie', true)
INSERT INTO usuario (id_usuario,nombre_usuario, password, enabled ) values (4,'guest','$2a$10$Cb7zIyAbG5koPgzCU0GRmOMce8ZteSDelruH5vAhSrZE53rBxVLfq', true)

INSERT INTO roles (id_rol,nombre_rol) values (1,'ROLE_ADMIN')
INSERT INTO roles (id_rol,nombre_rol) values (2,'ROLE_CONSULTA')
INSERT INTO users_authorities (id_usuario, id_rol ) values (1,1)
INSERT INTO users_authorities (id_usuario, id_rol ) values (2,2)
INSERT INTO users_authorities (id_usuario, id_rol ) values (3,1)
INSERT INTO users_authorities (id_usuario, id_rol ) values (4,2)	

INSERT INTO moto (referencia,marca, modelo, cilindraje, precio ) values('Pulsar NS200', 'Bajaj', 2022, 200, 10400000)
INSERT INTO moto (referencia,marca, modelo, cilindraje, precio ) values('AX4', 'Susuki', 2022, 115, 5300000)

INSERT INTO cliente (identificacion, nombrecompleto, contacto, correo, residencia) values ('1007334302', 'Brayan Estiven Sepulveda Quintero', '320 864 91 85', 'brayan.sepulveda4302@soyuco.edu.co', 'Marinilla')

INSERT INTO vendedor (identificacion, nombrecompleto, contacto, correo, residencia) values ('1007334302', 'Brayan Estiven Sepulveda Quintero', '320 864 91 85', 'brayan.sepulveda4302@soyuco.edu.co', 'Marinilla')