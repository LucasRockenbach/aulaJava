package aula12;

public class Fornecedor extends Pessoa {

	protected Double ValorCredito;
	protected Double ValorDivida;
	
	public Fornecedor(String nome, String endereco, String telefone, Double valorCredito, Double valorDivida) {
		super(nome, endereco, telefone);
		ValorCredito = valorCredito;
		ValorDivida = valorDivida;
	}
	public Fornecedor () {
		
	}

	public Double getValorCredito() {
		return ValorCredito;
	}

	public void setValorCredito(Double valorCredito) {
		ValorCredito = valorCredito;
	}

	public Double getValorDivida() {
		return ValorDivida;
	}

	public void setValorDivida(Double valorDivida) {
		ValorDivida = valorDivida;
	}
	
	public double ObterSaldo () {
		
		return this.ValorCredito - this.getValorDivida();
	}
	
	public String ToString () {
		
		return super.ToString() + " valor credito: " + this.getValorCredito() + " valor divida: " + this.getValorDivida()
		+  " saldo: " + this.ObterSaldo();
	}
	 
	
	
}
