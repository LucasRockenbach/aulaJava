package aula20;

import java.util.InputMismatchException;
import java.util.Scanner;

public class IMC {


	public static void main (String []args) {
		
		Scanner input = new Scanner(System.in);
		boolean confirm = false;
		while(!confirm) {
		try {
			System.out.println("digite o seu peso ");
			double peso = input.nextDouble();
			System.out.println("digite a sua altura ");
		double altura = input.nextDouble();
		
		double imc = peso/(altura * altura);
		confirm = true;
		
		System.out.println("o seu imc é " + imc);
		}catch(InputMismatchException i) {
			System.out.println("erro " + i.getMessage());
			System.out.println("mensagem " + i.toString());
			System.out.println("informe novamente");
			double altura = input.nextDouble();
			
		}catch(ArithmeticException a) {
			System.out.println("erro de divisão por zero" + a.getMessage());
			System.out.println("informe novamente o segundo numero");
			double peso = input.nextDouble();
				
			
			
		}}
		
		
	}
	
	
}
