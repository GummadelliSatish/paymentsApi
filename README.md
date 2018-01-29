# Payments Data API
Payments Data API is a RESTful MicroService, uses Spring Boot Rest with MongoDB as the backend.

### PreRequisite
Payments Data API depends on 
- Payments Data API
    ```
        <groupId>com.form3.domain.model.payments</groupId>
        <artifactId>payments-data</artifactId>
        <version>1.0.0</version>
    ```
    first build payments-data using 
    ```
    >mvn clean install
    ```

-  MongoDB
            Install MongoDB and start mongoDB server as mentioned in  https://docs.mongodb.com/manual/installation/  

-  Java8
-  Maven

### Build and Running

After building payments-data project as mentioned in pre-requisite, run
```
>mvn clean install
```
on payments-data-api

If you are using any IDE run com.form3.services.data.payments.PaymentsDataApiApplication as Spring Boot application or java application

otherwise run
```
>cd payments-data-api
>java -jar target/payments-data-api-1.0.0.jar
```

current application connects to mongoDB on default port with defualt authentication

To Connect to MongoDB server on remote server or on differnt ports run the payemts-data-api with following options

```
>cd payments-data-api
>java -jar target/payments-data-api-1.0.0.jar --spring.data.mongodb.uri=mongodb://user:secret@mongo1.example.com:12345
```

Current application runs on 8182 port in case to change it run the application with run time argument --server.port=<yourAppPortNumber>


To Test the application sample requests are found at [Launch Payments App Testing](https://documenter.getpostman.com/view/3619117/form3-payments-api/7TNgXfz#eb6a8c3f-fe1f-cfb5-4bd8-92d9801a2b37)


payments model class diagram is found at payments-data/docs/payments-class-diagram.png

to Modify the class diagram use payments-data/docs/PaymentAPi.xmi at https://dashboard.genmymodel.com/.
