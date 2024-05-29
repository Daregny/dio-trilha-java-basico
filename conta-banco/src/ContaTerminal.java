import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        // TODO: conhecer e importar a Classe Scanner 
        Scanner scanner = new Scanner(System.in);

        // Exibir as mensagems para o nosso usuario
        // Obter pelo scanner os valores digitados no terminal
        System.out.println("Por favor, digite o número da Agência:");
        int agencia = Integer.parseInt(scanner.nextLine()); // Convertendo para inteiro

        System.out.println("Por favor, digite o número da Conta:");
        String numeroConta = scanner.nextLine();

        System.out.println("Por favor, digite o nome do Cliente:");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o saldo inicial:");
        double saldo = Double.parseDouble(scanner.nextLine()); // Convertendo para double

        // Criando a mensagem final usando concatenação
        String mensagem = "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + agencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque.";

        // Exibindo a mensagem da conta criada
        System.out.println(mensagem);

        // Fechando o scanner
        scanner.close();
    }
}
