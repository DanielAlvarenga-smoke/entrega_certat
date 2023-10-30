import java.util.Scanner;

public class PedirReembolso {
    public static void processarReembolso() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("A peça ainda está lacrada? (s/n): ");
        String resposta = scanner.next().toLowerCase();

        if (resposta.equals("s")) {
            System.out.println("Seu dinheiro será reembolsado assim que enviar a peça de volta.");
        } else if (resposta.equals("n")) {
            System.out.println("Devolução negada.");
        } else {
            System.out.println("Resposta inválida. Por favor, escolha 's' ou 'n'.");
        }
    }
}