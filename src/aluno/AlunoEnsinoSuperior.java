package aluno;

public class AlunoEnsinoSuperior {
	private String nome;
	private String curso;
	private int anoInicio;
	private boolean regular;
	
	public AlunoEnsinoSuperior(String nome,String curso,int anoInicio, boolean relugar){
		this.nome = nome;
		this.curso = curso;
		this.anoInicio = anoInicio;
		this.regular = regular;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public int getAnoInicio() {
		return anoInicio;
	}

	public void setAnoInicio(int anoInicio) {
		this.anoInicio = anoInicio;
	}

	public boolean isRegular() {
		return regular;
	}

	public void setRegular(boolean regular) {
		this.regular = regular;
	}
	
	
}
