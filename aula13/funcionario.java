package aula13;

public class funcionario {

	private String nome;
	private String CPF;
	protected double salario;
	
	public funcionario() {
		
	}

	public funcionario(String nome, String cPF, double salario) {
		super();
		this.nome = nome;
		CPF = cPF;
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String cPF) {
		CPF = cPF;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public double bonificacao() {
		double bonus = (salario * 0.1);
		return bonus;
	}
}
