# Gradle Project Dependencies

[![](https://jitpack.io/v/vkuzel/Gradle-Project-Dependencies.svg)](https://jitpack.io/#vkuzel/Gradle-Project-Dependencies)

## Features

A simple class (ProjectDependencies) that holds a project's name and list of projects this project depends on.

This library is used by [Spring Boot Multi-Project Gradle Plugin](https://github.com/vkuzel/Gradle-Spring-Boot-Multi-Project-Plugin) to store dependencies between Gradle sub-projects.
The plugin serializes Project object into file which can be used by an Java application. Check out example usage in [Gradle multi-project configuration template](https://github.com/vkuzel/Gradle-Multi-Project-Development-Template) for more details.

## Getting started

Add dependency to your project if you are not using Spring Boot Multi-Project Gradle Plugin. Otherwise the plugin adds dependency implicitly.

**Gradle**
````groovy
    allprojects {
        repositories {
            maven { url "https://jitpack.io" }
        }
    }

	dependencies {
	        compile 'com.github.vkuzel:Gradle-Project-Dependencies:3.0.0'
	}
````
**Maven**
````xml
    <repositories>
		<repository>
		    <id>jitpack.io</id>
		    <url>https://jitpack.io</url>
		</repository>
	</repositories>

	<dependency>
	    <groupId>com.github.vkuzel</groupId>
	    <artifactId>Gradle-Project-Dependencies</artifactId>
	    <version>3.0.0</version>
	</dependency>
````
