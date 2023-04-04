package aula11;

public class Professor extends Pessoa {
	protected String departamento;
	protected String anoAdmissao;
	
	
	public Professor(String departamento, String anoAdmissao, String nome, String CPF, char sexo) {
		super(nome, CPF, sexo);
		this.departamento = departamento;
		this.anoAdmissao = anoAdmissao;
	}
	public Professor () {
		
	}
	public String getDepartamento() {
		return departamento;
	}
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	public String getAnoAdmissao() {
		return anoAdmissao;
	}
	public void setAnoAdmissao(String anoAdmissao) {
		this.anoAdmissao = anoAdmissao;
	}
	
	public String toString() {
		return super.toString() + "departamento " + this.getDepartamento() + this.anoAdmissao;
	}
	
	
}
