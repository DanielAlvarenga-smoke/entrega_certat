import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {


        Sistema sistema = new Sistema();
        sistema.adicionarUsuario(new Cliente("Cliente1"));
        sistema.adicionarUsuario(new Gerente("Daniel", "1234"));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Escolha o tipo de usuário (cliente/gerente):");
        String tipoUsuario = scanner.next();

        if (tipoUsuario.equalsIgnoreCase("cliente")) {
            Usuario cliente = new Cliente("Temporário");
            sistema.entrar(cliente);

            MenuCliente menuCliente = new MenuCliente();
            menuCliente.exibirMenu();
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();

            if (opcao == 1 || opcao == 2 || opcao == 3 || opcao == 4) {
                GestorVeiculosBrasileiros gestorVeiculos = new GestorVeiculosBrasileiros();
                List<VeiculoBrasileiro> veiculos = gestorVeiculos.getVeiculosBrasileiros();

                PecasDeCarro pecasDeCarro = new PecasDeCarro();
                List<String> pecas = pecasDeCarro.getTiposDePecas();

                menuCliente.processarOpcao(opcao, veiculos, pecas);
            } else {
                System.out.println("Opção inválida.");
            }
        } else if (tipoUsuario.equalsIgnoreCase("gerente")) {
            System.out.print("Digite a senha: ");
            String senha = scanner.next();
            Usuario gerente = new Gerente("Temporário", senha);

            for (Usuario usuario : sistema.getUsuarios()) {
                if (usuario instanceof Gerente) {
                    Gerente gerenteSistema = (Gerente) usuario;
                    if (gerenteSistema.verificarSenha(senha)) {
                        sistema.entrar(usuario);
                        System.out.print("Digite as informações do pedido a ser cadastrado: ");
                        String informacoes = scanner.next();
                        System.out.println("Informações cadastradas: " + informacoes);
                        return;
                    }
                }
            }
            System.out.println("Senha incorreta. Acesso negado.");
        } else {
            System.out.println("Tipo de usuário inválido.");
        }
    }
}
