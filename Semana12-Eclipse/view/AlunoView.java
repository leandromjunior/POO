package view;

import java.util.Scanner;

import bo.Aluno;
import controller.AlunoController;

public class AlunoView {
	
	public void create(){
		Scanner in = new Scanner(System.in);
		
		//instanciando objeto aluno, que está no package bo
		Aluno aluno = new Aluno();
		
		System.out.println("Entre com a matricula do aluno:");
		aluno.setMatricula(in.next());
		
		System.out.println("Entre com o nome do aluno:");
		aluno.setNome(in.next());
		
		System.out.println("Entre com a cidade do aluno:");
		aluno.setCidade(in.next());
		
		AlunoController controller = new AlunoController();
		controller.create(aluno);
	}
	
	public void read() {
		
		AlunoController controller = new AlunoController();
		
		System.out.println("Listagem de alunos");
		System.out.println("******************");
		
		for (Aluno aluno:controller.read()) {
			
			System.out.println("Matricula do aluno:" + aluno.getMatricula());
			System.out.println("Nome do aluno:" + aluno.getNome());
			System.out.println("Cidade do aluno:" + aluno.getCidade());
			System.out.println("**************************************");
		}
	}
	
	public static void main(String[] args) {
		//inicia 
		
		AlunoView crud = new AlunoView();
		
		System.out.println("Qual ação do CRUD?");
		Scanner in = new Scanner(System.in);
		
		String resposta = in.next();
		
		if (resposta.equalsIgnoreCase("c")) {
			crud.create();
		}
		else {
			crud.read();
		}
		
	}

}
