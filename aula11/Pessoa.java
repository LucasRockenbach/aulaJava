package aula11;

public class Pessoa {
	private String nome;
	private String CPF;
	private char sexo;
	
	
	public Pessoa() {
		
	}


	public Pessoa(String nome, String cPF, char sexo) {
		super();
		this.nome = nome;
		CPF = cPF;
		this.sexo = sexo;
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


	public char getSexo() {
		return sexo;
	}


	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	
	public String toString() {
		
		return this.getNome() + " cpf " + this.getCPF() + " Sexo " + this.getSexo();
	}
}
