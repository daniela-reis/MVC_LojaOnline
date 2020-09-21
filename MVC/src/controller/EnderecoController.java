package controller;
import model.Endereco;
import view.EnderecoView;

public class EnderecoController {
	private Endereco model;
	private EnderecoView view;
	
	public EnderecoController(Endereco model, EnderecoView view) {
		this.model = model;
		this.view = view;
	}
	
	public void setEnderecoLogradouro(String logradouro) {
		model.setLogradouro(logradouro);
	}
	
	public String getEnderecoLogradouro() {
		return model.getLogradouro();
	}
	
	public void setEnderecoNumero(int numero) {
		model.setNumero(numero);
	}
	
	public int getEnderecoNumero() {
		return model.getNumero();
	}
	
	public void setEnderecoComplemento(String complemento) {
		model.setComplemento(complemento);
	}
	
	public String getEnderecoComplemento() {
		return model.getComplemento();
	}
	
	public void setEnderecoBairro(String bairro) {
		model.setBairro(bairro);
	}
	
	public String getEnderecoBairro() {
		return model.getBairro();
	}
	
	public void setEnderecoCidade(String cidade) {
		model.setCidade(cidade);
	}
	
	public String getEnderecoCidade() {
		return model.getCidade();
	}
	
	public void setEnderecoEstado(String estado) {
		model.setEstado(estado);
	}
	
	public String getEnderecoEstado() {
		return model.getEstado();
	}
	
	public void setEnderecoCep(String cep) {
		model.setCep(cep);
	}
	
	public String getEnderecoCep() {
		return model.getCep();
	}
	
	public void updateView() {
		view.imprimeDadosEndereco(model.getLogradouro(), model.getNumero(), model.getComplemento(), model.getBairro(), model.getCidade(), model.getEstado(), model.getCep());
	}

}
