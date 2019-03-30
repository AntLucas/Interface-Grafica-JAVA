package repositorios.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import connection.ConnectionFactory;
import repositorios.bean.TorcedorEducado;

public class TorcedorEducadoDAO {
	
	public void create(TorcedorEducado te) {
		
		Connection con = ConnectionFactory.open();
		PreparedStatement pstmt = null;
		
		try {
			
			pstmt = con.prepareStatement("INSERT INTO TbTorcedorEducado VALUES (?, ?, ?, ?, ?)");
			
			pstmt.setInt(1, te.getIdTime());
			pstmt.setString(2, te.getNmTorcedor());
			pstmt.setString(3, te.getNacionalidade());
			pstmt.setString(4, te.getDtNascimento());
			
			pstmt.executeUpdate();
			
			//JOptionPane.showMessageDialog (null,"Salvo!");
		
		} catch (SQLException e) {
			
			JOptionPane.showMessageDialog (null,"ERROR! " + e);
		
		}finally {
			
			ConnectionFactory.closeConnection(con, pstmt);
		}
	}
}
