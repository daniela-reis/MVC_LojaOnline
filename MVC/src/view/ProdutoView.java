package view;

public class ProdutoView {
	public void imprimeDadosProduto(String codigo, String nome, String descricao, double preco, int quantidadeEstoque) {
		System.out.println("Dados Produto: ");
		System.out.println("C�digo: " + codigo);
		System.out.println("Nome: " + nome);
		System.out.println("Descri��o: " + descricao);
		System.out.println("Pre�o: " + preco);
		System.out.println("Quantidade em Estoque: " + quantidadeEstoque);
	}

}
