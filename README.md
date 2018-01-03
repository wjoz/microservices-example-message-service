# microservices-example-message-service
The project implements the Message Service micro service from the microservices architecture example.

# Details

This project provides a sample Message micro service.

Before running this micro service, make sure, you've run the microservices-example-service-discovery project which is the service registry process.

The Message Service will register there in order to be able to communicate with the User Service (microservices-example-message-service). 

# How to Build and Run

1. Make sure to run the Service Discovery micro service the (microservices-example-service-discovery project) that will run on port 1111.
2. Run the User micro service that will run on port 2222.
1. Open up a terminal and use the following command: **mvn spring-boot:run** 
2. The Message Service will run on port 3333, as specified in application.yml
3. To test, visit [http://localhost:3333/messages](http://localhost:3333/messages]). The Message Service will send an HTTP request
to the User Service under the */users* endpoint [http://localhost:2222/users](http://localhost:2222/users) using the **UserClient** interface.
If all the micro services are set up correctly, you should see the "Hello from User Service" response from the User Service, equivalent to what you'd get if you visited the User Service /users endpoint at [http://localhost:2222/users](http://localhost:2222/users) 