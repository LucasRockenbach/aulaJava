package aula12;

public class Assalariado extends Empregado {

	private double Salario;
	
	public Assalariado() {
		
	}

	public Assalariado(double salario, String nome, String cpf, String setor) {
		super(nome, cpf, setor);
		Salario = salario;
	}

	public double getSalario() {
		return Salario;
	}

	public void setSalario(double salario) {
		Salario = salario;
	}
	
	public String toString() {
		
		return super.toString() + " salario: " + this.getSalario();
	}

	
	
}
