package aula13;

public class controleGastos {
	private double totalGastos = 0;
	
	public double getTotalGastos() {
		
		return totalGastos;
	}
	public void adicionaGasto(funcionario f) {
		totalGastos += f.bonificacao();
		
	}
	
}
