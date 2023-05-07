package classwork.demo.service;

import classwork.demo.entity.User;
import classwork.demo.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User createUser(User user) {
        return userRepository.save(user);
    }

    public User updateUser(User user) {
        return userRepository.save(user);
    }

    public void deleteUser(Long id) {
        userRepository.deleteById(id)
        ;
    }

    public Optional<User> getUserById(Long id) {
        return userRepository.findById(id);
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public List<User> searchUsersByFirstName(String firstName) {
        return userRepository.findByFirstNameContaining(firstName);
    }

    public List<User> searchUsersByLastName(String lastName) {
        return userRepository.findByLastNameContaining(lastName);
    }
}

