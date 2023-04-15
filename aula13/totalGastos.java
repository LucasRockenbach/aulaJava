package aula13;

public class totalGastos {
	
	private double totalGastos;

	

	public double getTotalGastos() {
		return totalGastos;
	}

	public void setTotalGastos(double totalGastos) {
		this.totalGastos = totalGastos;
	}
	
	public void adicionarGastos(aluno a1, int dia) {
		totalGastos += a1.pagarMensalidade(dia); 
	}
}
