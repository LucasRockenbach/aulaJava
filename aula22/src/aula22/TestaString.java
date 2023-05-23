package aula22;

import java.util.ArrayList;
import java.util.Collections;

public class TestaString {

	public static void main(String[] args) {
		ArrayList<String> nomes = new ArrayList<String>();
		
		nomes.add("Pedro marques");
		nomes.add("Ana maria");
		nomes.add("Rodrigo santana");
		nomes.add("Rebeca de andrade");
		nomes.add("Bianca alvares");
		
		// ordenação por ordem alfabetica
		Collections.sort(nomes);
		System.out.println(nomes);
		
		
		System.out.println("posição do elemento 'Rodrigo satana' por busca binarios: " + Collections.binarySearch(nomes, "Rodrigo santana"));
		
		
ArrayList<String> apelidos = new ArrayList<String>();
		
		apelidos.add("Pedrao");
		apelidos.add("namaria");
		apelidos.add("drigo");
		apelidos.add("Beca");
		apelidos.add("Bia");
		
		System.out.println("conjuntos dijuntos? " + Collections.disjoint(nomes, apelidos));
		
		
		System.out.println("Menor elementos da lista por ordem alfabetica " + Collections.min(nomes));
		System.out.println("Maior elementos da lista por ordem alfabetica " + Collections.max(nomes));
		
		Collections.reverse(nomes);
		System.out.println("lista na ordem invertida " + nomes);

	}

}
