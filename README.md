API REST de Productos
Descripción

Este proyecto es una API REST desarrollada con Java y Spring Boot, que permite gestionar productos (crear y consultar) utilizando una base de datos MySQL.
La aplicación está contenida en Docker para facilitar su ejecución en cualquier entorno.

Tecnologías utilizadas

Java 17

Spring Boot

Spring Data JPA

MySQL 8

Maven

Docker

Docker Compose

Estructura del proyecto

src/main/java

controllers → Controladores de la API

entities → Entidades de la base de datos

repositories → Acceso a datos

ApirestApplication → Clase principal de la aplicación

Endpoints disponibles
Obtener todos los productos

GET /productos

Ejemplo de respuesta:

[
{
"id": 1,
"nombre": "Laptop",
"precio": 1200
}
]

Crear un producto

POST /productos

Body JSON:

{
"nombre": "celular",
"precio": 800
}

Cómo ejecutar el proyecto
1 Clonar el repositorio

git clone https://github.com/Scott-Aazofeifa/api-rest-productos.git

2 Entrar al proyecto

cd api-rest-productos

3 Ejecutar con Docker

docker compose up --build

4 Probar la API

Abrir en el navegador o en Postman:

http://localhost:8080/productos

Base de datos

El proyecto utiliza MySQL 8 ejecutándose en un contenedor Docker.

Autor

Scott Aazofeifa
