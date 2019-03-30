package repositorios.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import connection.ConnectionFactory;
import repositorios.bean.JuizBean;

public class JuizDAO {

	public void create(JuizBean jzb) {
		
		Connection con = ConnectionFactory.open();
		PreparedStatement pstmt = null;
		
		try {
			
			pstmt = con.prepareStatement("INSERT INTO TbJuiz VALUES (?)");
			
			pstmt.setString(1, jzb.getNmJuiz());
			
			pstmt.executeUpdate();
			
			//JOptionPane.showMessageDialog (null,"Salvo!");
		
		} catch (SQLException e) {
			
			JOptionPane.showMessageDialog (null,"ERRO!");
		
		}finally {
			
			ConnectionFactory.closeConnection(con, pstmt);
		}
	}
}
