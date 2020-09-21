package main;
import controller.ProdutoPedidoController;
import model.ProdutoPedido;
import view.ProdutoPedidoView;

public class ProgramaProdutoPedido {
	public static void main(String[] args) {
		ProdutoPedido pp = new ProdutoPedido();
		ProdutoPedidoView ppv = new ProdutoPedidoView();
		
		ProdutoPedidoController ppc = new ProdutoPedidoController (pp, ppv);
		
		ppc.updateView();
	}
}
