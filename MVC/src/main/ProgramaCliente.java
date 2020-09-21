package main;
import controller.ClienteController;
import model.Cliente;
import view.ClienteView;

public class ProgramaCliente {
	public static void main(String[] args) {
		Cliente cl = new Cliente();
		ClienteView cv = new ClienteView();
		
		ClienteController cc = new ClienteController (cl, cv);
		
		cc.updateView();
	}
}
