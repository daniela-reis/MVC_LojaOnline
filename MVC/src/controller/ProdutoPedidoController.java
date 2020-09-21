package controller;
import model.ProdutoPedido;
import view.ProdutoPedidoView;

public class ProdutoPedidoController {
	private ProdutoPedido model;
	private ProdutoPedidoView view;
	
	public ProdutoPedidoController(ProdutoPedido model, ProdutoPedidoView view) {
		this.model = model;
		this.view = view;
	}
	
	public void setProdutoPedidoQuantidade(int quantidade) {
		model.setQuantidade(quantidade);
	}
	
	public int getProdutoPedidoQuantidade() {
		return model.getQuantidade();
	}
	
	
	public void updateView() {
		view.imprimeDadosProdPed(model.getQuantidade());
	}

}
