package factory;
import models.User;


public class UserFactory {
    private static long idCounter = 1;

    public static User createUser(String name, String email, String userName, String password, Long userId) {
    	
        return new User.Builder()
                .withUserId (idCounter++)
                .withName(name)
                .withEmail(email)
                .withUserName(userName)
                .withPassword(password)
                .build();
    }}