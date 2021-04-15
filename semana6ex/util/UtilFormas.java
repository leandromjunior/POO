package semana6ex.util;

import java.util.ArrayList;
import java.util.Scanner;

import semana6ex.entidades.Circulo;
import semana6ex.entidades.Forma;
import semana6ex.entidades.Quadrado;

public final class UtilFormas {

    //Private Constructor
    private UtilFormas() { 

    }
    
    
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

    public static Double lerCirc(){
            
        Double raio;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Entre com o raio: ");
        raio = teclado.nextDouble();

        //teclado.close();

        return raio;

    }

    public static Double lerQuadrado(){
            
        Double lado;
        Scanner teclado = new Scanner(System.in);
    
        System.out.println("Entre com o lado: ");
        lado = teclado.nextDouble();
        
        //teclado.close(); 

        return lado;

        
    
    }


    // public static void ler(Circulo circulo){
    //     Double raio;
    //     Scanner teclado = new Scanner(System.in);

    //     System.out.println("Entre com o raio: ");
    //     raio = teclado.nextDouble();
    // }

}
