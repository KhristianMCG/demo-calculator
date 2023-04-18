## Demo Calculator

This is a microservice web app and REST Api to simulate simple calculator operations, also is prepare to deploy with containers 
orchestration. 

# Initialization 

mvn springboot:run listening on port 8080 by default

# Usage

Provided two ways to test the calculator, one with controller and user-interface in thymeleaf. 
The other way is pure RESFull API.

## User Interface

Accessing to http://localhost:8080/calculator will show user interface.

## RESTfull API
````
# /calculator/add/{valuea}/{valueb}
````
````
# /calculator/substract/{valuea}/{valueb}
````
````
# /calculator/multiply/{valuea}/{valueb}
````
````
# /calculator/divide/{valuea}/{valueb}
````

## Docker containerization

````
docker build --tag=demo-calculator:latest .
````
````
docker run -p8080:8080 demo-calculator:latest
````

# Notes about improvements

It might be better to use DTOs to transfer values to service, encapsulating them to improve the code. 
