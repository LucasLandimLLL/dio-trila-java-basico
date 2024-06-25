import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String [] args) throws Exception {
       Double saldo = 500.99;

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
    
    System.out.println("digite o seu nome");
    String cliente = scanner.next();

    System.out.println("digite a agência ?");
    String agência = scanner.next();

    System.out.println("digite a conta");
    String conta = scanner.next();

    System.out.println("seu saldo é");
    
    System.out.println("Olá " +  cliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agência + " conta " + conta + " valor de saldo = " + saldo + " está disponível para saque.");
    
    }
}