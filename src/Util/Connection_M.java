package Util;

import java.sql.*;

public class Connection_M{
	
	public Connection give_me_connection() {
		Connection myconnection=null;
		try {
			myconnection=DriverManager.getConnection(
                                Propiedades.dbURL, Propiedades.dbUsuario, Propiedades.dbPassword);
		}
		catch(SQLException ex){
			System.out.println("no conecta");
                        ex.printStackTrace();
		}
		return myconnection;
	}

	
		
}
