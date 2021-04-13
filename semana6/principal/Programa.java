package semana6.principal;

import semana6.entidades.Circulo;
import semana6.entidades.Forma;
import semana6.entidades.Quadrado;
import semana6.util.UtilFormas;

import java.util.ArrayList;
import java.util.Scanner;

public class Programa {
    
    public static void main(String[] args) {
        
        Double raio, lado;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Entre com o raio: ");
        raio= teclado.nextDouble();

        Circulo circulo = new Circulo(raio);


        //Quadrado

        System.out.println("Entre com o lado do quadrado: ");
        lado = teclado.nextDouble();

        Quadrado quadrado = new Quadrado(lado);

        //Implementar o metodos(s) a seguir:
            //- UtilFormas.ler(circulo)
            //- UtilFormas.ler(quadrado)


        ArrayList<Forma> formas = new ArrayList<Forma>();

        formas.add(circulo);
        formas.add(quadrado);

        UtilFormas.imprimir(formas); //Não foi preciso instanciar pois declarei como static na classe MinhasFormas
        UtilFormas.imprimir(circulo);

        teclado.close();
    }
}
