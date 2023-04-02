package aula10;

import java.util.Scanner;

public class AgendaMain {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
                Agenda agenda = new Agenda();
                int cont = 0;
                
		do{
                    
                System.err.println("1 - ADICIONAR CONTATO");
                System.err.println("2 - REMOVER CONTATO");
                System.err.println("3 - BUSCAR CONTATO");
                System.err.println("4 - ALTERAR CONTATO");
                System.err.println("5 - MOSTRAR TODOS CONTATOS");
                System.err.println("6 - SAIR");
		cont = input.nextInt();
                
                
                
                
                    
                
                if(cont == 1){
                    
                    Contato c1 = new Contato();
			System.out.println("digite o nome do contato");
			String nome = input.next();
			c1.setNome(nome);
			System.out.println("digite o numero ");
			nome = input.next();
			c1.setTelefone(nome);
			System.out.println("digite o email");
			nome = input.next();
			c1.setEmail(nome);
                        agenda.Adicionar(c1);
                        System.err.println("contato adicionado com sucesso");}
                
                if(cont == 2){
                    System.err.println("digite o nome do contato que deseja excluir");
                    String nome = input.next();
                    agenda.Remover(nome);
                }
                if(cont == 3){
                    System.err.println("digite o nome do contato buscar");
                    String nome = input.next();
                    agenda.Buscar(nome);
                }
                if (cont == 4 ){
                    System.err.println("digite o nome do contato que quer alterar");
                    String nome = input.next();
                    System.err.println("digite o novo email");
                    String novoEmail = input.next();
                    System.err.println("digite o novo telefone");
                    String novoTelefone = input.next();
                    agenda.alterarContato(nome, novoEmail, novoTelefone);
                    
                }if (cont == 5){
                    agenda.imprime();
                }
                }while(cont != 6);
                
        
        }
                
		
}	
