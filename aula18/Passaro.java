package aula18;

public class Passaro implements Anda, Voa{

	private int posx;
	private int posy;
	private int altura;
	
	public Passaro() {
		
	}
	
	
	public Passaro(int posx, int posy, int altura) {
		super();
		this.posx = posx;
		this.posy = posy;
		this.altura = altura;
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


	public int getAltura() {
		return altura;
	}


	public void setAltura(int altura) {
		this.altura = altura;
	}


	@Override
	public void subir(int altura) {
		altura += altura;
		
	}

	@Override
	public void descer(int altura) {
		altura -= altura;
		
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
