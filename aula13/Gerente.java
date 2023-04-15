package aula13;

public class Gerente extends funcionario{
	
	protected String setor;
	
	public Gerente () {
		
	}

	public Gerente(String setor, String nome, String CPF, double salario) {
		super(nome,CPF,salario);
		this.setor = setor;
	}

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}
	
	public double bonificacao() {
		
		return this.getSalario() * 0.15;
	}
	

}
