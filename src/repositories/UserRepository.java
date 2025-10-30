package repositories;
import models.User;
import java.util.*;


public class UserRepository {

    private Map<Long, User> users = new HashMap<>();
    private Long idCounter = 1L;

    // Guarda un usuario
    public User save(User user) {
        if (user.getUserId() == null) {
            user.setUserId(idCounter++);
        }
        users.put(user.getUserId(), user);
        return user;
    }

    // Busca usuario por username
    public User findByUserName(String userName) {
        return users.values().stream()
                .filter(u -> u.getUserName().equalsIgnoreCase(userName))
                .findFirst()
                .orElse(null);
    }

    // Busca usuario por ID
    public User findById(Long id) {
        return users.get(id);
    }

    // Elimina usuario
    public void delete(Long id) {
        users.remove(id);
    }

    // Lista todos
    public List<User> findAll() {
        return new ArrayList<>(users.values());
    }
}
