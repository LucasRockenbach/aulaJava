package aula13;

public class Gerente extends Funcionario {
	
	private String setor;
	
	

	public Gerente() {
		super();
	}

	public Gerente(String nome, String cpf, double salario, String setor ) {
		super(nome, cpf, salario);
		this.setor = setor;
	}

	@Override
	public double bonificacao() {
		
		return this.getSalario() * 0.15;
	}

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}

	public String toString() {
		return super.toString() + " setor " + this.getSetor();
	}
}
