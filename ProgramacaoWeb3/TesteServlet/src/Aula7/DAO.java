package Aula7;

import java.sql.Connection;
import java.util.ArrayList;

public class DAO extends Conexao{
	
	public void adicionar(Presente presente){
		try {
			conexao = abreConexao();
			String sql ="INSERT INTO PRESENTE(nome, presente1, presente2, presente3)VALUES(?,?,?,?)";
			
			pstmt = conexao.prepareStatement(sql);			
			pstmt.setString(1,presente.getNome());
			pstmt.setString(2,presente.getPresente1());
			pstmt.setString(3,presente.getPresente2());
			pstmt.setString(4,presente.getPresente3());
			pstmt.execute();

		} catch (Exception e) {			
			e.printStackTrace();
		}	
	}
	
	public ArrayList<Presente> listarPedidos(){
		ArrayList<Presente>listaPedidos = new ArrayList<>();
		
		try {
			conexao = abreConexao();
			String sql = "SELECT * FROM PRESENTE";
			stmt = conexao.createStatement();
			rs = stmt.executeQuery(sql);
			
			while(rs.next()){
				Presente presente = new Presente(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4));
				listaPedidos.add(presente);
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		return listaPedidos;
	}
}
