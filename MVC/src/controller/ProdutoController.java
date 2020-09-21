package controller;
import model.Produto;
import view.ProdutoView;

public class ProdutoController {
	private Produto model;
	private ProdutoView view;
	
	public ProdutoController(Produto model, ProdutoView view) {
		this.model = model;
		this.view = view;
	}
	
	public void setProdutoCodigo(String codigo) {
		model.setCodigo(codigo);
	}
	
	public String getProdutoCodigo() {
		return model.getCodigo();
	}
	
	public void setProdutoNome(String nome) {
		model.setNome(nome);
	}
	
	public String getProdutoNome() {
		return model.getNome();
	}
	
	public void setProdutoDescricao(String descricao) {
		model.setDescricao(descricao);
	}
	
	public String getProdutoDescricao() {
		return model.getDescricao();
	}
	
	public void setProdutoPreco(double preco) {
		model.setPreco(preco);
	}
	
	public double getProdutoPreco() {
		return model.getPreco();
	}
	
	public void setProdutoQuantidadeEstoque(int quantidadeEstoque) {
		model.setQuantidadeEstoque(quantidadeEstoque);
	}
	
	public double getProdutoQuantidadeEstoque() {
		return model.getQuantidadeEstoque();
	}
	
	public void updateView() {
		view.imprimeDadosProduto(model.getCodigo(), model.getNome(), model.getDescricao(), model.getPreco(), model.getQuantidadeEstoque());
	}

}
