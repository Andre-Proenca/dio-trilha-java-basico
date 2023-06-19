import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        

        System.out.println("Por favor, digite o número da agência: ");
        String agencia = scanner.next();

        System.out.println("Por favor, digite seu nome: ");
        String nome = scanner.next();

        System.out.println("Por favor, digite seu sobrenome: ");
        String sobrenome = scanner.next();

        String nomeCliente = nome + " " + sobrenome;

        System.out.println("Por favor, digite o número da conta: ");
        int numeroConta = scanner.nextInt();

        System.out.println("Por favor, insira seu saldo: ");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente.toUpperCase() + "," );
        System.out.println("obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ",");
        System.out.println("conta " + numeroConta);
        System.out.println("e seu saldo R$" + saldo + " já está disponível para saque.");

    }
}
