package Aula7;

import java.sql.*;

import javax.swing.JOptionPane;



/*
 * Classe para abrir ou fechar a conex�o com o banco de dados
 */
public class Conexao {
	static Connection conexao;
	PreparedStatement pstmt;
	Statement stmt;
	ResultSet rs;

	// metodo que retornar a conex�o
	public static Connection abreConexao() throws Exception {		
		// String para pegar o caminho da pasta raiz do projeto.
		String caminho = System.getProperty("user.dir");	
		//driver de conex�o para o SQLite
		Class.forName("org.sqlite.JDBC");
		// Abrindo a conex�o com o banco de dados, que encontra-se na pasta raiz do projeto, na sub-pasta "bd"
		conexao = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\cquadros\\workspace\\ado\\src\\Aula7\\bd\\BD_TESTE.db");
		//conexao.setAutoCommit(false);
		//conexao.setAutoCommit(true);
		
		return conexao;
	}

	//metodo para fechar uma conex�o
	public static void fechaConexao() {
			try {
			conexao.close();
			//JOptionPane.showMessageDialog(null, "banco fechado");
		} catch (SQLException fecha) {
			//JOptionPane.showMessageDialog(null, "N�o foi possivel " + "fechar o banco de dados: " + fecha);
		}

	}
}

	

