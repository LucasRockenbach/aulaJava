package aula12;

public class Horista extends Empregado {
	
	private int horas;
	private double valor;
	
	public Horista() {
		
	}

	

	public Horista(int horas, double valor, String setor, String nome, String cpf) {
		super(nome,setor,cpf);
		this.horas = horas;
		this.valor = valor;
	}



	public int getHoras() {
		return horas;
	}

	public void setHoras(int horas) {
		this.horas = horas;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public String toString() {
		
		return super.toString() + " horas trabalhadas: " + this.getHoras() + "valor: " + this.getValor();
	}
	
}
