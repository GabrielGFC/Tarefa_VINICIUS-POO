package assinatura.apresentacao;

import assinatura.controladora.AssinaturaController;
import assinatura.negocio.Assinatura;
import assinatura.negocio.AssinaturaStreaming;
import assinatura.negocio.AssinaturaSoftware;

import java.util.Scanner;

public class Main {
    private static final AssinaturaController controller = new AssinaturaController();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. Cadastrar nova assinatura");
            System.out.println("2. Listar assinaturas");
            System.out.println("3. Ver valor total de mensalidade do cliente");
            System.out.println("4. Encerrar");

            int opcao = scanner.nextInt();
            scanner.nextLine();  // consume newline

            switch (opcao) {
                case 1:
                    cadastrarAssinatura(scanner);
                    break;
                case 2:
                    listarAssinaturas();
                    break;
                case 3:
                    calcularValorTotalMensalidade(scanner);
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        }
    }

    private static void cadastrarAssinatura(Scanner scanner) {
        System.out.println("Tipo de assinatura (1-Streaming, 2-Software): ");
        int tipo = scanner.nextInt();
        scanner.nextLine();  // consume newline

        System.out.println("Nome do cliente: ");
        String cliente = scanner.nextLine();

        System.out.println("Duração em meses: ");
        int duracaoMeses = scanner.nextInt();
        scanner.nextLine();  // consume newline

        Assinatura assinatura = null;
        if (tipo == 1) {
            System.out.println("Número de telas extras: ");
            int telasExtras = scanner.nextInt();
            scanner.nextLine();  // consume newline
            assinatura = new AssinaturaStreaming(cliente, duracaoMeses, telasExtras);
        } else if (tipo == 2) {
            System.out.println("Número de módulos contratados: ");
            int modulos = scanner.nextInt();
            scanner.nextLine();  // consume newline
            assinatura = new AssinaturaSoftware(cliente, duracaoMeses, modulos);
        }

        if (assinatura != null) {
            controller.cadastrarAssinatura(assinatura);
            System.out.println("Assinatura cadastrada com sucesso!");
        } else {
            System.out.println("Tipo de assinatura inválido.");
        }
    }

    private static void listarAssinaturas() {
        for (Assinatura assinatura : controller.listarAssinaturas()) {
            System.out.println(assinatura);
        }
    }

    private static void calcularValorTotalMensalidade(Scanner scanner) {
        System.out.println("Nome do cliente: ");
        String cliente = scanner.nextLine();
        double valorTotal = controller.calcularValorTotalMensalidade(cliente);
        System.out.println("Valor total da mensalidade: " + valorTotal);
    }
}