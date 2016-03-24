package iteracao;

import java.util.ArrayList;

import aluno.AlunoEnsinoSuperior;

public class ListaUfscarIterator implements Iterator{

	public ArrayList<AlunoEnsinoSuperior> alunos;
	public int posicao = 0;
	
	public ListaUfscarIterator(ArrayList<AlunoEnsinoSuperior> alunos){
		this.alunos = alunos;
	}
	
	public boolean hasNext(){
		if(posicao >= alunos.size()){
			return false;
		}else{
			return true;
		}
	}
	public Object next(){
		AlunoEnsinoSuperior aluno = alunos.get(posicao);
		posicao++;
		return aluno;
	}
	
}
