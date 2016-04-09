package com.github.vkuzel.gradle_dependency_graph;

import java.io.Serializable;
import java.util.List;
import java.util.stream.Collectors;

public class Node implements Serializable {
    private final Project project;
    private final List<Node> children;

    public Node(String projectName, String projectDir, List<Node> children) {
        this.project = new Project(projectName, projectDir);
        this.children = children;
    }

    public Project getProject() {
        return project;
    }

    public List<Node> getChildren() {
        return children;
    }

    @Override
    public String toString() {
        return "Node{" +
                "project='" + project.toString() + '\'' +
                ", children=" + children.stream().map(Node::toString).collect(Collectors.joining(", ")) +
                '}';
    }

    public static class Project {
        private final String name;
        private final String dir;

        private Project(String name, String dir) {
            this.name = name;
            this.dir = dir;
        }

        public String getName() {
            return name;
        }

        public String getDir() {
            return dir;
        }

        @Override
        public String toString() {
            return "Project{" +
                    "name='" + name + '\'' +
                    ", dir='" + dir + '\'' +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Project project = (Project) o;

            if (!name.equals(project.name)) return false;
            return dir.equals(project.dir);

        }

        @Override
        public int hashCode() {
            int result = name.hashCode();
            result = 31 * result + dir.hashCode();
            return result;
        }
    }
}
