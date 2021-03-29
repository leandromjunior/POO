package semana4;

public class PessoaTester {
    
    public static void main(String[] args) {
        
        //Pessoa pessoa = new Pessoa("Leandro"); // Acessa o construtor na classe Pessoa
        //Pessoa pessoa = new Pessoa();

        //pessoa.fazerAniversario();

        // Aluno aluno = new Aluno();

        // aluno.setNome("Leandro");
        // aluno.fazerAniversario();

        Funcionario func = new Funcionario();

        func.setNome("Leandro");
        func.fazerAniversario();
        func.mudarTrabalho();
    }
}
