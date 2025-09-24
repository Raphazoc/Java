package Faculdade.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DeleteBanco {

	 public static void main(String[] args) {
	        final String login = "postgres";
	        final String senha = "123456789";
	        final String url = "jdbc:postgresql://localhost:5432/postgres";
	        final String instrucaoDelete = "DELETE FROM alunos WHERE id = ?";
	        final String driverBanco = "org.postgresql.Driver";

	        try {
	            Class.forName(driverBanco);
	            Connection conexao = DriverManager.getConnection(url, login, senha);            
	            PreparedStatement preparedStatement = conexao.prepareStatement(instrucaoDelete);      
	            
	            preparedStatement.setInt(1, 10);
	           
	            
	            
	            System.out.println("Exclusao Realizada com sucesso");
	            
	        } catch (Exception exception) {
	            exception.printStackTrace();

	        
	    }
	}
}
