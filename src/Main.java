import javax.sound.midi.SysexMessage;
import java.sql.Connection;

public class Main {
    public static void main(String[] args) {

        // Construtor do Banco de Dados
        Conexao banco = new Conexao();

        // Cria a Conexao com o DB
        banco.getConnection();



    }
}