package aula19;

public class Bicicleta implements Emissao{
	private boolean eletrica;
	
	

	public Bicicleta(boolean eletrica) {
		super();
		this.eletrica = eletrica;
	}
	
	public Bicicleta() {
		
	}



	@Override
	public double QtnEmitida() {
		
		return 0;
	}
	
	
}
