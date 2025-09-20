package JDBC;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class BandoDeDados {

    public static void main(String[] args) {
        final String login = "postgres";
        final String senha = "123456789";
        final String url = "jdbc:postgresql://localhost:5432/postgres";
        final String insert = "INSERT INTO alunos (nome, id) VALUES (?,?)";
        final String driverBanco = "org.postgresql.Driver";

        try {
            Class.forName(driverBanco);
            Connection conexao = DriverManager.getConnection(url, login, senha);
            
            
            PreparedStatement preparedStatement = conexao.prepareStatement(insert);
            preparedStatement.setString(1, "Vicente");
            preparedStatement.setInt(2, 10);
            
            preparedStatement.executeUpdate();
            System.out.println("Inclusão realizada com sucesso");


            
        } catch (Exception exception) {
            exception.printStackTrace();

        }
    }
}