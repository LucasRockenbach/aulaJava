package aula21;

import java.util.InputMismatchException;
import java.util.Scanner;

public class IMC {


	public static void main (String []args) {
		
		Scanner input = new Scanner(System.in);
		try {
			System.out.println("digite o seu peso ");
			double peso = input.nextDouble();
			System.out.println("digite a sua altura ");
		double altura = input.nextDouble();
		
		if(altura == 0) {
			throw new ArithmeticException();
		}else {
			System.out.println("IMC " + (peso/(altura*altura)));
		}

		}catch(InputMismatchException i) {
			System.out.println("erro " + i.getMessage());
			System.out.println("mensagem " + i.toString());
			double altura = input.nextDouble();
			
		}catch(ArithmeticException a) {
			System.out.println("erro de divisão por zero " + a.getMessage());
			double peso = input.nextDouble();
				
			
			
		}
		
		
	}
	
	
}
