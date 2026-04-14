package com.joaovictor.ntask.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "users")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    @GeneratedValue
    @Column(columnDefinition = "UUID")
    private UUID id;

    private String name;

    @Column(unique = true)
    private String email;

    private String password;

    @JsonManagedReference
    @OneToMany(mappedBy = "user", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Project> projects = new ArrayList<>();

    public void addProject(Project project){

        if (this.projects == null) {
            this.projects = new ArrayList<>();
        }

        this.projects.add(project);
        project.setUser(this);
    }

    public void removeProject(Project project){
        projects.remove(project);
        project.setUser(null);
    }

}


