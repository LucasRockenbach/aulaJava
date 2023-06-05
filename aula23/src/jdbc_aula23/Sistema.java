package jdbc_aula23;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class Sistema {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost/novo";
		String user = "root";
		String pass = "@Luquinha10";
		
		Scanner input = new Scanner(System.in);
		
		/*System.out.println("digite o nome da pessoa");
			String nome = input.next();
			System.out.println("digite o email da pessoa");
			String email = input.next();*/
			
		Pessoa p1 = new Pessoa();
		ArrayList<Pessoa> listaPessoa = new ArrayList<>();
		try {
			Connection con = DriverManager.getConnection(
					url, user, pass);
			System.out.println("Conectado!");
			//p1.inserirPessoa(con);
			listaPessoa = p1.listarPessoas(con);
			
			
			
			/*p1.inserirPessoa(con);*/
			System.out.println(listaPessoa);
			con.close();
		}catch(SQLException ex) {
			System.out.println("Erro ao conectar no banco"
		+ ex.getMessage());
		}
		
		
		
	}

}