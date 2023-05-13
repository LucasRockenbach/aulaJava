package aula19;

public class Automovel implements Emissao{

	private int Combustivel;
	private double KmRodados;
	
	
	
	
	
	public Automovel(int combustivel, double kmRodados) {
		super();
		Combustivel = combustivel;
		KmRodados = kmRodados;
	}

	public Automovel() {
		
	}


	public int getCombustivel() {
		return Combustivel;
	}



	public void setCombustivel(int combustivel) {
		Combustivel = combustivel;
	}



	public double getKmRodados() {
		return KmRodados;
	}



	public void setKmRodados(double kmRodados) {
		KmRodados = kmRodados;
	}



	@Override
	public double QtnEmitida() {
		double emissao;
		if(this.getCombustivel() == 1) {
			emissao = 96 * this.getKmRodados();
			System.out.println(emissao);
			return emissao;
		}if(this.getCombustivel() == 2) {
			emissao = 53* this.getKmRodados();
			System.out.println(emissao);
			return emissao;
			
		}if(this.getCombustivel() == 3) {
			emissao = 171* this.getKmRodados();
			System.out.println(emissao);
			return emissao;
		}
		return 0;
	}
	
	
}
