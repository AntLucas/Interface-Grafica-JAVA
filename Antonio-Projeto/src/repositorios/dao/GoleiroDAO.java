package repositorios.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import connection.ConnectionFactory;
import repositorios.bean.GoleiroBean;

public class GoleiroDAO {
	
	public void create(GoleiroBean gb) {
		
		Connection con = ConnectionFactory.open();
		PreparedStatement pstmt = null;
		
		try {
			
			pstmt = con.prepareStatement("INSERT INTO TbGoleiro VALUES (?, ?, ?, ?, ?)");
			
			pstmt.setInt(1, gb.getIdTime());
			pstmt.setString(2, gb.getNmGoleiro());
			pstmt.setString(3, gb.getNascimento());
			pstmt.setString(4, gb.getNaturalidade());
			pstmt.setString(5, gb.getNacionalidade());
			
			pstmt.executeUpdate();
			
			//JOptionPane.showMessageDialog (null,"Salvo!");
		
		} catch (SQLException e) {
			
			JOptionPane.showMessageDialog (null,"ERROR! " + e);
		
		}finally {
			
			ConnectionFactory.closeConnection(con, pstmt);
		}
	}
}
