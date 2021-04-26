/* 2.2 - Crie uma classe IAndroid que herda de CellPhone e implementa os métodos abaixo:
- mostrar_marca() - deve exibir a "marca IPhone"
*/

package LeandroAv1OOP.questao2;

public class Iandroid extends Cellphone {

    private String marca;

    //Usando Getters and Setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    //Método da classe IAndroid

    public void mostrar_marca(){

        System.out.println("Marca: "+ this.marca);

        // System.out.println("Iphone");
    }

    //Métodos implementados da classe CellPhone
    @Override
    public Boolean ligar() {
        boolean liga;
        liga = super.ligar();
        if (liga == true){
            System.out.println("Verdadeiro");
        }

        return liga;
    }

    @Override
    public boolean desligar() {
        boolean desliga;

        desliga = super.desligar();

        if (desliga != true){
            System.out.println("Falso");
        }

        return desliga;
    }


}