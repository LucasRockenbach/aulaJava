package aula18;

public class Tartaruga implements Anda {
	
	private int posx;
	private int posy;
	
	public Tartaruga () {
		
	}
	
	

	public Tartaruga(int posx, int posy) {
		super();
		this.posx = posx;
		this.posy = posy;
	}

	


	public int getPosx() {
		return posx;
	}



	public void setPosx(int posx) {
		this.posx = posx;
	}



	public int getPosy() {
		return posy;
	}



	public void setPosy(int posy) {
		this.posy = posy;
	}



	@Override
	public void avancar(int x, int y) {
		posx += x;
		posy += y;
	}

	@Override
	public void recuar(int x, int y) {
		posx -= x;
		posy -= y;
		
	}
	
	
}
