import java.util.Scanner;
import java.util.Locale;

public class FormatadorCep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        while (true) {
            try {
                System.out.println("\nDigite seu CEP (ou 'sair' para encerrar):");
                String cepDigitado = scanner.next();

                if (cepDigitado.equalsIgnoreCase("sair")) {
                    System.out.println("Encerrando o programa...");
                    break; // Sai do loop e encerra o programa
                }

                String cepFormatado = formatarCep(cepDigitado);
                System.out.println("CEP formatado: " + cepFormatado);

            } catch (CepInvalidoException e) {
                System.out.println("CEP inválido: " + e.getMessage());
            }
        }

        scanner.close();
    }

    static String formatarCep(String cep) throws CepInvalidoException {
        if (cep.length() != 8 || !cep.matches("\\d{8}")) {
            throw new CepInvalidoException("O CEP deve conter exatamente 8 dígitos numéricos.");
        }
        return cep.substring(0, 5) + "-" + cep.substring(5);
    }
}
