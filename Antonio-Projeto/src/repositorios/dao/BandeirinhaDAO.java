package repositorios.dao;
import repositorios.bean.BandeirinhaBean;
import java.sql.*;
import javax.swing.JOptionPane;
import connection.ConnectionFactory;

public class BandeirinhaDAO {

	public void create(BandeirinhaBean ban) {
		
		Connection con = ConnectionFactory.open();
		PreparedStatement pstmt = null;
		
		try {
			
			pstmt = con.prepareStatement("INSERT INTO TbBandeirinha VALUES (?)");
			
			pstmt.setString(1, ban.getNmBandeirinha());
			
			pstmt.executeUpdate();
			
			//JOptionPane.showMessageDialog (null,"Salvo!");
		
		} catch (SQLException e) {
			
			JOptionPane.showMessageDialog (null,"ERRO!");
		
		}finally {
			
			ConnectionFactory.closeConnection(con, pstmt);
		}
	}
}