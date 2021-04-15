package semana6ex.principal;

import semana6ex.entidades.Circulo;
import semana6ex.entidades.Forma;
import semana6ex.entidades.Quadrado;
import semana6ex.util.UtilFormas;

import java.util.ArrayList;

public class Programa {
    
    public static void main(String[] args) {
        
        Double raio;
        Double lado;

        raio = UtilFormas.lerCirc();
        Circulo circulo = new Circulo(raio);
        
        
        //Quadrado

        lado = UtilFormas.lerQuadrado();
        Quadrado quadrado = new Quadrado(lado);

        //Implementar o metodos(s) a seguir:
            //- UtilFormas.ler(circulo)
            //- UtilFormas.ler(quadrado)


        ArrayList<Forma> formas = new ArrayList<Forma>();

        formas.add(circulo);
        formas.add(quadrado);

        UtilFormas.imprimir(formas);
        UtilFormas.imprimir(circulo);

    }
}
