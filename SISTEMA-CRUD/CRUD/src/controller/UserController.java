package controller;

import model.User;
import request.UserRequest;
import service.UserService;

import java.util.List;

public class UserController {

    private final UserService service = new UserService();

    public boolean create(String name, String email, String password) {
        return service.create(new UserRequest(name, email, password));
    }

    public boolean login(String email, String password) {
        return service.login(email, password);
    }

    public boolean update(String name, String password) {
        return service.update(name, password);
    }

    public boolean delete() {
        return service.delete();
    }

    public void listUsers() {
        if (!service.isLogged()) {
            System.out.println("Você precisa estar logado.");
            return;
        }

        List<User> list = service.listUsers();
        if (list.isEmpty()) {
            System.out.println("Nenhum usuário cadastrado.");
        } else {
            for (User user : list) {
                System.out.println(user);
            }
        }
    }

    public boolean isLogged() {
        return service.isLogged();
    }
}
