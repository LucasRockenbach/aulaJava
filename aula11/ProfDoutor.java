package aula11;

public class ProfessorDoutor extends Professor {
	
	protected int AnoTitulo;
	protected String instituicao;
	
	public ProfessorDoutor() {
		
	}

	public ProfessorDoutor(String departamento, String anoAdmissao, String nome, String CPF, char sexo, int anoTitulo,
			String instituicao) {
		super(departamento, anoAdmissao, nome, CPF, sexo);
		AnoTitulo = anoTitulo;
		this.instituicao = instituicao;
	}

	public int getAnoTitulo() {
		return AnoTitulo;
	}

	public void setAnoTitulo(int anoTitulo) {
		AnoTitulo = anoTitulo;
	}

	public String getInstituicao() {
		return instituicao;
	}

	public void setInstituicao(String instituicao) {
		this.instituicao = instituicao;
	}
	
	public String toString() {
		return super.toString() + " ano do titulo " + this.getAnoTitulo() + " instituição " + this.getInstituicao();
	}

}
