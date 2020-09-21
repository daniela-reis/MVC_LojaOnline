package view;

public class EnderecoView {
	public void imprimeDadosEndereco(String logradouro, int numero, String complemento, String bairro, String cidade, String estado, String cep) {
		System.out.println("Endereço Cliente: ");
		System.out.println("Logradouro: " + logradouro);
		System.out.println("Número: " + numero);
		System.out.println("Complemento: " + complemento);
		System.out.println("Bairro: " + bairro);
		System.out.println("Cidade: " + cidade);
		System.out.println("Estado: " + estado);
		System.out.println("CEP: " + cep);
	}

}
