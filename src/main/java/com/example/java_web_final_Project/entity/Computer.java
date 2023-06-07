package com.example.java_web_final_Project.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.util.Objects;

@Entity
public class Computer {



    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private String type;
    private String description;

    public Computer() {
    }

    public Computer(String name, String type, String description) {
        this.name = name;
        this.type = type;
        this.description = description;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Computer computer)) return false;
        return Objects.equals(getId(), computer.getId()) && Objects.equals(getName(), computer.getName()) && Objects.equals(getType(), computer.getType()) && Objects.equals(getDescription(), computer.getDescription());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getType(), getDescription());
    }


    @Override
    public String toString() {
        return "Computer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}




