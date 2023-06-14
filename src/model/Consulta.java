package model;



import java.sql.*;
public class Consulta {
    public void NewConsulta() {
        try {
            Conexao objConexao = new Conexao();

            Connection connection = objConexao.getConnection();

            System.out.println(connection);

            // Cria um objeto Statement para executar a consulta
            Statement statement = connection.createStatement();

            // Executa a consulta
            String query = "SELECT * FROM cliente";
            ResultSet resultSet = statement.executeQuery(query);

            // Processa os resultados
            while (resultSet.next())
            {
                int id = resultSet.getInt("idCliente");
                String nome = resultSet.getString("nome");
                // Processar os dados obtidos do banco de dados
                System.out.println("ID: " + id + ", Nome: " + nome);
            }

            // Fecha os recursos
            resultSet.close();
            statement.close();
            connection.close();
        }
        catch (SQLException e)
        {
            e.printStackTrace();
            System.out.println(e);
            System.out.println("Deu Ruim");
        }
    }
}