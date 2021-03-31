package semana5;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Locale;

public class Ibovespa {
    
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in); 
        teclado.useLocale(Locale.US); // Para poder entrar com o valor float utilizando ponto(.)

        String nome = "";
        float preco = 0.0f;

        try {
            
            System.out.println("Informe o código da ação:");
            nome = teclado.next();

            System.out.println("Informe o preço da ação:");
            preco = teclado.nextFloat();

        } catch (Exception e) {
            System.out.println("Esperado um valor real. Tente novamente quando houver um Loop!!!");
        }
        

        Acao petr4_1 = new Acao();
        petr4_1.setNome(nome);
        petr4_1.setPreco(preco); 
        petr4_1.setValorizacao(0.01f);

        Acao petr4_2 = new Acao();
        petr4_2.setNome("PETR4");
        petr4_2.setPreco(25.30f); // Como o valor não está sendo lido do teclado usa-se o f (float)
        petr4_2.setValorizacao(0.01f);
        

        //Criando Array de objetos da classe
        ArrayList<Acao> acoes = new ArrayList<Acao>();
        acoes.add(petr4_1);
        acoes.add(petr4_2);
        
        petr4_1.listar(acoes); // Lista de ações
        petr4_2.ordenar(acoes); // Lista ordenada crescente de acordo com os preços das ações

        teclado.close();

    }
}
