package aula21;

public class ExcecaoConta extends Exception {
	
	private int saldo;

	public ExcecaoConta(int saldo) {
		super();
		this.saldo = saldo;
	}
	
	public ExcecaoConta() {
		
	}

	public int getSaldo() {
		return saldo;
	}

	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}
	
	public String getMessage() {
		return "saldo insuficiente"; 
	}

}
