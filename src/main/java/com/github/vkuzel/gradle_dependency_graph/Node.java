package com.github.vkuzel.gradle_dependency_graph;

import java.io.Serializable;
import java.util.List;
import java.util.stream.Collectors;

public class Node implements Serializable {
    private final String projectName;
    private final boolean rootProject;
    private final String projectDir;
    private final List<Node> children;

    public Node(String projectName, boolean rootProject, String projectDir, List<Node> children) {
        this.projectName = projectName;
        this.rootProject = rootProject;
        this.projectDir = projectDir;
        this.children = children;
    }

    public String getProjectName() {
        return projectName;
    }

    public boolean isRootProject() {
        return rootProject;
    }

    public String getProjectDir() {
        return projectDir;
    }

    public List<Node> getChildren() {
        return children;
    }

    @Override
    public String toString() {
        return "Node{" +
                "projectName='" + projectName + '\'' +
                ", rootProject=" + rootProject +
                ", projectDir='" + projectDir + '\'' +
                ", children=" + children.stream().map(Node::toString).collect(Collectors.joining(", ")) +
                '}';
    }
}
