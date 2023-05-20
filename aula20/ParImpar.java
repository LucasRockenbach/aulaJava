package aula21;

public class ParImpar {
	private int num;
	
	public ParImpar() {
		
	}

	public ParImpar(int num) {
		super();
		this.num = num;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
	
	public void verifica() {
		try {
			if(num % 2 == 0) {
				System.out.println("o numero é par");
			}else {
				throw new ExcecaoParImpar(num);
			}
		}catch(ExcecaoParImpar p ) {
			System.out.println("to String " + p.toString());
			System.out.println("Get message " + p.getMessage());
		}
	}
	public void verifica2() throws ExcecaoParImpar {
		
			if(num % 2 == 0) {
				System.out.println("o numero é par ");
			}else {
				throw new ExcecaoParImpar(num);
			}
		
	}
	
	
}
