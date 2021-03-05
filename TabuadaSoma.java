/*
Leandro Motta Junior
0050014733

Exercicio Semana 2
*/

import java.util.Scanner;

public class TabuadaSoma {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int valor = 0;

        System.out.print("Digite um valor: ");

        valor = input.nextInt();

        for (int i=0; i<=10; i++){
            System.out.println(valor + "+" + i + "=" + (valor+i));
        }

        input.close(); //Utilizado para corrigir um aviso
    }
}