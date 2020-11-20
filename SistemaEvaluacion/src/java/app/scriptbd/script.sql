create database evaluacion;
/**********TABLAS**********/
create table usuario(
id_usuario INT NOT NULL AUTO_INCREMENT,
usuario VARCHAR(50) NOT NULL,
pass VARCHAR(50) NOT NULL,
tipo VARCHAR(50), NOT NULL,
PRIMARY KEY (id_usuario)
);
/*FALTA CREAR*/
create table Examen(
id_examen int NOT NULL AUTO_INCREMENT,
materia VARCHAR,
tema VARCHAR,
fecha DATE,
PRIMARY KEY (id_examen),
FOREIGN KEY (id_usuario) REFERENCES usuario(id_usuario)
);
/*FALTA CREAR*/
create table pregunta(
id_pregunta INT NOT NULL AUTO_INCREMENT,
respuesta VARCHAR(255) NOT NULL,
palabra VARCHAR(255) NOT NULL.
porcentaje DOUBLE NOT NULL,
id_examen INT NOT NULL,
PRIMARY KEY (id_pregunta),
FOREIGN KEY (id_examen) REFERENCES examen(id_examen)
);
/*FALTA CREAR*/
create table evaluacion(
id_calificacion int NOT NULL AUTO_INCREMENT,
calificacion double NOT NULL,
id_usuario int NOT NULL,
id_examen int NOT NULL,
PRIMARY KEY (id_calificacion),
FOREIGN KEY (id_usuario) REFERENCES usuario(id_usuario),
FOREIGN KEY (id_examen) REFERENCES examen(id_examen)
);


/**********INSERCIONES**********/
INSERT INTO usuario VALUES ("","juan","123","Maestro");
INSERT INTO usuario VALUES ("","paco","456","Alumno");