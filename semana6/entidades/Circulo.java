package semana6.entidades;

public class Circulo extends Forma {
    
    private Double raio;

    public Circulo(){
        raio = 0.0; //Inicializando a variavel com 0
    }

    public Circulo(Double raio) {
        super();
        this.raio = raio;
    }
    

    @Override
    public Double getArea(){

        return Math.PI * raio * raio;
    }

    
}
