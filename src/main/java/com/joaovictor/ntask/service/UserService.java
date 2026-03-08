package com.joaovictor.ntask.service;

import com.joaovictor.ntask.entity.User;
import com.joaovictor.ntask.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }
}
