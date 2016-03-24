package application;

import listagem.ListaAlunosUfscar;
import listagem.ListaGeral;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ListaAlunosUfscar listaUfscar = new ListaAlunosUfscar();
		ListaGeral listaGeral = new ListaGeral();
		
		listaGeral.imprimeAlunos(listaUfscar.criaIterator());
		

	}

}