package controller;
import model.Telefone;
import view.TelefoneView;

public class TelefoneController {
	private Telefone model;
	private TelefoneView view;
	
	public TelefoneController(Telefone model, TelefoneView view) {
		this.model = model;
		this.view = view;
	}
	
	public void setTelefoneDdd(String ddd) {
		model.setDdd(ddd);
	}
	
	public String getTelefoneDdd() {
		return model.getDdd();
	}
	
	public void setTelefoneNumero(String numero) {
		model.setNumero(numero);
	}
	
	public String getTelefoneNumero() {
		return model.getNumero();
	}
	
	
	public void updateView() {
		view.imprimeDadosTelefone(model.getDdd(), model.getNumero());
	}

}
