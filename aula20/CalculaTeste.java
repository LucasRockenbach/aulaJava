package aula20;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculaTeste {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		/*try {
		System.out.println("digite o primeiro numero");
		
		int x = input.nextInt();
		
		System.out.println("digite o primeiro numero");
		
		int y = input.nextInt();

		Calculadora c1 = new Calculadora();
		
		c1.setX(x);
		c1.setY(y);
		System.out.println("o resultado da divisao é:"+c1.divisao());
		System.out.println("o resultado da soma é:"+c1.somar());
		System.out.println("o resultado da subtração é:"+c1.subtracao());
		System.out.println("o resultado da multiplicação é:"+c1.multiplicacao());
		}
		catch(InputMismatchException i ) {
			System.out.println("Mensagem " + i.toString());
			System.out.println("erro " + i.getMessage());
			
		}*/
		
		Calculadora c2 = new Calculadora();
		System.out.println("divisao " + c2.divisao());
		
		
		
		
	}

}
