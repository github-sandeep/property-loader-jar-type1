# creating jar with property-loader

This repository help to create jar which picks properties from class path. This has profile for local and prod profile where properties has been kept in config.properties.

This jar picks property file from same class path. No need to pass resource file path while running the jar.

How to use?
1- Clone this repository git clone git@github.com:github-sandeep/property-loader-jar-type1.git
2- Run "mvn clean install" or "mvn clean install -Pprod"
3- Run the jar file "java -jar /target/property-type1-1.0-SNAPSHOT.jar"

Note: Aim of this repository is to help how to load property file as per maven build profile and access properties value.
Jar can be run independent of class folder path. In the next "type2" respository, I have covered how to pick properties files by passing resource path while running the jar.

