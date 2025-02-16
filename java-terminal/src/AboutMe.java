import java.util.Scanner;
import java.util.Locale;
public class AboutMe {
    
    @SuppressWarnings("resource")
    public static void main(String[] args)  {
        /* //Utilizando args
        String nome = args[0];
        int idade = Integer.valueOf(args[1]);
        double altura = Double.valueOf(args[2]);*/
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Digite Seu nome");
        String nome = scanner.next();
        System.out.println("Digite sua idade");
        int idade = scanner.nextInt();
        System.out.println("Digite sua altura");
        double altura = scanner.nextDouble();

        System.out.println("Olá, meu nome é " + nome);
        System.out.println("Tenho " + idade + " anos");
        System.out.println("Minha altura é " + altura + "m");
    }
}
