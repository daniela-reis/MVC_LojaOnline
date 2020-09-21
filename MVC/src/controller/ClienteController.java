package controller;
import model.Cliente;
import view.ClienteView;

public class ClienteController {
	private Cliente model;
	private ClienteView view;
	
	public ClienteController(Cliente model, ClienteView view) {
		this.model = model;
		this.view = view;
	}
	
	public void setClienteID(String id) {
		model.setId(id);
	}
	
	public String getClienteID() {
		return model.getId();
	}
	
	public void setClienteNome(String nome) {
		model.setNome(nome);
	}
	
	public String getClienteNome() {
		return model.getNome();
	}
	
	public void setClienteCpf(String cpf) {
		model.setCpf(cpf);
	}
	
	public String getClienteCpf() {
		return model.getCpf();
	}
	
	public void setClienteRg(String rg) {
		model.setRg(rg);
	}
	
	public String getClienteRg() {
		return model.getRg();
	}
	
	public void updateView() {
		view.imprimeDadosCliente(model.getId(), model.getNome(), model.getCpf(), model.getRg());
	}

}
