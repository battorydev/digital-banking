
# Setting up database
1. Open terminal (bash) 
2. Run `docker-compose up`
3. Create a new database in your mysql server called `springboot`:
```sql
CREATE DATABASE springboot CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;
```
4. Initial schema and mock data:
```shell
./mock_data/init_mock_data.sh
```
5. Stop all containers:
```shell
docker-compose down
```

# How to run the application
```shell
docker build -t digital-banking .
```

```shell
docker-compose up
```

# Swagger UI
http://localhost:8080/swagger-ui/index.html

# Testing
```shell
./gradlew clean test
```
