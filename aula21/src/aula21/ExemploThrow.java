package aula21;

import java.util.Scanner;

public class ExemploThrow {
	public static void main(String [] args) {
		String senha = "123456";
		Scanner in = new Scanner (System.in);
		String senha_usuario;
		System.out.println("informe a senha:");
		senha_usuario = in.next();
		try {
			if(senha.equals(senha_usuario)) {
			System.out.println("Senha correta");
		}else {
			throw new Exception("A senha esta incorreta");
		}
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
		
	}

}
