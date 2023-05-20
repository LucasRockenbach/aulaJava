package aula21;

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
		
		try {
			if(valor <= this.getSaldo()) {
				this.setSaldo(saldo - valor); 
			}else {
				throw new ExcecaoConta(valor);
			}
		}catch(ExcecaoConta p ) {
			System.out.println("to String " + p.toString());
			System.out.println("Get message " + p.getMessage());
		}
		
		
	}
	public String Imprime() {
		System.out.println("o saldo em sua conta é " + this.getSaldo());
	
		return "o saldo em sua conta é " + getSaldo();
	}

}
