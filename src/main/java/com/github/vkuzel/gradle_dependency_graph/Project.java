package com.github.vkuzel.gradle_dependency_graph;

import java.io.Serializable;
import java.util.List;
import java.util.stream.Collectors;

public class Project implements Serializable {
    private final String name;
    private final String dir;
    private final boolean root;
    private final List<String> dependencies;

    public Project(String name, String dir, boolean root, List<String> dependencies) {
        if (name == null) {
            throw new NullPointerException("Name has to be not null!");
        } else if (dir == null) {
            throw new NullPointerException("Dir has to be not null!");
        } else if (dependencies == null) {
            throw new NullPointerException("Dependencies has to be not null!");
        }

        this.name = name;
        this.dir = dir;
        this.root = root;
        this.dependencies = dependencies;
    }

    public String getName() {
        return name;
    }

    public String getDir() {
        return dir;
    }

    public boolean isRoot() {
        return root;
    }

    public List<String> getDependencies() {
        return dependencies;
    }

    @Override
    public String toString() {
        return "Project{" +
                "name='" + name + '\'' +
                ", dir='" + dir + '\'' +
                ", root=" + root +
                ", dependencies=" + dependencies.stream().collect(Collectors.joining(", ")) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Project project = (Project) o;

        if (root != project.root) return false;
        if (!name.equals(project.name)) return false;
        if (!dir.equals(project.dir)) return false;
        return dependencies.equals(project.dependencies);

    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + dir.hashCode();
        result = 31 * result + (root ? 1 : 0);
        result = 31 * result + dependencies.hashCode();
        return result;
    }
}
