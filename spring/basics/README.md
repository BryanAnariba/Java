## Pasos VSCode

1. ctrl + shift + p => Spring initalizr: create maven project
2. select version of spring
3. Select Java
4. Write Group Id: com.bs.webapp
5. Write Artifact Id: spring-web-app
6. Select: Jar
7. Select version: 17
8. Select Extentions, by default: Spring Web, Spring Boot DevTools, Thymeleaf

## Pasos Spring Initialzer: https://start.spring.io/

## Generar el build de produccion como en node
1. ./mvnw clean package
2. Entrar a target con cd ./target
3. Seleccionar el archivo .jar => java -jar ./nombre-proyecto-0.0.1-SNAPSHOT.jar
