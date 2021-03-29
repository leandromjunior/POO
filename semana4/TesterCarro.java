package semana4;

public class TesterCarro {
    public static void main(String[] args) {
        
        BMW bmw = new BMW();

        bmw.setCor("Azul");
        bmw.setNum_acentos(5);
        bmw.setVelocidade(270);

        bmw.imprimir();
    }
}
