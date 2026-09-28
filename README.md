# 🎓 CampusFlow - Sistema de Gestión Académica y Pagos

## 📌 Sobre el Proyecto

**CampusFlow** es un proyecto de aprendizaje enfocado en arquitectura de software y desarrollo backend con **Java y Spring Boot**, diseñado como parte del programa Java AI de Devsenior.

El proyecto aborda el reto de escalar la gestión académica (de 40 estudiantes a 20 academias), resolviendo la complejidad de modificar flujos de pago y suscripciones sin acoplar ni desordenar las reglas de dominio de usuarios y cursos.

---

## 🏗️ Enfoque Arquitectónico

- **Diseño Modulado por Negocio:** Organización del código delimitando responsabilidades por contexto para evitar el acoplamiento entre perfiles, suscripciones y pagos.
- **Control de Dependencias:** Estrategias de aislamiento para garantizar que los cambios en las reglas de facturación no afecten la gestión académica.
- **Evolución Progresiva:** Construcción desde el listado y gestión base de usuarios hasta un ecosistema completo con autenticación y persistencia.

---

## 🛠️ Stack Tecnológico

- **Lenguaje:** Java 17+
- **Framework:** Spring Boot 3
- **Persistencia y BD:** Spring Data JPA, MySQL
- **Seguridad y Documentación:** JWT (JSON Web Tokens), Swagger / OpenAPI
- **Linter y Herramientas:** Maven, Git

---

## 🚀 Módulos del Sistema

- 👤 **Usuarios y Perfiles:** Control de accesos y roles académicos.
- 📚 **Gestión Académica:** Estructura de cursos y academias.
- 💳 **Pagos y Suscripciones:** Módulo independiente para transacciones y control de planes.