import java.util.Scanner;

public class InvestigacaoCrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        String[] perguntas = {
            "Telefonou para a vítima? (s/n) ",
            "Esteve no local do crime? (s/n) ",
            "Mora perto da vítima? (s/n) ",
            "Devia para a vítima? (s/n) ",
            "Já trabalhou com a vítima? (s/n) "
        };

        int respostasPositivas = 0;

        for (String pergunta : perguntas) {
            System.out.print(pergunta);
            String resposta = scanner.nextLine().trim().toLowerCase();

            if (resposta.equals("s")) {
                respostasPositivas++;
            }
        }

        if (respostasPositivas == 2) {
            System.out.println("Classificação: Suspeita");
        } else if (respostasPositivas >= 3 && respostasPositivas <= 4) {
            System.out.println("Classificação: Cúmplice");
        } else if (respostasPositivas == 5) {
            System.out.println("Classificação: Assassino");
        } else {
            System.out.println("Classificação: Inocente");
        }

        scanner.close();
    }
}
