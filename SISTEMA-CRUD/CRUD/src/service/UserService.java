package service;

import model.User;
import request.UserRequest;

import java.util.ArrayList;
import java.util.List;

public class UserService {
    private final List<User> users = new ArrayList<>();
    private User loggedUser = null;

    public boolean create(UserRequest req) {
        if (existsByEmail(req.getEmail())) return false;
        users.add(new User(req.getName(), req.getEmail(), req.getPassword()));
        return true;
    }

    public boolean login(String email, String password) {
        for (User user : users) {
            if (user.getEmail().equals(email) && user.getSenha().equals(password)) {
                loggedUser = user;
                return true;
            }
        }
        return false;
    }

    public boolean update(String name, String password) {
        if (!isLogged()) return false;
        loggedUser.setNome(name);
        loggedUser.setSenha(password);
        return true;
    }

    public boolean delete() {
        if (!isLogged()) return false;
        users.remove(loggedUser);
        loggedUser = null;
        return true;
    }

    public List<User> listUsers() {
        return new ArrayList<>(users);
    }

    public boolean isLogged() {
        return users.contains(loggedUser);
    }

    private boolean existsByEmail(String email) {
        for (User user : users) {
            if (user.getEmail().equals(email)) {
                return true;
            }
        }
        return false;
    }
}
