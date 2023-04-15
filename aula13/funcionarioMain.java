package aula13;

public class funcionarioMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		funcionario f1 = new funcionario();
		
		f1.setNome("predo ferreira");
		f1.setCPF("1052452155-04");
		f1.setSalario(1000);
		f1.bonificacao();
		
		System.out.println("funcionario " + f1.getNome() + " bonificação " +  f1.bonificacao());
		
		Gerente g1 = new Gerente();
		
		g1.setNome("carlos");
		g1.setCPF("10000000-00");
		g1.setSalario(1500);
		g1.setSetor("adm");
		g1.bonificacao();
		
		System.out.println("Gerente " + g1.getNome() + " bonificação " +  g1.bonificacao());
		
		controleGastos c1 = new controleGastos();
		
		c1.adicionaGasto(f1);
		c1.adicionaGasto(g1);
		
		System.out.println(c1.getTotalGastos());
		
		
		
		

	}

}
