package aula13;

import java.util.ArrayList;

public class TestePessoa {
	
	public static void main(String Args[]) {
		PessoaFisica pf1 = new PessoaFisica();
		pf1.setNome("pedro");
		pf1.setEndereco("rua coronel");
		pf1.setTelefone("0999999");
		pf1.setCpf("48484484844");
		
		
		PessoaJuridica pj1 = new PessoaJuridica();
		pj1.setNome("maria");
		pj1.setEndereco("rua martins");
		pj1.setTelefone("8888888");
		pj1.setCnpj("101010101010");
		
		
		ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
		
		pessoas.add(pf1);
		pessoas.add(pj1);
		
		for(int i = 0; i<pessoas.size(); i++) {
			System.out.println("Pessoa["+i+"]:");
			System.out.println(pessoas.get(i).toString());
		}
		
	}
	
	
	
	
}
