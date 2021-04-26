// 2.3 - Crie uma classe IAndroidTester para testar todos os métodos

package LeandroAv1OOP.questao2;

public class IandroidTester {

    public static void main(String[] args) {

        Iandroid ia = new Iandroid();

        ia.ligar();
        ia.desligar();
        ia.setMarca("Iphone");
        ia.mostrar_marca();

    }
    
}
