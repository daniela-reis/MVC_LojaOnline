package main;
import controller.EnderecoController;
import model.Endereco;
import view.EnderecoView;

public class ProgramaEndereco {
	public static void main(String[] args) {
		Endereco ed = new Endereco();
		EnderecoView ev = new EnderecoView();
		
		EnderecoController ec = new EnderecoController (ed, ev);
		
		ec.updateView();
	}
}
