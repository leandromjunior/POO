package semana4;

public class Pessoa{
    
    private String nome;
    private int idade;
    private String sexo;

    //Constructor

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public Pessoa(){

    }

    //gerar métodos acessores

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    //Métodos da classe

    public void fazerAniversario(){
        System.out.println(" Boa noite " + this.nome + ", Feliz Aniversário! ");
    }

    public void comprarLanche(){
        System.out.println("Comprou lanche!!!");
    }
    
}