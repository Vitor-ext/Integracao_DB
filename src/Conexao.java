/* Autor: ❣️🚀❣️ Vitor de Jesus ❣️🚀❣️
   Data: 14/06/2023
 */


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Conexao {
        private String servidor, banco, usuario, senha;
        private Connection conexao;

        Conexao(){
            this.servidor  = "172.16.28.144";
            this.banco = "db_java";
            this.usuario = "root";
            this.senha = "";
        }

        public boolean Connect(){

            try {
                this.conexao = DriverManager.getConnection("jdbc:mysql://"+this.servidor+"/"+this.banco,this.usuario,this.senha);
                return true;
            }
            catch (SQLException ex){
                System.out.println("OCORREU UM ERRO AO ACESSAR O BANDO DE DADOS");
                System.out.println(ex);
                return false;
            }
            finally{
            if (conexao != null){
                //conexao.close();
            }
        }
        }

        public Connection getConnection(){
            Connect();
            return conexao;
        }

}
