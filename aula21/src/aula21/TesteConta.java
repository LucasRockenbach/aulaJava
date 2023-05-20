package aula21;

public class TesteConta {
	
	public static void main (String []Args) {

	Conta c1 = new Conta();
	
	c1.setSaldo(8000);
	c1.depositar(500);
	c1.sacar(8501);
	c1.Imprime();
	
	
	
	}
}
