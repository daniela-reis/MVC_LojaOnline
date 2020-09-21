package main;
import controller.ProdutoController;
import model.Produto;
import view.ProdutoView;

public class ProgramaProduto {
	public static void main(String[] args) {
		Produto prod = new Produto();
		ProdutoView pv = new ProdutoView();
		
		ProdutoController pc = new ProdutoController (prod, pv);
		
		pc.updateView();
	}
}
