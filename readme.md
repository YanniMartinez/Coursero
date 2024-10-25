# Hi there here you can find all the documentation needed to run this project, back and front-end

## Technology stack:

Backend:
* JAVA
* Spring Boot
* JPA
* Loombok

Front:
* TypeScript
* REACT
* Redux

Others:
* Docker
* GraphQL
* Postgres
* UNIX

## Instance Docker DB
1. Verify that you have installer docker hub in your system
2. Move to this folder ./
3. Run the command `docker compose up` It will take some minutes depending of your network speed.
4. Validate if your don't have any kind of errors.

### Validate DB conexion
User any kind of DB visualizer.

Use below config to connect:

```

Host: localhost
port: 5432
user: postgres
password: 123456  (as specified in docker-compose.yml)
database: 

```

## Run backend
Open project in IntelliJ Idea or something similar

## Run front-end
yarn start 