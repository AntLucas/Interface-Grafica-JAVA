package repositorios.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import connection.ConnectionFactory;
import repositorios.bean.GandulaBean;

public class GandulaDAO {
	
	public void create(GandulaBean gb) {
		
		Connection con = ConnectionFactory.open();
		PreparedStatement pstmt = null;
		
		try {
			
			pstmt = con.prepareStatement("INSERT INTO TbGandula VALUES (?)");
			
			pstmt.setString(1, gb.getNmGandula());
			
			pstmt.executeUpdate();
			
			//JOptionPane.showMessageDialog (null,"Salvo!");
		
		} catch (SQLException e) {
			
			JOptionPane.showMessageDialog (null,"ERROR 404");
		
		}finally {
			
			ConnectionFactory.closeConnection(con, pstmt);
		}
	}
}
