package LeandroAv1OOP.questao2;

abstract class Cellphone {

    private Boolean flag = true;

    public Boolean ligar() {
        return flag;
    }

    public boolean desligar(){
        flag = false;
        return flag;
    }

}
