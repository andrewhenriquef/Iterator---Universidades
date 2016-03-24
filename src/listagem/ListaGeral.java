package listagem;

import aluno.AlunoEnsinoSuperior;
import iteracao.Iterator;

public class ListaGeral {

	ListaAlunosUfscar alunoUfscar = new ListaAlunosUfscar();
	//ListaAlunosIfsp alunosIfsp = new ListaALunosIfsp();
	Iterator ufscarIterator = alunoUfscar.criaIterator();
	//Iterator ifspIterator = alunosIfsp.createIterator();
	
	public void geraListaTodosAlunos(){
		imprimeAlunos(ufscarIterator);
		System.out.println("------------------");
		//imprimeAlunos(ifspIterator);
	}
	
	public void imprimeAlunos(Iterator iterator){
		while(iterator.hasNext()){
			AlunoEnsinoSuperior aluno = (AlunoEnsinoSuperior) iterator.next();
			System.out.println("Aluno: " + aluno.getNome() + " - " 
					+ aluno.getCurso() + "-"
					+ aluno.getAnoInicio() + " - ");
		}
	}
	
}
