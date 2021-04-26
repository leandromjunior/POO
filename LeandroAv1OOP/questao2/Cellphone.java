/* 2.1 - Crie uma classe abstrata chamada CellPhone com os seguintes atributos e métodos:
- atributo privado booleano ligado
- metodo publico ligar()
- metodo público desligar()
- programe os métodos para colocar verdadeiro ou falso no flag ligado
*/

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
