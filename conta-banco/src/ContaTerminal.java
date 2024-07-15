import java.util.Locale;
import java.util.Scanner;


public class ContaTerminal {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        

        System.out.println("Por favor, digite o seu nome !");
        double nome = scanner.nextInt();

        System.out.println("Por favor, digite o número da Agência !");
        int agencia = scanner.nextInt();
 
        System.out.println("Olá [0], obrigado por criar uma conta em nosso banco, sua agência é [Agencia], conta [Numero] e seu saldo [Saldo] já está disponível para saque");

         
    }
}
