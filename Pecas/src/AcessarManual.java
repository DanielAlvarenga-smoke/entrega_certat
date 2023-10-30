import java.util.Scanner;

public class AcessarManual {
    private Scanner scanner = new Scanner(System.in);

    public void executar() {
        System.out.println("Qual tipo de manual deseja escolher?");
        System.out.println("1. Manual de Funcionamento");
        System.out.println("2. Manual de Instalação");

        int escolhaManual = scanner.nextInt();
        if (escolhaManual == 1) {
            System.out.println("O manual de funcionamento foi enviado para o seu e-mail.");
        } else if (escolhaManual == 2) {
            System.out.println("O manual de instalação foi enviado para o seu e-mail.");
        } else {
            System.out.println("Escolha inválida.");
        }
    }
}
