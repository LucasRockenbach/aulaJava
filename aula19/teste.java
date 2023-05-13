package aula19;

import java.util.Scanner;

public class teste {

	public static void main (String Args[]) {
		
	
	Predio p1 = new Predio();
	
	p1.setArCondicionado(2);
	p1.setEnergiaRenovavel(false);
	p1.setLampadas(150);
	p1.setNumeroPessoas(40);
	p1.QtnEmitida();
	
	Predio p2 = new Predio();
	
	p1.setArCondicionado(2);
	p1.setEnergiaRenovavel(false);
	p1.setLampadas(50);
	p1.setNumeroPessoas(20);
	p1.QtnEmitida();
	
	
	Automovel a1 = new Automovel();
		
	Scanner input = new Scanner(System.in);
	System.out.println("digite 1 para alcool ou gasolina, 2 para eletrico e 3 para diesel");
	int combustivel = input.nextInt();
		a1.setCombustivel(combustivel);
		a1.setKmRodados(26000);
		a1.QtnEmitida();
		
	Cidade c1 = new Cidade();
	
	
	c1.Adicionar(a1);
	c1.Adicionar(p1);
	c1.Adicionar(p2);
	c1.EmissaoMensal();
	
	
	}
}
