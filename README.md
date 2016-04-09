# Gradle Dependency Graph

[![](https://jitpack.io/v/vkuzel/Gradle-Dependency-Graph.svg)](https://jitpack.io/#vkuzel/Gradle-Dependency-Graph)

## Features

Simple class (Node) that holds project dependency graph of Gradle multi-project build.

This library is used by [Spring Boot Multi-Project Gradle Plugin](https://github.com/vkuzel/Gradle-Spring-Boot-Multi-Project-Plugin) to hold a project structure.
The plugin serializes Node object into to file that can be read and used by an Java application. Check out [Gradle multi-project configuration template](https://github.com/vkuzel/Gradle-Multi-Project-Development-Template) for more details.

## Getting started

Add dependency to your project.

**Gradle**
````groovy
    allprojects {
        repositories {
            maven { url "https://jitpack.io" }
        }
    }

	dependencies {
	        compile 'com.github.vkuzel:Gradle-Dependency-Graph:1.1.0'
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
	    <artifactId>Gradle-Dependency-Graph</artifactId>
	    <version>1.1.0</version>
	</dependency>
````
