/* 1.2 - Crie uma classe chamada Splash que implementa a interface IJanela escrevendo "Abrindo
Janela"no método abrir e "Fechando Janela "no método fechar.
*/

package LeandroAv1OOP.questao1;

public class Splash implements IJanela {

    //Implementando métodos referentes a interface IJanela

    public void abrir() {
        System.out.println("Abrindo Janela!");
    }

    
    public void fechar() {
        System.out.println("Fechando Janela!");
    }
}
