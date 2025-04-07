
# Setting up database
1. Open terminal (bash) 
2. Run `docker-compose up`
3. `docker exec -it digital-banking-db-1 mysql -uroot -ppassword`
4. Create a new database in your mysql server called `springboot`:
```sql
CREATE DATABASE springboot CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;
```
5. Open new terminal
6. Copy from mock_data directory to `mock_data/`
7. Initial schema and mock data:
```shell
./mock_data/init_mock_data.sh
```
8. Stop all containers:
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
This will run all the tests in the project and generate a test report.  
You can check code coverage report (jacoco) in `build/reports/jacoco/test/html/index.html`

If the code coverage is 0%, you might need to run `docker-compose up` again to start the database container.  
Then run `./gradlew clean test` again to generate the code coverage report.