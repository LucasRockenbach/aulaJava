package aula19;

import java.util.ArrayList;

public class Cidade {

	private ArrayList<Emissao> elementos = new ArrayList<Emissao>();
	
	
	
	
	public ArrayList<Emissao> getElementos() {
		return elementos;
	}




	public void setElementos(ArrayList<Emissao> elementos) {
		this.elementos = elementos;
	}




	public void Adicionar(Emissao elemento) {
		elementos.add(elemento);

	}
	
	public double EmissaoMensal() {
		double emissao = 0;
		for(int i=0; i< elementos.size(); i++) {
			emissao = emissao + elementos.get(i).QtnEmitida();
			
		}
		
		System.out.println("a quantidade mensal emitida é " + emissao);
		return emissao;
				
	}
}
