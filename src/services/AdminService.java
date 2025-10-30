package services;

import models.Administrator;
import repositories.AdminRepository;
import models.User;
import java.util.List;


public class AdminService {

    private AdminRepository repository;

    // Constructor que recibe el repositorio
    public AdminService(AdminRepository repository) {
        this.repository = repository;
    }

    // Guarda un nuevo admin
    public void register(Administrator admin) {
        repository.save(admin);
    }

    // Login de admin
    public boolean login(String username, String password) {
        Administrator admin = repository.findByUsername(username);
        return admin != null && admin.getPassword().equals(password);
    }


public void showAllUsers(List<User> users) {
    if (users == null || users.isEmpty()) {
        System.out.println("No hay usuarios registrados.");
        return;
    }

    System.out.println("\n-Lista de usuarios registrados");
    for (User user : users) {
        System.out.println(user);
    }
}
}