package aula13;

public class alunoBolsista extends aluno {
	private double desconto;
	
	public alunoBolsista() {
		
	}

	public alunoBolsista(double desconto, String nome, double registro, double mensalidade) {
		super(nome, registro, mensalidade);
		this.desconto = desconto;
	}

	public double getDesconto() {
		return desconto;
	}

	public void setDesconto(double desconto) {
		this.desconto = desconto;
	}
	
	public double pagarMensalidade(int dia) {
		double valorDesconto;
		if(dia <= 15) {
			
			return valorDesconto = this.getMensalidade() - desconto; 
		}else {
			return valorDesconto = this.getMensalidade();
		}
		
	}
	
}
