package services;

import factory.UserFactory;
import models.User;
import repositories.UserRepository;
import java.util.List;

public class UserService {
    private UserRepository repository = new UserRepository();
    public UserService(UserRepository repository) {
        this.repository = repository;
    }


    public User createUser(String name, String email, String userName, String password,Long userId) {
        User user = UserFactory.createUser(name, email, userName, password, userId);
        repository.save(user);
        return user;
    }

    public List<User> findAllUsers() {
        return repository.findAll();
    }

    public User getUserById(Long id) {
        return repository.findById(id);
    }

    public void deleteUser(Long Id) {
        repository.delete(Id);
    }
}