package aula21;

public class ExcecaoParImpar extends Exception{
	private int num;
	
	public ExcecaoParImpar() {
		
	}

	public ExcecaoParImpar(int num) {
		super();
		this.num = num;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
	
	public String toString() {
		return "o numero " + num + " é impar! ";
	}
	
	public String getMessage() {
		
		return " o numero é impar"; 
	}
	
}
