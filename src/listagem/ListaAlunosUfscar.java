package listagem;

import java.util.ArrayList;

import aluno.AlunoEnsinoSuperior;
import iteracao.Iterator;
import iteracao.ListaUfscarIterator;

public class ListaAlunosUfscar {

	ArrayList<AlunoEnsinoSuperior> alunos;
	
	public ListaAlunosUfscar(){
		this.alunos = new ArrayList<AlunoEnsinoSuperior>();
		addAluno("Danilo","Engenharia de Materiais",2005, true);
		
	}
	
	public void addAluno(String nome, String curso, int anoInicio, boolean regular){
		AlunoEnsinoSuperior novoAluno;
		novoAluno = new AlunoEnsinoSuperior(nome,curso,anoInicio,regular);
		alunos.add(novoAluno);
	}
	
	public Iterator criaIterator(){

		return new ListaUfscarIterator(alunos);

	}
}
