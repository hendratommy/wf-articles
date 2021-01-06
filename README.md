# MicroProfile generated Application

## Introduction

MicroProfile Starter has generated this MicroProfile application for you.

The generation of the executable jar file can be performed by issuing the following command

    mvn clean package

This will create an executable jar file **wf-articles-wildfly.jar** within the _target_ maven folder. This can be started by executing the following command

    java -jar target/wf-articles-wildfly.jar




To launch the test page, open your browser at the following URL

    http://localhost:8080/index.html

## Specification examples

By default, there is always the creation of a JAX-RS application class to define the path on which the JAX-RS endpoints are available.

Also, a simple Hello world endpoint is created, have a look at the class **HelloController**.

More information on MicroProfile can be found [here](https://microprofile.io/)


### Config

Configuration of your application parameters. Specification [here](https://microprofile.io/project/eclipse/microprofile-config)

The example class **ConfigTestController** shows you how to inject a configuration parameter and how you can retrieve it programmatically.


### Launch

To launch the application, set the following required environment variables:

- DDL_AUTO
- POSTGRESQL_DATABASE
- POSTGRESQL_DATASOURCE
- POSTGRESQL_PASSWORD
- POSTGRESQL_SERVICE_HOST
- POSTGRESQL_SERVICE_PORT
- POSTGRESQL_USER

*Note: `DDL_AUTO` value will map to `hibernate.hbm2ddl.auto`

```bash
env $(cat .env | xargs) mvn package wildfly-jar:run
```
