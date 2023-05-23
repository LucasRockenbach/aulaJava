package aula22;

import java.util.HashMap;

public class TestaMapa {

	public static void main(String []Args) {
		
		HashMap<String, Conta> contas = new HashMap<String, Conta>();
		
		Conta c1 = new Conta();
		c1.setSaldo(3000);
		
		Conta c2 = new Conta();
		c2.setSaldo(2000);
		
		contas.put("maria das neves", c1);
		contas.put("pedro casas", c2);
		
		System.out.println(contas.get("maria das neves"));
		
		System.out.println(contas.get("maria das neves").getSaldo());
		
	}
}
