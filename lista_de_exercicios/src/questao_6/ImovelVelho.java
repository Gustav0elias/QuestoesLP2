package questao_6;

public class ImovelVelho extends Imovel {

	private double desconto;
	public ImovelVelho(String endereco, double preco, double desconto) {
		super(endereco, preco);
		this.desconto = desconto;
	}
	public double getDesconto() {
		return desconto;
	}
	public void setDesconto(double desconto) {
		this.desconto = desconto;
	}
	
	@Override
	public double getPreco() {
		return preco - desconto;
	}
	
	

}
