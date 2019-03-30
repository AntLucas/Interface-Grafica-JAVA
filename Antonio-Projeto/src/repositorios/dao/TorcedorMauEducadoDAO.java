package repositorios.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import connection.ConnectionFactory;
import repositorios.bean.TorcedorEducado;
import repositorios.bean.TorcedorMauEducado;

public class TorcedorMauEducadoDAO {
	
	public void create(TorcedorMauEducado tme) {
		
		Connection con = ConnectionFactory.open();
		PreparedStatement pstmt = null;
		
		try {
			
			pstmt = con.prepareStatement("INSERT INTO TbTorcedorMauEducado VALUES (?, ?, ?, ?, ?)");
			
			pstmt.setInt(1, tme.getIdTime());
			pstmt.setString(2, tme.getNmTorcedor());
			pstmt.setString(3, tme.getNacionalidade());
			pstmt.setString(4, tme.getDtNascimento());
			
			pstmt.executeUpdate();
			
			//JOptionPane.showMessageDialog (null,"Salvo!");
		
		} catch (SQLException e) {
			
			JOptionPane.showMessageDialog (null,"ERROR! " + e);
		
		}finally {
			
			ConnectionFactory.closeConnection(con, pstmt);
		}
	}
}
