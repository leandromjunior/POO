public class BMW extends Carro {

    private float velocidade;


    public float getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(float velocidade) {
        this.velocidade = velocidade;
    }

    //metodos da classe

    public void imprimir(){
        System.out.println("Cor do carro: " + this.getCor());
        System.out.println("Numero de lugares: " + this.getNum_acentos());
        System.out.println("Velocidade: " + this.velocidade);
    }
    
}
