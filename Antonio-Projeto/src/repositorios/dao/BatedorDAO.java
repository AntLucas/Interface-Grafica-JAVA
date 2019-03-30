package repositorios.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import connection.ConnectionFactory;
import repositorios.bean.BatedorBean;

public class BatedorDAO {

		public void create(BatedorBean bb) {
			
			Connection con = ConnectionFactory.open();
			PreparedStatement pstmt = null;
			
			try {
				
				pstmt = con.prepareStatement("INSERT INTO TbBatedor VALUES (?, ?, ?, ?, ?)");
				
				pstmt.setInt(1, bb.getIdTime());
				pstmt.setString(2, bb.getNmBatedor());
				pstmt.setString(3, bb.getNascimento());
				pstmt.setString(4, bb.getNaturalidade());
				pstmt.setString(5, bb.getNacionalidade());
				
				pstmt.executeUpdate();
				
				//JOptionPane.showMessageDialog (null,"Salvo!");
			
			} catch (SQLException e) {
				
				JOptionPane.showMessageDialog (null,"ERROR! " + e);
			
			}finally {
				
				ConnectionFactory.closeConnection(con, pstmt);
			}
		}
}
