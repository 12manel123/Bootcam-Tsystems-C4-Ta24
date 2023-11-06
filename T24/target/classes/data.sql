DROP table IF EXISTS empleado;

create table empleado(
    id int auto_increment PRIMARY KEY,
    nombre varchar(250) NOT NULL,
    apellido varchar(250) NOT NULL,
    trabajo ENUM('Carpintero', 'Paleta', 'Programador', 'Profesor') NOT NULL,
    salario int NOT NULL
);

INSERT INTO empleado (nombre, apellido, trabajo, salario) VALUES ('Juan', 'Pérez', 'Carpintero', 35000);
INSERT INTO empleado (nombre, apellido, trabajo, salario) VALUES ('María', 'López', 'Paleta', 40000);
INSERT INTO empleado (nombre, apellido, trabajo, salario) VALUES ('Pedro', 'González', 'Programador', 45000);
INSERT INTO empleado (nombre, apellido, trabajo, salario) VALUES ('Ana', 'Martínez', 'Profesor', 50000);
