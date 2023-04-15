package aula13;

public class aluno {

	private String nome;
	private double registro;
	private double mensalidade;
	
	public aluno () {
		
	}

	public aluno(String nome, double registro, double mensalidade) {
		super();
		this.nome = nome;
		this.registro = registro;
		this.mensalidade = mensalidade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getRegistro() {
		return registro;
	}

	public void setRegistro(double registro) {
		this.registro = registro;
	}

	public double getMensalidade() {
		return mensalidade;
	}

	public void setMensalidade(double mensalidade) {
		this.mensalidade = mensalidade;
	}

	public double pagarMensalidade(int dia) {
		double valor;
		if(dia <= 5) {
			valor = mensalidade - (mensalidade * 0.05);
		}if(dia > 10) {
			valor = mensalidade + (mensalidade * 0.10);
		}
		else {
			valor = mensalidade;
		}
		
		return valor; 
	}
	
	
}
