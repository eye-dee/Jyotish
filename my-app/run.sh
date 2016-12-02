#!/bin/bash
mvn clean
mvn package
java -cp target/my-app-1.0-SNAPSHOT.jar:joda-time-2.9.6.jar com.erebor.app.App
