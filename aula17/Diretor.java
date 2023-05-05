package aula13;

public class Diretor extends Gerente {
	
	private String filial;

	public Diretor() {
		super();
	}
	

	public double bonificacao() {
		
		return this.getSalario() * 0.18;
	}

	public Diretor(String nome, String cpf, double salario, String setor, String fililal) {
		super(nome, cpf, salario, setor);
		this.filial = fililal;
	}

	public String getFilial() {
		return filial;
	}

	public void setFilial(String filial) {
		this.filial = filial;
	}
	
	public String toString () {
		return super.toString() + " filial " + this.getFilial();
	}
	
	

}
