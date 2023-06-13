import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Conexao {

    public class Conexao {

        private String servidor, banco, usuario, senha;
        private Connection conexao;


        public void conexaoBanco(){

            this.servidor  = "localhost";
            this.banco = "db_java";
            this.usuario = "root";
            this.senha = "12345";
        }

        public boolean Connect(){

            try {
                this.conexao = DriverManager.getConnection("jdbc:mysql://"+this.servidor+"/"+this.banco,this.usuario,this.senha);
                return true;
            }
            catch (SQLException ex){
                System.out.println("OCORREU UM ERRO AO ACESSAR O BANDO DE DADOS");
                return false;
            }
            finally{
            if (conexao != null){
                conexao.close();
            }
        }
        }

        public Connection getConnection(){
            return conexao;
        }

    }

}
