package aula11;

public class Aluno extends Pessoa{
	private String curso;
	private String anoIngresso;
	public String getCurso() {
		return curso;
	}
	public Aluno() {
		
	}
	
	public Aluno(String curso, String anoIngresso, char sexo, String nome , String CPF) {
		super(nome, CPF, sexo);
		
		this.curso = curso;
		this.anoIngresso = anoIngresso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}
	public String getAnoIngresso() {
		return anoIngresso;
	}
	public void setAnoIngresso(String anoIngresso) {
		this.anoIngresso = anoIngresso;
	}
	
	public String toString() {
		return super.toString() + " curso " + this.getCurso() + " ano ingresso " + this.getAnoIngresso();
	}
}
