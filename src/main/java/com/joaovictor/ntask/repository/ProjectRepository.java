package com.joaovictor.ntask.repository;

import com.joaovictor.ntask.entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project, Long> {

}
