package connection;
import java.sql.*;

import javax.swing.JOptionPane;

public class ConnectionFactory {
	
	private static Connection conn;
	private PreparedStatement pstmt;
	private Statement stmt;	
	
	static String conectURL = "jdbc:sqlserver://localhost:1433;" + "databaseName=ProjetoFutebolPC";
	
	public static Connection open() {
	
		try {
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
		conn = DriverManager.getConnection(conectURL,"sa","senh@");
		System.out.println("Conexão obtida!");
	
		} catch (SQLException se) {
		
			System.out.println("SQLException:" + se.getMessage());
			System.out.println("SQLState:" + se.getSQLState());
			System.out.println("Vendo erro:" + se.getErrorCode());
	
		} catch(Exception e) {
		
			System.out.println("ERRO NÃO ENCONTRADO " + e);
		}
		
		return conn;
	}
		
	public static void closeConnection(Connection con, PreparedStatement pstmt) {
		
		try {
			if (pstmt != null && con != null) {
				
				pstmt.close();
				con.close();
				//JOptionPane.showMessageDialog (null,"Fechado");
			
			}
		} catch (SQLException e) {

			e.printStackTrace();
			}		
	}
}

