package data;

import java.sql.*;
import entities.Cliente;

public class ClienteData {
	
	public Cliente searchByUsername(String username){
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		Cliente cli = new Cliente();
	
		try {
			pstmt = DbHandler.getInstancia().getConn().prepareStatement("select * from cliente where usuario=?");
			pstmt.setString(1, username);
			rs = pstmt.executeQuery();
	
            if(rs!=null && rs.next()) {
            	cli.setDniCliente(rs.getInt(("dniCliente")));
            	cli.setNombre(rs.getString(("nombre")));
            	cli.setApellido(rs.getString(("apellido")));
            	cli.setMail(rs.getString(("mail")));
            	cli.setFechaNac(rs.getString(("fechaNac")));
            	cli.setUsuario(rs.getString(("usuario")));
            	cli.setContraseña(rs.getString(("contraseña")));
            	cli.setNroTarjeta(rs.getInt(("nro_tarjeta")));
            	cli.setRol(rs.getString(("rol")));
            }
        
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
				try {
						if(rs!=null) {rs.close();}
						if(pstmt!=null) {pstmt.close();}
						DbHandler.getInstancia().releaseConn();
					} catch (SQLException e) {
						e.printStackTrace();
					}
			}
		return cli;
	}
	
	//PROXS METODOS
	
	
}
