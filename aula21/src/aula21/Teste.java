package aula21;

import java.util.Scanner;

public class Teste {
	public static void main(String []Args) {
		
		ParImpar p = new ParImpar();
		Scanner input = new Scanner(System.in);
		System.out.println("informe o numero ");
		int num = input.nextInt();
		p.setNum(num);
		p.verifica();
		
		System.out.println("iforme outro numero ");
		num = input.nextInt();
		p.setNum(num);
		
		try {
			p.verifica2();
		}catch(ExcecaoParImpar e) {
			System.out.println(e.toString());
		}
		
	}

}
