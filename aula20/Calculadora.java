package aula20;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculadora {

	private int x;
	private int y;
	
	public Calculadora(){
		
	}
	
	

	public Calculadora(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}



	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public int somar() {
		return x + y;
	}
	public int subtracao(){
		return x - y;
	}
	public int multiplicacao() {
		return x * y;
	}
	public int divisao() {
		boolean cont = false;
		int resultado = 0;
		Scanner input = new Scanner(System.in);
		while (!cont) {
			
		
		
		try {
			resultado = x / y;
			cont = true;
		} catch (ArithmeticException e) {
			System.out.println("erro de divisão por zero" + e.getMessage());
			System.out.println("informe novamente o segundo numero");
			y = input.nextInt();
			
			
		}
		
		}
		return resultado;
	}
	
	public int divisao2() {
		Scanner input = new Scanner(System.in);
		
		try {
		System.out.println("informe o primeiro numero ");
		int x = input.nextInt();
		System.out.println("informe o segundo numero ");
		int y = input.nextInt();
		return x / y;
		}catch (Exception e) {
			System.out.println("exeção capturada " + e.toString());
		}finally {
			System.out.println("execução finilizada com ou sem lançamento de exeção");
		}
		/*catch(ArithmeticException a) {
			System.out.println("erro de divisao por zero " + a.getMessage() );
		}
		catch(InputMismatchException i) {
			System.out.println("erro de entrada de dados " + i.toString() );
		}*/
		return -1;
		
		
		
	}
	
	
	
}
