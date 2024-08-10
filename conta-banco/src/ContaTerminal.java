import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        float saldo = 237.48f;

        /*
        Numero	Inteiro	1021
        Agencia	Texto	067-8
        Nome Cliente	Texto	MARIO ANDRADE
        Saldo	Decimal	237.48

        "Olá [Nome Cliente], obrigado por criar uma conta em nosso banco, sua agência é [Agencia], conta [Numero] e seu saldo [Saldo] já está disponível para saque".
         */

        System.out.println("Por favor, digite o número da Conta");
        int conta = scanner.nextInt();

        System.out.println("Digite o número da Agência");
        String agencia = scanner.next();

        System.out.println("Digite o nome do cliente");
        String nome = scanner.next();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo R$ %.2f já está disponível para saque.", nome, agencia, conta, saldo);


        scanner.close();

    }
}
