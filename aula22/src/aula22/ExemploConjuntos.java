package aula22;

import java.util.HashSet;

import java.util.Iterator;

public class ExemploConjuntos {

	public static void main(String []Args) {
		
		// recomendao para quando voce nao quer elementos repetidos na sua lista
		
		HashSet<String> cargos = new HashSet<String>();
		
		// não adiciona elementos repetidos
		cargos.add("diretor");
		cargos.add("diretor");
		cargos.add("presidente");
		cargos.add("Secretario");
		cargos.add("Analista de TI");
		
		//System.out.println(cargos);
		
		// para cada elementos faça algo
		for(String cargo: cargos) {
			//para cada elemento cargo ele vai implementar a palavra 'cargo' antes
			System.out.println("Cargo "+ cargo);
			
		}
		
		// utilizando o iterator para caminhar pela lista 
		Iterator<String> elemento = cargos.iterator();
		
		while(elemento.hasNext()) {
			System.out.println("Elemento atual " + elemento.next());
		}
		
		
		
		
		
	}
}
