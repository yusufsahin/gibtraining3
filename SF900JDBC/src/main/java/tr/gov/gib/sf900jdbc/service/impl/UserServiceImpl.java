package tr.gov.gib.sf900jdbc.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tr.gov.gib.sf900jdbc.dao.UserRepository;
import tr.gov.gib.sf900jdbc.dao.model.User;
import tr.gov.gib.sf900jdbc.service.UserService;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public User createUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public Optional<User> getUser(Long id) {
        return userRepository.findById(id);
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public void deleteUser(Long id) {
        userRepository.delete(id);
    }

    @Override
    public User updateUser(User user) {
        if(userRepository.findById(user.getId()).isPresent()){
            userRepository.update(user);
            return user;
        }else {
            throw new RuntimeException("User not found with id: " + user.getId());
        }

    }
}
