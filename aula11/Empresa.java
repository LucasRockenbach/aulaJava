package aula12;

public class Empresa {

	public static void main(String[] args) {
 
		Pessoa p1 = new Pessoa();
		
		p1.setEndereco("rua acampados");
		p1.setNome("Rodrigo maques");
		p1.setTelefone("(43) 9999999");
		
		System.out.println(p1.ToString()); 
		
		
		Empregado e1 = new Empregado();
		
		e1.setSalarioBase(5000);
		e1.setEndereco("rua acampados");
		e1.setNome("Rodrigo maques");
		e1.setTelefone("(43) 9999999");
		e1.setCodigoSetor(100);
		e1.setImposto(10);
		e1.salario();
		
		System.out.println(e1.ToString());
	
	
		Fornecedor f1 = new Fornecedor();
		
		f1.setValorCredito(1000.00);
		f1.setValorDivida(100.0);
		f1.setEndereco("rua munhoz");
		f1.setNome("predo");
		f1.setTelefone("(43) 88888888");
		f1.ObterSaldo();
		
		System.out.println(f1.ToString());

}
	
	 
	 
	
	

}
