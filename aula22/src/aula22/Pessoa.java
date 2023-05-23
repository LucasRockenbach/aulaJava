package aula22;

public class Pessoa implements Comparable<Pessoa> {
	
	private String nome;
	private String CPF;
	private String dataNascimentos;
	
	
	public Pessoa() {
		
		
	}


	public Pessoa(String nome, String cPF, String dataNascimentos) {
		super();
		this.nome = nome;
		CPF = cPF;
		this.dataNascimentos = dataNascimentos;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getCPF() {
		return CPF;
	}


	public void setCPF(String cPF) {
		CPF = cPF;
	}


	public String getDataNascimentos() {
		return dataNascimentos;
	}


	public void setDataNascimentos(String dataNascimentos) {
		this.dataNascimentos = dataNascimentos;
	}
	
	public String toString() {
		return "\n nome " + this.getNome() + " cpf: " + this.getCPF() + " data de nascimentos " + this.getDataNascimentos();
	}


	
	public int compareTo(Pessoa o) {
		
		return this.nome.compareTo(o.nome);
	}
	

}
