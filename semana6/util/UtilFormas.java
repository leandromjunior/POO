package semana6.util;

import java.util.ArrayList;

import semana6.entidades.Circulo;
import semana6.entidades.Forma;
import semana6.entidades.Quadrado;

public final class UtilFormas {
    
    public static void imprimir(ArrayList<Forma> formas){

        System.out.println("Areas das Formas Geométricas: ");
        //Percorrendo a lista

        for (Forma forma : formas) {
            if (forma instanceof Circulo){ //Se forma for uma instancia da classe Circulo
                System.out.println("Area do circulo: " + forma.getArea());
            }
            else if (forma instanceof Quadrado){
                System.out.println("Area do quadrado: " + forma.getArea());
            }
        }
    }

    //Referente ao metodo imprimir circulo na classe Programa
    public static void imprimir(Circulo circulo) { 
        System.out.println("Circulo");
        System.out.println("Area: " +circulo.getArea());
    }

}
