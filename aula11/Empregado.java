package aula12;

public class Empregado extends Pessoa{
	protected int CodigoSetor;
	protected double SalarioBase;
	protected int Imposto;
	
	
	public Empregado(String nome, String endereco, String telefone, int codigoSetor, double salarioBase,
			int imposto) {
		super(nome, endereco, telefone);
		CodigoSetor = codigoSetor;
		SalarioBase = salarioBase;
		Imposto = imposto;
	}
	
	public Empregado () {
		
	}


	public int getCodigoSetor() {
		return CodigoSetor;
	}


	public void setCodigoSetor(int codigoSetor) {
		CodigoSetor = codigoSetor;
	}


	public double getSalarioBase() {
		return SalarioBase;
	}


	public void setSalarioBase(double salarioBase) {
		SalarioBase = salarioBase;
	}


	public int getImposto() {
		return Imposto;
	}


	public void setImposto(int imposto) {
		Imposto = imposto;
	}
	
	public double salario() {
		
		double salario = this.getSalarioBase() * (this.getImposto()/100);
		
		return salario;
	}
	
	public String ToString () {
		
		return super.ToString() + " codigo do setor: " + this.getCodigoSetor() + " salario base" + this.getSalarioBase() + 
				" salario: " +  this.salario();
	}
	
	
	
}
