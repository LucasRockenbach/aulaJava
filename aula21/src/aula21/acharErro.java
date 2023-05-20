package aula21;

import java.lang.reflect.Array;

public class acharErro {
	
	public void metodo1() {
		System.out.println("inicio do metodo 1");
	
		metodo2();
		System.out.println("fim do metodo 1");
	}


	public void metodo2() {
	System.out.println("inicio metodo 2");
	int[] vetor = new int[10];
	try {
		for(int i = 0; i<15; i++) {
		vetor[i] = i;
		System.out.println(i);
	}
	}catch(ArrayIndexOutOfBoundsException a){
		System.out.println("To Sting " + a.toString());
		System.out.println("Get mensagem " + a.getMessage());
		
	}
	finally {
		System.out.println("fim do metodo 2");
	}

	}

}

