package view;

public class ProdutoView {
	public void imprimeDadosProduto(String codigo, String nome, String descricao, double preco, int quantidadeEstoque) {
		System.out.println("Dados Produto: ");
		System.out.println("Código: " + codigo);
		System.out.println("Nome: " + nome);
		System.out.println("Descrição: " + descricao);
		System.out.println("Preço: " + preco);
		System.out.println("Quantidade em Estoque: " + quantidadeEstoque);
	}

}
