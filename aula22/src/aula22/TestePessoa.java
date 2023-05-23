package aula22;

import java.util.ArrayList;
import java.util.Collections;

public class TestePessoa {

	public static void main(String[] args) {
		
		ArrayList<Pessoa> pessoa = new ArrayList<Pessoa>();
		Pessoa p1 = new Pessoa();
		
		p1.setCPF("50505005050");
		p1.setDataNascimentos("10/10/1980");
		p1.setNome("Clarice amaral");
		

		
		Pessoa p2 = new Pessoa();
		
		p2.setCPF("80808080880");
		p2.setDataNascimentos("20/10/1998");
		p2.setNome("Joao biruta");
		
        Pessoa p3 = new Pessoa();
		
		p3.setCPF("101010101010");
		p3.setDataNascimentos("18/01/1995");
		p3.setNome("Predo pedro");
		
		pessoa.add(p2);
		pessoa.add(p1);
		pessoa.add(p3);
		
		System.out.println("ANTES DE ORDENAR" + pessoa);
		
		
		Collections.sort(pessoa);
		System.out.println("DEPOIS DE ORDENAR " + pessoa);
		
		

	}

}
