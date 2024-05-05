import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o seu nome:");
        String nomeCliente = scanner.nextLine();

        System.out.println("Digite o número da agência:");
        String numeroAgencia = scanner.next();

        System.out.println("Digite o número da conta:");
        int numeroConta = scanner.nextInt();

        System.out.println("Digite o saldo inicial:");
        double saldo = scanner.nextDouble(); 

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "+ numeroAgencia + ", conta número " + numeroConta + " e seu saldo "+ saldo + " já está disponível para saque");
    }
}
