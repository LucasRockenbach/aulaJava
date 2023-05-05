package aula13;

public class Presidente extends Funcionario{
	
	private String formacao;
	
	
	public Presidente() {
		super();
		
	}

	public Presidente(String nome, String cpf, double salario, String formacao) {
		super(nome, cpf, salario);
		this.formacao = formacao;
	}
	
	
	public String getFormacao() {
		return formacao;
	}




	public void setFormacao(String formacao) {
		this.formacao = formacao;
	}


	public double bonificacao() {
		
		return this.getSalario() * 0.20;
	}
	
	public String toString () {
		return super.toString() + " formação " + this.getFormacao();
	}
}
