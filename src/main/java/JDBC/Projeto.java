
package JDBC;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Projeto {

    public static void main(String[] args) {
        final String login = "postgres";
        final String senha = "123456789";
        final String url = "jdbc:postgresql://localhost:5432/postgres";
        final String instrucaoSelect = "SELECT * FROM alunos";
        final String driverBanco = "org.postgresql.Driver";

        try {
            Class.forName(driverBanco);
            Connection conexao = DriverManager.getConnection(url, login, senha);            
            PreparedStatement preparedStatement = conexao.prepareStatement(instrucaoSelect);         
            ResultSet rs = preparedStatement.executeQuery();
            
            while(rs.next()) {
            	int id = rs.getInt("id");
            	String nome = rs.getString("nome");
            	System.out.println("Id: " + id + " - Nome: " + nome);
            }
            System.out.println("Consulta Realizada com sucesso");
            
        } catch (Exception exception) {
            exception.printStackTrace();

        }
    }
}