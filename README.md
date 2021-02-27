## Service Name: `svc-inventory`

## Docker Build and Deploy
 use link to build the docker file [Spring Boot Docker](https://spring.io/guides/topicals/spring-boot-docker/)
```
docker build -t techarha/svc-inventory .
docker run -p 8081:8081 --network=manin-backend techarha/svc-inventory
```
