package com.javeriana.Game.service;
import com.javeriana.Game.exceptions.UserNotFoundException;
import com.javeriana.Game.model.User;
import com.javeriana.Game.repository.UserRepository;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class UserService {

    private final UserRepository userRepo;

    public  UserService(UserRepository userRepo) {
        this.userRepo=userRepo;
    }

    public User addUser(User user) {
        return userRepo.save(user);
    }

    public List<User> findAllUsers(){
        return userRepo.findAll();
    }

    public User updateUser(User user) {
        return userRepo.save(user);
    }

    public void deleteUserById(Long id) {
        userRepo.deleteById(id);
    }

    public User findUserById(Long id) {
        return userRepo.findById(id).orElseThrow(() -> new UserNotFoundException("User not by id: " + id +" not found"));
    }

    public User findUserByDocument(String document) {
        return userRepo.findByUserDocument(document);
    }
}
