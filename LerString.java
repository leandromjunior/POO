import java.util.Scanner;

public class LerString{

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        String nome = "";

        System.out.printf("Digite seu nome: ");

        nome = input.next();

        System.out.printf("\nBoa noite, %s \n", nome);
        System.out.println("Tchau " + nome);
        System.out.print("FIM!!");
    }
}
