package services;
import models.Administrator;
import repositories.AdminRepository;


public class AdminService {
	private AdminRepository repo = new AdminRepository();
	


public void register(Administrator admin) {
    if (repo.findByUsername(admin.getUserName()) != null) {
        throw new IllegalArgumentException("El usuario ya existe");
    }
    repo.save(admin);
}

public boolean login(String username, String password) {
    Administrator admin = repo.findByUsername(username); // o desde tu Map
    return admin != null && admin.getPassword().equals(password);
}
}