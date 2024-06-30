// Import da classe Scanner, usado para ler entradas do usuário a partir do teclado ou de outras fontes de entrada.
import java.util.Scanner;

public class ContaBancaria {
    public static void main(String[] args) {

        // Inicialização das variáveis da conta bancária.
        String nome = "Juliano Silva";
        String tipoConta = "Corrente";
        double saldo = 2500.00;
        int opcao = 0;

        // Exibição das informações iniciais da conta bancária
        System.out.println("************************");
        System.out.println("Dados da Conta");
        System.out.println("\nNome do Cliente: " + nome);
        System.out.println("Tipo da Conta: " + tipoConta);
        System.out.println("Saldo da Conta: R$ " + saldo);
        System.out.println("\n************************");

        // Menu de opções para interação com o usuário.
        String menu = """
                ** Digite sua opção **
                1 - Consultar Saldo
                2 - Transferir Valor
                3 - Receber Valor
                4 - Sair
                """;
        Scanner teclado = new Scanner(System.in);

        // Loop principal para a interação contínua com o usuário até a escolha de sair.
        while (opcao != 4) {
            System.out.println(menu); // Exibe o menu de opções.
            opcao = teclado.nextInt(); // Lê a opção escolhida pelo usuário.

            // Verifica a opção escolhida pelo usuário.
            if (opcao == 1){
                // Opção para consultar saldo.
                System.out.println("Saldo da conta: R$ " + saldo);
            } else if (opcao == 2) {
                // Opção para transferir valor.
                System.out.println("Qual valor deseja transferir");
                double valor = teclado.nextDouble();
                if (valor >= saldo) {
                    // Verifica se há saldo suficiente para a transferência.
                    System.out.println("Nao ha saldo para realizar a transferência");
                } else {
                    // Realiza a transferência e atualiza o saldo.
                    saldo = saldo - valor;
                    System.out.println("Saldo da conta: R$ " + saldo);
                }
            } else if (opcao ==3) {
                // Opção para receber valor.
                System.out.println("Valor a receber: ");
                double valor = teclado.nextDouble();
                saldo = saldo + valor;
                System.out.println("Saldo da conta: R$ " + saldo);
            } else if (opcao != 4) {
                // Mensagem de erro para opções inválidas.
                System.out.println("Opção Inválida");
            }
        }
    }
}
