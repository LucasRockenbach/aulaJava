package aula22;

import java.util.ArrayList;
import java.util.Collections;

public class TestaInteiros {

	public static void main(String[] args) {
		ArrayList<Integer> inteiros = new ArrayList<Integer>();
		
		
		
		
		inteiros.add(50);
		inteiros.add(0);
		inteiros.add(20);
		inteiros.add(-10);
		inteiros.add(60);
		inteiros.add(20);
		System.out.println("antes de usar a classe collections com o metodo de ordenação " + inteiros);
		
		Collections.sort(inteiros);
		
		System.out.println("depois de usar a classe collections com o metodo de ordenação " + inteiros);
		
		// a busca binaria tem que ser feita com uma lista ordenada
		System.out.println("posição do elemento 20 por busca binarios: " + Collections.binarySearch(inteiros, 20));
		
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		
		numeros.add(12);
		numeros.add(-20);
		numeros.add(10);
		numeros.add(14);
		numeros.add(85);
		
		//Em matemática, dois conjuntos são ditos disjuntos se não tiverem nenhum elemento em comum
		System.out.println("conjuntos dijuntos? " + Collections.disjoint(inteiros, numeros));
		
		//frequencia em que o elementos informado aparece 
		System.out.println("Frequencia do numero 20: " +  Collections.frequency(inteiros, 20));
		
		System.out.println("elementos minimo encontrado na lista: " + Collections.min(inteiros));
		System.out.println("elementos maximo encontrado na lista: " + Collections.max(inteiros));
		
		Collections.reverse(inteiros);
		System.out.println("invertendo a lista: " + inteiros);
		
		
		
		
		

	}

}
