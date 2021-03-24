public class Funcionario extends Pessoa {
    
    private String setor;
    private boolean trabalhando;

    //constructor

    public Funcionario(){
        trabalhando = false;
    }


    public String getSetor() {
        return setor;
    }
    public void setSetor(String setor) {
        this.setor = setor;
    }
    public boolean isTrabalhando() {
        return trabalhando;
    }
    public void setTrabalhando(Boolean trabalhando) {
        this.trabalhando = trabalhando;
    }

    //métodos da classe

    public void mudarTrabalho(){
        System.out.println("Mudou de Trabalho!!");
    }
    
}
