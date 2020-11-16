# enrollment-api
1. Import in your favorite ide as maven project. 
2. I built this using mysql db. 
3. Create a database.
4. Provide newly created database name, username and password in application.properties
5. Run mvn clean install
6. Run EnrollmentApplication.java 

On startup application will create required tables in the provided database.
Example API calls:
Add Enrollee:
curl --location --request POST 'localhost:8080/enrollees' \
--header 'Content-Type: application/json' \
--data-raw '{
    "birthDate": "1990-02-01",
    "name": "Alex",
    "activationStatus": true,
    "phoneNumber": "11151751"
}'

Update enrollee:
curl --location --request PUT 'localhost:8080/enrollees/9' \
--header 'Content-Type: application/json' \
--data-raw '{
    "birthDate": "1990-02-01",
    "name": "Alexandar",
    "activationStatus": false,
    "phoneNumber": ""
}'

Add dependent:
curl --location --request POST 'http://localhost:8080/dependents' \
--header 'Content-Type: application/json' \
--data-raw '{
    "birthDate": "1990-02-01",
    "name": "Alex",
    "enrollee": {
        "href" : "http://localhost:8080/enrollees/9"
    }
    
}'

curl --location --request PUT 'http://localhost:8080/dependents/10/enrollee' \
--header 'Content-Type: text/uri-list' \
--data-raw 'http://localhost:8080/enrollees/9'


Get All Enrollees:
http://localhost:8080/enrollees

Get Enrollee by Id:
http://localhost:8080/enrollees/9

Get All Dependents:
http://localhost:8080/dependents

Get Dependents by Id:
http://localhost:8080/dependents/9



