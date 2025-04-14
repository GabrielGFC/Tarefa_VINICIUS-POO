package routes;

import controller.UserController;

import java.util.Scanner;

public class UserRouter {
    private final Scanner sc = new Scanner(System.in);
    private final UserController controller = new UserController();

    public void start() {
        boolean running = true;

        while (running) {
            System.out.println("\n===== MENU =====");
            System.out.println("1 - Criar conta");
            System.out.println("2 - Login");
            System.out.println("3 - Atualizar dados");
            System.out.println("4 - Excluir conta");
            System.out.println("5 - Listar usuários");
            System.out.println("6 - Sair");
            System.out.print("Opção: ");
            String option = sc.nextLine();

            switch (option) {
                case "1" -> create();
                case "2" -> login();
                case "3" -> update();
                case "4" -> delete();
                case "5" -> list();
                case "6" -> {
                    running = false;
                    System.out.println("Encerrando...");
                }
                default -> System.out.println("Opção inválida.");
            }
        }

        sc.close();
    }

    private void create() {
        System.out.print("Nome: ");
        String name = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();
        System.out.print("Senha: ");
        String password = sc.nextLine();
        if (controller.create(name, email, password)) {
            System.out.println("Conta criada com sucesso!");
        } else {
            System.out.println("E-mail já cadastrado.");
        }
    }

    private void login() {
        System.out.print("Email: ");
        String email = sc.nextLine();
        System.out.print("Senha: ");
        String password = sc.nextLine();
        if (controller.login(email, password)) {
            System.out.println("Login realizado com sucesso!");
        } else {
            System.out.println("E-mail ou senha incorretos.");
        }
    }

    private void update() {
        if (!controller.isLogged()) {
            System.out.println("Você precisa estar logado.");
            return;
        }

        System.out.print("Novo nome: ");
        String name = sc.nextLine();
        System.out.print("Nova senha: ");
        String password = sc.nextLine();
        controller.update(name, password);
        System.out.println("Dados atualizados com sucesso.");
    }

    private void delete() {
        if (!controller.isLogged()) {
            System.out.println("Você precisa estar logado.");
            return;
        }

        if (controller.delete()) {
            System.out.println("Conta excluída.");
        } else {
            System.out.println("Erro ao excluir a conta.");
        }
    }

    private void list() {
        controller.listUsers();
    }
}
