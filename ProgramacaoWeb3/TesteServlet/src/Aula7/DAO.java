package Aula7;

import java.sql.Connection;
import java.util.ArrayList;

public class DAO extends Conexao {

	public void adicionar(int presente) {
		try {
			conexao = abreConexao();
			String sql = "INSERT INTO PRESENTE(nome, presente1, presente2, presente3)VALUES(?,?,?,?)";

			pstmt.execute();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
