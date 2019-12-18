# mysqlconnectionwithsslenabled
	Code which uses ssl to connect to mysql db

## how to build
	1. git clone git@github.com:kirankumardg/mysqlconnectionwithsslenabled.git
	2. go to folder mysqlconnectionwithsslenabled
	3. run mvn clean package



## how to run
		1. go to target folder. Find uber jar named java-mysql-example-app-1.0-SNAPSHOT-jar-with-dependencies.jar
		2. Run the following command
		 java -Djavax.net.ssl.trustStore=<truststore_filepath>> -Djavax.net.ssl.trustStorePassword=<password> -jar java-mysql-example-app-1.0-SNAPSHOT-jar-with-dependencies.jar

## Author
a. Name: kiran D G
b. Email: kirankumardg@gmail.com

