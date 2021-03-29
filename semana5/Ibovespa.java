import java.util.ArrayList;

public class Ibovespa {
    
    public static void main(String[] args) {
        
        Acao petr4 = new Acao();
        petr4.setNome("PETR4");
        petr4.setPreco(23.30f);
        petr4.setValorizacao(0.01f);
    
        System.out.println(petr4);

        Acao vale3 = new Acao();
        petr4.setNome("VALE3");
        petr4.setPreco(92.44f);
        petr4.setValorizacao(-0.72f);

        ArrayList<Acao> acoes = new Arraylist<Acao>();
        acoes.add(petr4);
        acoes.add(vale3);

        for (Acao minhaAcao : acoes) {
            System.out.println(minhaAcao);
        }
    }
}
