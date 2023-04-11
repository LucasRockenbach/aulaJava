package aula12;

import java.util.ArrayList;

public class Empresa extends Empregado {

	protected String nome;
	protected String cnpj;
	protected ArrayList<Empregado> empregados;
	
	
	public Empresa(String nome, String cnpj, ArrayList<Empregado> empregados) {
		super();
		this.nome = nome;
		this.cnpj = cnpj;
		this.empregados = empregados;
	}
	public Empresa() {
		empregados = new ArrayList<Empregado>();
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getCnpj() {
		return cnpj;
	}


	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}


	public ArrayList<Empregado> getEmpregados() {
		return empregados;
	}


	public void setEmpregados(ArrayList<Empregado> empregados) {
		this.empregados = empregados;
	}
	
	public void adicionarEmpregado(Empregado empregado) {
		empregados.add(empregado);
	}
	
	public int quant() {
		return empregados.size();
	}
	
	public int quantHoristas() {
		int cont = 0;
		for(int i = 0; i<empregados.size(); i++) {
			if(empregados.get(i) instanceof Horista) {
				cont++;
			}
		}
		return cont;
	}
	public int quantAssalariado() {
		int cont = 0;
		for(int i = 0; i<empregados.size(); i++) {
			if(empregados.get(i) instanceof Assalariado) {
				cont++;
			}
		}
		return cont;
	}
	
	public double gastoMensal() {
		
			double custo;
			for(int i = 0; i<empregados.size(); i++) {
				if(empregados.get(i) instanceof Assalariado) {
					Assalariado a1= (Assalariado)empregados.get(i);
					custo += a1.getSalario();
				}else {
					Horista h1 = (Horista)empregados.get(i);
					custo += h1.getValor() * h1.getHoras();
			}
			return custo;
		}
		
		return 
	}
	
	
	
}
