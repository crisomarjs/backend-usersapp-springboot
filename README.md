# 👥 Backend - UsersApp (Spring Boot)

Este es el **backend** del proyecto **UsersApp**, desarrollado con **Spring Boot**.
Su propósito es gestionar usuarios y exponer un **API REST** para ser consumida por un frontend en **React + Vite + TypeScript**.

## 🚀 Tecnologías utilizadas

* ☕ Java 17
* 🍃 Spring Boot 3
* 📦 Maven
* 🗄️ Spring Data JPA
* 🐘 Base de datos relacional (MySQL)

## 📂 Estructura del proyecto

* `controllers/` → Controladores REST que manejan las peticiones
* `models/entities/` → Entidades de la base de datos
* `repositories/` → Interfaces de persistencia con Spring Data JPA
* `services/` → Lógica de negocio

## ⚙️ Configuración

En el archivo `application.properties`, configurar la conexión a la base de datos:

```properties
spring.datasource.url=jdbc:url_mysql
spring.datasource.username=tu_usuario
spring.datasource.password=tu_password
```

## 🔗 Repositorios relacionados

- [Frontend - React + TS](https://github.com/crisomarjs/frontend-usersapp)
- [Backend - Spring Boot](https://github.com/crisomarjs/backend-usersapp-springboot)
