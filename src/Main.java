import models.Administrator;

import repositories.AdminRepository;
import repositories.UserRepository;
import services.AdminService;
import services.UserService;


public class Main{
    public static void main(String[] args) {


        AdminRepository adminRepo = new AdminRepository();
        UserRepository userRepo = new UserRepository();
        AdminService adminService = new AdminService(adminRepo);
        UserService userService = new UserService(userRepo);

       //CREAR ADMINISTRADOR
        Administrator admin1= new Administrator.Builder()
                .withAdminId(1L)
                .withUserName("admin123")
                .withName("Adriana")
                .withEmail("mejia@gmail.com")
                .withPassword("123BRUNO")
                .build();
        
        adminService.register(admin1);
        System.out.println("Administrador registrado correctamente.\n");

        //LOGIN DE ADMINISTRADOR
        boolean loginOk = adminService.login("admin123","123BRUNO" );

        if (loginOk) {
            System.out.println("Login exitoso \n");
        } else {
            System.out.println("Login fallido \n");
        }

        // CREAR USUARIOS DESDE EL ADMIN 
        userService.createUser("Juan Pérez", "juan@gmail.com", "juanp", "1234", 1L);
        userService.createUser("Laura Gómez", "laura@gmail.com", "laurag", "5678", 2L);

        System.out.println("Usuarios registrados:");
        userService.findAllUsers().forEach(System.out::println);

        // ======= ADMIN LISTA USUARIOS =======
        System.out.println("\n El administrador lista los usuarios:");
        adminService.showAllUsers(userService.findAllUsers());

        // ======= ADMIN ELIMINA UN USUARIO =======
        System.out.println("\n Eliminando usuario con ID 1...");
        userService.deleteUser(1L);

        // ======= ADMIN VUELVE A LISTAR =======
        System.out.println("\n Lista de usuarios actualizada:");
        userService.findAllUsers().forEach(System.out::println);
    }
}
