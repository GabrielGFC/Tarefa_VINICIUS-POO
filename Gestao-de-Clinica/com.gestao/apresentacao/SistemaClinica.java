package apresentacao;
import java.util.ArrayList;
import java.util.Scanner;

class Usuario {
    protected String nome;
    public Usuario(String nome) { this.nome = nome; }
    public String getNome() { return nome; }
}
class Paciente extends Usuario {
    public Paciente(String nome) { super(nome); }
}
class Profissional extends Usuario {
    public Profissional(String nome) { super(nome); }
}

public class SistemaClinica {
    private ArrayList<Paciente> pacientes = new ArrayList<>();
    private ArrayList<Profissional> profissionais = new ArrayList<>();
    private ArrayList<String> atendimentos = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    public void menu() {
        while (true) {
            System.out.println("\n===== MENU =====");
            System.out.println("1 - Cadastrar paciente");
            System.out.println("2 - Cadastrar profissional");
            System.out.println("3 - Agendar atendimento");
            System.out.println("4 - Listar atendimentos");
            System.out.println("5 - Sair");
            System.out.print("Escolha uma opção: ");
            String opcao = sc.nextLine();

            switch (opcao) {
                case "1" -> cadastrarPaciente();
                case "2" -> cadastrarProfissional();
                case "3" -> agendarAtendimento();
                case "4" -> listarAtendimentos();
                case "5" -> { System.out.println("Saindo..."); return; }
                default -> System.out.println("Opção inválida!");
            }
        }
    }

    private void cadastrarPaciente() {
        System.out.print("Nome do paciente: ");
        String nome = sc.nextLine();
        pacientes.add(new Paciente(nome));
        System.out.println("Paciente cadastrado!");
    }

    private void cadastrarProfissional() {
        System.out.print("Nome do profissional: ");
        String nome = sc.nextLine();
        profissionais.add(new Profissional(nome));
        System.out.println("Profissional cadastrado!");
    }

    private void agendarAtendimento() {
        if (pacientes.isEmpty() || profissionais.isEmpty()) {
            System.out.println("Cadastre pelo menos um paciente e um profissional.");
            return;
        }
        System.out.println("Escolha o paciente:");
        for (int i = 0; i < pacientes.size(); i++) {
            System.out.println((i+1) + " - " + pacientes.get(i).getNome());
        }
        int numPac = Integer.parseInt(sc.nextLine()) - 1;
        System.out.println("Escolha o profissional:");
        for (int i = 0; i < profissionais.size(); i++) {
            System.out.println((i+1) + " - " + profissionais.get(i).getNome());
        }
        int numProf = Integer.parseInt(sc.nextLine()) - 1;
        System.out.print("Data do atendimento (ex: 2025-05-20): ");
        String data = sc.nextLine();
        String atendimento = "Paciente: " + pacientes.get(numPac).getNome()
                + " | Profissional: " + profissionais.get(numProf).getNome()
                + " | Data: " + data;
        atendimentos.add(atendimento);
        System.out.println("Atendimento agendado!");
    }

    private void listarAtendimentos() {
        if (atendimentos.isEmpty()) {
            System.out.println("Nenhum atendimento agendado.");
        } else {
            System.out.println("Atendimentos:");
            for (String a : atendimentos) {
                System.out.println(a);
            }
        }
    }
}