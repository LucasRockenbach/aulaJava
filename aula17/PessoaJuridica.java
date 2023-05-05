package aula13;

public class PessoaJuridica extends Pessoa {

	private String cnpj;

	public PessoaJuridica() {
		super();
	}

	public PessoaJuridica(String nome, String endereco, String telefone, String cnpj) {
		super(nome, endereco, telefone);
		this.cnpj = cnpj;
		
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	public String toString () {
		return super.toString() + " cnpj " + this.getCnpj();
	}
	
	
}
