# :oncoming_taxi: About taxi-service
This project is a basic implementation of taxi service Java application, which is based on SOLID principles, database usage and web-technologies.

# :dart: Goal
The aim of the project is to show OOP, SOLID, JDBC and Web usage skills in creating Java-applications.

# :yellow_circle: Taxi-service features
It uses a database to store information about cars, manufacturers, drivers and includes funtionality which allows:
* User authentication and registration as one of the drivers;
* Creating/deleting cars, drivers and manufatucrers;
* Adding/updating information about cars, drivers and manufatucrers;
* Adding drivers to car;
* Getting a list of cars, drivers and manufacturers
* Getting a list of cars for currently logged in driver.

# :hammer_and_wrench: Technologies stack
* Java 11
* MySQL
* JDBC
* Javax servlet API
* JSTL
* JSP
* Logger (Log4j2)
* Tomcat 9.0.54 (to run app locally)

# :toolbox: Installation and running
To run this project you will need to do these steps:
1. Install [MySQL](https://dev.mysql.com/downloads/) and [Apache Tomcat 9.0.54](https://tomcat.apache.org/download-90.cgi).
2. Clone this project.
3. Initialise a copy of database on your machine by copying code from ```init_db.sql``` in resources folder and running it in your DBMS.
4. Change your database connection information (URL, username, password) in ```ConnectionUtil.java``` in ```java/util``` folder:
```java
public class ConnectionUtil {
    private static final String URL = "YOUR DATABASE URL";
    private static final String USERNAME = "YOUR USERNAME";
    private static final String PASSWORD = "YOUR PASSWORD";
    private static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
  
```
5. Add Tomcat to running configuration of your project and use ```/``` as your Tomcat application context.
6. :warning:You may also need to reconfigure logging path to application.log file int ```log4j2.xml``` file in resources. Use absolute path instead of relative.
7. Run project using previously configured Tomcat running configuration and register new driver when login page pops up.

