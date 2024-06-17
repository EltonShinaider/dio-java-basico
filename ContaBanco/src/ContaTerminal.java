import java.util.Scanner;

public class ContaTerminal {
    
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Por favor, digite o número da agência: ");
        String agencia = scanner.nextLine();

        System.out.println("Por favor, digite o número da conta: ");
        int numero = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Por favor, digite o nome do cliente: ");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o saldo da conta: ");
        double saldoConta = scanner.nextDouble();

        scanner.close();

        System.out.print("Olá, " + nomeCliente + ", obrigado por criar uma conta em nosso banco, ");
        System.out.println("sua agência é: " + agencia + ", sua conta: " + numero + " e seu saldo é de: " + saldoConta + ", que já está disponível para saque.");

    }
}
