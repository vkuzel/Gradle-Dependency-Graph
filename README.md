# Gradle Dependency Graph

[![](https://jitpack.io/v/vkuzel/Gradle-Dependency-Graph.svg)](https://jitpack.io/#vkuzel/Gradle-Dependency-Graph)

## Features

A simple class (ProjectDependencies) that holds a project's name and list of other project names that this project depends on.

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
	        compile 'com.github.vkuzel:Gradle-Dependency-Graph:2.0.0'
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
	    <version>2.0.0</version>
	</dependency>
````
