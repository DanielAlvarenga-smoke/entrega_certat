import java.util.Scanner;

public class PedirSuporte {
    private Scanner scanner;

    public PedirSuporte(Scanner scanner) {
        this.scanner = scanner;
    }

    public void executar() {
        System.out.println("Escolha o tipo de suporte:");
        System.out.println("1. Suporte Técnico");
        System.out.println("2. Suporte Financeiro");
        int escolhaSuporte = scanner.nextInt();

        switch (escolhaSuporte) {
            case 1:
                System.out.println("Você escolheu Suporte Técnico.");
                System.out.println("O número para suporte técnico é: 3834-1230");
                break;
            case 2:
                System.out.println("Você escolheu Suporte Financeiro.");
                System.out.println("O número para suporte financeiro é: 3834-1129");
                break;
            default:
                System.out.println("Opção inválida.");
                break;
        }
    }
}
