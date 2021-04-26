package LeandroAv1OOP.questao2;

public class Iandroid extends Cellphone {

    //Método da classe IAndroid

    public void mostrar_marca(){
        System.out.println("Iphone");
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