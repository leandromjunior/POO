// 3.3 - Crie um método na segunda classe que acesse e altere o atributo da superclasse

//package LeandroAv1OOP.questao3;

public class Playstation extends Console {

    //Método da classe
    public void especificacao(){
        System.out.println("Modelo: Playstation "+ this.getModelo());

        if(getModelo() == 5){
            System.out.println("Armazenamento: 1TB");
        } 
        else if(getModelo() == 4){
            System.out.println("Armazenamento: 500GB");
        }
        else{
            System.out.println("Modelo Indisponivel atualmente");
        }
    }
}
