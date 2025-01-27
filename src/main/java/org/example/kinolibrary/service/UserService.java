package org.example.kinolibrary.service;

import lombok.RequiredArgsConstructor;
import org.example.kinolibrary.model.User;
import org.example.kinolibrary.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;
    public void saveUser(User user) {
        userRepository.save(user);
    }
}
