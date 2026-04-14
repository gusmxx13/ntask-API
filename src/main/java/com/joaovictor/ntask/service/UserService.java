package com.joaovictor.ntask.service;

import com.joaovictor.ntask.entity.Project;
import com.joaovictor.ntask.entity.User;
import com.joaovictor.ntask.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public Optional<User> getUserById(Long id) {
        return userRepository.findById(id);
    }

    public User createUser(User user) {

        Project project = new Project();
        project.setName("Meu primeiro projeto");
        user.addProject(project);

        return userRepository.save(user);
    }
}
