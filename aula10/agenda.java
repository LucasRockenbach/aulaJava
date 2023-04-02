package aula10;

import java.util.ArrayList;

public class Agenda {
	private ArrayList<Contato> contatos;
	
	public Agenda() {
		contatos = new ArrayList<Contato>();
	}

	public Agenda(ArrayList<Contato> contatos) {
		super();
		this.contatos = contatos;
	}

	public ArrayList<Contato> getContatos() {
		return contatos;
	}

	public void setContatos(ArrayList<Contato> contatos) {
		this.contatos = contatos;
	}
	
	public void Adicionar(Contato contato) {
		contatos.add(contato);
                System.err.println("contato adicionado com sucesso");
	}
	public void Remover(String nome) {
		for(int i = 0; i < contatos.size(); i++ ) {
			if(contatos.get(i).getNome().equals(nome)) {
				contatos.remove(i);
                                System.err.println("contato removido com sucesso");
				
			}
		}
	}
	public void Buscar(String nome) {
     
		for(int i = 0; i < contatos.size(); i++ ) {
			if(contatos.get(i).getNome().equals(nome)) {
                           System.out.println(contatos.get(i).ToString());
                        }else{
                            System.err.println("contato nao encontrado");
                        }
		
		
		
	}
          
	
	}
        public void alterarContato(String nome, String novoEmail, String novoTelefone) {
        for(int i = 0; i < contatos.size(); i++ ) {
			if(contatos.get(i).getNome().equals(nome)) {
                           contatos.get(i).setEmail(novoEmail);
                           contatos.get(i).setTelefone(novoTelefone);
                           System.out.println(contatos.get(i).ToString());
                        }
                        else {
                            System.err.println("contato nao encontrado");
                        }
        }
        }
	public void imprime() {
		for(int i = 0; i < contatos.size(); i++ ) {
			System.out.println(contatos.get(i).ToString());
			}
}
	}
