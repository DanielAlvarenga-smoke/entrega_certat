import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Pedido {
    public void fazerPedido(List<VeiculoBrasileiro> veiculos, List<String> pecas, String string, String string2, int k, double d, String string3) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veículos disponíveis:");
        for (int i = 0; i < veiculos.size(); i++) {
            System.out.println(i + 1 + ". " + veiculos.get(i));
        }

        System.out.print("Escolha o número do veículo que deseja pedir: ");
        int escolha = scanner.nextInt();

        if (escolha > 0 && escolha <= veiculos.size()) {
            VeiculoBrasileiro veiculoEscolhido = veiculos.get(escolha - 1);
            System.out.println("Pedido feito para: " + veiculoEscolhido);

            System.out.println("Peças disponíveis para esse veículo:");
            for (int j = 0; j < pecas.size(); j++) {
                System.out.println(j + 1 + ". " + pecas.get(j));
            }

            System.out.print("Escolha o número da peça que deseja: ");
            int escolhaPeca = scanner.nextInt();

            if (escolhaPeca > 0 && escolhaPeca <= pecas.size()) {
                String pecaEscolhida = pecas.get(escolhaPeca - 1);
                System.out.println("Pedido feito para a peça: " + pecaEscolhida);

                
                System.out.print("A peça é estrangeira? (Sim ou Não): ");
                String respostaEstrangeira = scanner.next().toLowerCase();
                boolean estrangeira = respostaEstrangeira.equals("sim");

                
                System.out.print("Quantidade desejada: ");
                int quantidade = scanner.nextInt();

                System.out.println("Pedido feito para a peça: " + pecaEscolhida);
                System.out.println("Peça estrangeira: " + (estrangeira ? "Sim" : "Não"));
                System.out.println("Quantidade: " + quantidade);
                System.out.println("Você recebeu um cupom de desconto de 10% acumulativo até 50%!");
            } else {
                System.out.println("Opção inválida. Por favor, escolha uma peça válida.");
            }
        } else {
            System.out.println("Opção inválida. Por favor, escolha um veículo válido.");
        }
    }
}
