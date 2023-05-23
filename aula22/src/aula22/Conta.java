package aula22;

public class Conta {
	
	private double saldo;

	public Conta(double saldo) {
		super();
		this.saldo = saldo;
	}
	
	public Conta() {
		
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void depositar(int valor) {
		this.setSaldo(saldo + valor);
	}
	
	public void sacar(int valor) {
		
			if(valor <= this.getSaldo()) {
				this.setSaldo(saldo - valor); 
			}
		
		
	}
	public String Imprime() {
	
		return "o saldo em sua conta é: " + getSaldo();
	}


}
