package aula19;

public class Predio implements Emissao{
	
	private int numeroPessoas;
	private boolean EnergiaRenovavel;
	private int Lampadas;
	private int ArCondicionado;
	

	
	

	public Predio(int numeroPessoas, boolean energiaRenovavel, int lampadas, int arCondicionado) {
		super();
		this.numeroPessoas = numeroPessoas;
		EnergiaRenovavel = energiaRenovavel;
		Lampadas = lampadas;
		ArCondicionado = arCondicionado;
	}
	public Predio() {
		
	}


	public int getNumeroPessoas() {
		return numeroPessoas;
	}


	public void setNumeroPessoas(int numeroPessoas) {
		this.numeroPessoas = numeroPessoas;
	}


	public boolean isEnergiaRenovavel() {
		return EnergiaRenovavel;
	}


	public void setEnergiaRenovavel(boolean energiaRenovavel) {
		EnergiaRenovavel = energiaRenovavel;
	}


	public int getLampadas() {
		return Lampadas;
	}


	public void setLampadas(int lampadas) {
		Lampadas = lampadas;
	}


	public int getArCondicionado() {
		return ArCondicionado;
	}


	public void setArCondicionado(int arCondicionado) {
		ArCondicionado = arCondicionado;
	}

	public double QtnEmitida() {
		double emissao;
		if(EnergiaRenovavel == true) {
			emissao = 14.4 * ((this.getLampadas()+10) * (this.getNumeroPessoas() + 100) * this.getArCondicionado())/2;
			System.out.println(emissao);
			return emissao;
		}else {
			emissao = 14.4 * (this.getLampadas()+10) * (this.getNumeroPessoas() + 100) * this.getArCondicionado();
			System.out.println(emissao);
			return emissao;
		}
		
	}
	


}
