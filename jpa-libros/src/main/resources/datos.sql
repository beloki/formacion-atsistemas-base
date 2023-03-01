INSERT INTO public.autores (nombre) VALUES
	 ('JRR Tolkien'),
	 ('Brandon Sanderson'),
	 ('Santiago Posteguillo'),
	 ('Ana Alonso'),
	 ('Alfred Lansing'),
	 ('Roberto Martinez Guzman'),
	 ('Javier Cercas'),
	 ('Jose Manuel Sanchez'),
	 ('Isaac Asimov');
	 
INSERT INTO public.generos (nombre) VALUES
	 ('Fantasía'),
	 ('Novela Histórica'),
	 ('Ciencia Ficción'),
	 ('Ensayo'),
	 ('Infantil'),
	 ('Novela Negra');
	 
INSERT INTO public.libros (titulo,isbn,id_genero,id_autor,anno_publicacion) VALUES
	 ('El señor de los anillos: La comunidad del anillo','111111',1,1,1954),
	 ('El castillo de Barbazul: Terra Alta III','111111',6,7,2022),
	 ('Jazz Cafe','111111',6,8,2015),
	 ('El camino de los reyes','111111',1,2,2010),
	 ('El robo del siglo','111111',5,4,2018),
	 ('Circo Máximo','111111',2,3,2013),
	 ('Endurance. El Legendario Viaje De Shackleton Al Polo Sur','111111',4,5,2015),
	 ('La fundación','111111',3,9,1942),
	 ('La suerte del los idiotas','111111',6,6,2019),
	 ('El señor de los anillos: Las dos torres','111111',1,1,1954),
	 ('Terra Alta','111111',6,7,2019),
	 ('El imperio final','111111',1,2,2006);

INSERT INTO public.perfil (codigo,descripcion) VALUES
	 ('ADMIN','Administrador del sistema'),
	 ('GESTOR_CUENTAS','Gestor de cuentas'),
	 ('VISUALIZADOR_P2','Visualizador P2'),
	 ('GESTOR_NEGOCIO','Gestor de negocio'),
	 ('VISUALIZADOR_P1','Visualizador P1');

INSERT INTO public.usuario (codigo,fecha_alta,fecha_baja) VALUES
	 ('pedro','2022-03-14 19:22:56.031913',NULL),
	 ('ana','2022-03-14 19:22:56.04085',NULL),
	 ('julia','2022-03-14 19:22:56.046096',NULL),
	 ('antonio','2022-03-14 19:22:56.050344',NULL);

INSERT INTO public.usuario_perfil (id_usuario,id_perfil) VALUES
	 (1,2),
	 (1,3),
	 (2,1),
	 (3,4),
	 (3,2),
	 (4,5),
	 (4,3);
	 
INSERT INTO public.estanterias (codigo_pasillo,codigo_estanteria,nombre) VALUES
	 ('1','A','Estantería 1A'),
	 ('1','B','Estantería 1B'),
	 ('1','C','Estantería 1C'),
	 ('2','A','Estantería 2A'),
	 ('2','B','Estantería 2B'),
	 ('2','C','Estantería 2C');


INSERT INTO public.pasillos (codigo_pasillo,nombre) VALUES
	 ('1','Pasillo 1'),
	 ('2','Pasillo 2');