package controller;
import java.util.Date;

import model.Pedido;
import view.PedidoView;

public class PedidoController {
	private Pedido model;
	private PedidoView view;
	
	public PedidoController(Pedido model, PedidoView view) {
		this.model = model;
		this.view = view;
	}
	
	public void setPedidoNfe(String nfe) {
		model.setNfe(nfe);
	}
	
	public String getPedidoNfe() {
		return model.getNfe();
	}
	
	public void setPedidoData(Date data) {
		model.setData(data);
	}
	
	public Date getPedidoData() {
		return model.getData();
	}
	
	public void setPedidoTotal(double total) {
		model.setTotal(total);
	}
	
	public double getPedidoTotal() {
		return model.getTotal();
	}
	
	public void setPedidoStatus(String status) {
		model.setStatus(status);
	}
	
	public String getPedidoStatus() {
		return model.getStatus();
	}
	
	public void updateView() {
		view.imprimeDadosPedido(model.getNfe(), model.getData(), model.getTotal(), model.getStatus());
	}

}
