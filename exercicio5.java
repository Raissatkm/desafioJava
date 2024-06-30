import java.util.Scanner;

public class VerificaGenero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Digite uma letra (F ou M): ");
        String entrada = scanner.nextLine().toUpperCase();

        
        if (entrada.length() == 1) {
            char letra = entrada.charAt(0);

            
            if (letra == 'F') {
                System.out.println("F - Feminino");
            } else if (letra == 'M') {
                System.out.println("M - Masculino");
            } else {
                System.out.println("Letra inválida. Digite 'F' para Feminino ou 'M' para Masculino.");
            }
        } else {
            System.out.println("Entrada inválida. Digite apenas uma letra.");
        }

        scanner.close();
    }
}
