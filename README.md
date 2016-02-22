Step 0
1. git clone https://github.com/m41highway/spring-boot-webapp.git
2. change directory to /spring-boot-webapp, execute "mvn package"
3. execute "java -jar target/basic-spring-boot-webapp-0.1.0.jar"
4. open another console and execute "curl localhost:8080"

Step 1 add a new test class for testing the end point,
1. execute "mvn test" to verify the unit test result

Step 2 add a new integration test
1. run as java program to invoke the test

Step 3 enable the starter actuator
1. add starter actuator dependant in pom
2. start the application with command "mvn package && java -jar target/basic-spring-boot-webapp-0.1.0.jar"
3. visit the non-functional api by "curl localhost:8080/xxx" (http://docs.spring.io/spring-boot/docs/1.3.2.RELEASE/reference/htmlsingle/#production-ready-endpoints)
4. add git ignore by type "touch .gitignore" in the root directory of the git repository

Step 4 add AMQP config and the a sender
1. add amqp dependant in pom
2. implement MessagingBroker to configure the exchange and queue
3. Trigger the send method in the REST api /book by typing "curl localhost:8080/book"
4. Monitor the Rabbit MQ Admin to see a request has stored in the queue

