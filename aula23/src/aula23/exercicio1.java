package aula23;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class exercicio1 {

	public static void main(String[] args) {
		
		HashMap<String, Integer> palavras = new HashMap<String, Integer>();
		System.out.println("digite uma frase ");
		Scanner input = new Scanner(System.in);
		String frase = input.nextLine(); // next line para aparecer a frase inteira 
		String [] aux = frase.split(" ");
		
		for(int i = 0; i < aux.length; i++) {
			if(palavras.containsKey(aux[i])) {
				palavras.replace(aux[i], palavras.get(aux[i])+1 );
			}else {
				palavras.put(aux[i], 1);
			}
		}
		Set<String> chaves = palavras.keySet();
		System.out.println("palavra\tquantidade de ocorrencia\n");
		for(String word: chaves) {
			System.out.println(word + "\t" + palavras.get(word));
		}

	}
	

}
