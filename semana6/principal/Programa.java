package semana6.principal;

import semana6.entidades.Circulo;
import java.util.Scanner;

public class Programa {
    
    public static void main(String[] args) {
        
        Double raio;

        Scanner in = new Scanner(System.in);

        System.out.println("Entre com o raio: ");
        raio= in.nextDouble();

        Circulo circulo = new Circulo(raio);

        System.out.println("Area = "+circulo.getArea());

        in.close();
    }
}
