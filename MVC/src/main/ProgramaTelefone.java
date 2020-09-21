package main;
import controller.TelefoneController;
import model.Telefone;
import view.TelefoneView;

public class ProgramaTelefone {
	public static void main(String[] args) {
		Telefone tel = new Telefone();
		TelefoneView tv = new TelefoneView();
		
		TelefoneController tc = new TelefoneController (tel, tv);
		
		tc.updateView();
	}
}
