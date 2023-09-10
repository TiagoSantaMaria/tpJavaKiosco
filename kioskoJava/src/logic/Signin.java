package logic;
import data.ClienteData;
import entities.Cliente;

public class Signin {
	public boolean compareAtributtesUsuario(String username, String dniCliente, String email){
		boolean control = false;
		ClienteData cliData = new ClienteData();
		Cliente cli = new Cliente();
		
		cli = cliData.searchByUsername(username);
		
		if(cli == null) {
			
		}else {
			control = true;
		}
		
		return control;
	}

}
