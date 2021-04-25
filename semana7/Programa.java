package semana7;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Programa{
    public static void main(String[] args) {
        
        String arquivo = "C:\\Users/lemot/Desktop/POO/semana7/votacao.csv";

        ArrayList<Voto> apuracao = new ArrayList<>();

        //Ler Arquivo
        try(BufferedReader br = new BufferedReader( new FileReader(arquivo) )){

            String linha = br.readLine();

            while(linha != null){

                //Quebra de linha onde houver virgula, remove a virgula
                String[] votos = linha.split(",");
                Voto voto = new Voto(votos[0], Integer.parseInt(votos[1]) ); //votos[0]-> nome, votos[1]-> qtdVotos(Int)

                apuracao.add(voto);

                System.out.println(linha);
                //Para não entrar em loop infinito
                linha = br.readLine();
            }

        } catch(Exception e){
            System.out.println("Erro ao tentar ler o arquivo! " + e.getMessage());
        }
        //Fim ler arquivo

        System.out.println("Apuração dos votos:");
        System.out.println("---------------------");

        for (Voto voto : apuracao) {
            
            System.out.println("Candidato: "+ voto.getNome()+ " - Votos: "+voto.getQtdVotos());
        }

        //Apuração ordenada por quantidade de votos
        Collections.sort(apuracao);

        //Apuração Ordenada
        System.out.println("Apuração Ordenada dos votos:");
        System.out.println("---------------------");

        for (Voto voto : apuracao) {
            
            System.out.println("Candidato: "+ voto.getNome()+ " - Votos: "+voto.getQtdVotos());
        }

        //Apurar o vencedor
        Map<String, Integer> rank = new HashMap<>();

        for (Voto voto : apuracao) {
            
            if(rank.get(voto.getNome()) == null){
                //entrando na Hash pela primeira vez
                rank.put(voto.getNome(), voto.getQtdVotos());
            }
            else{
                //acumula/soma os votos
                Integer acumVoto = rank.get(voto.getNome());
                rank.put(voto.getNome(), voto.getQtdVotos() + acumVoto);
            }
        }

        //Mostrar resultado final
        System.out.println("Resultado final: ");
        System.out.println("-----------------------");
        for(Map.Entry<String, Integer> r1 : rank.entrySet()){
            System.out.println(r1);
        }
    }
}