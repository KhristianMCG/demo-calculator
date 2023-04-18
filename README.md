## Demo Calculator

This is a microservice web app and REST Api to simulate simple calculator operations.

# Initialization 

mvn springboot:run listening on port 8080 by default

# Usage

Is provided two ways to test the calculator, one with controller and user-interface in thymeleaf. 
The other way is pure RESTfull API.

## User Interface

Accesing to http://localhost:8080/calculator will show user interface.

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

## Docker contenerization

````
docker build --tag=demo-calculator:latest .
````
````
docker run -p8080:8080 demo-calculator:latest
````