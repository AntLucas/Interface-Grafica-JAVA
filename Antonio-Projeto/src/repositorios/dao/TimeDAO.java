package repositorios.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import connection.ConnectionFactory;
import repositorios.bean.BatedorBean;
import repositorios.bean.TimeBean;

public class TimeDAO {
	
	public void create(TimeBean tm) {
		
		Connection con = ConnectionFactory.open();
		PreparedStatement pstmt = null;
		
		try {
			
			pstmt = con.prepareStatement("INSERT INTO TbTime VALUES (?, ?)");
			
			pstmt.setString(1, tm.getNmTime());
			pstmt.setString(2, tm.getCidade());
			
			pstmt.executeUpdate();
			
			//JOptionPane.showMessageDialog (null,"Salvo!");
		
		} catch (SQLException e) {
			
			JOptionPane.showMessageDialog (null,"ERROR! " + e);
		
		}finally {
			
			ConnectionFactory.closeConnection(con, pstmt);
		}
	}
}
