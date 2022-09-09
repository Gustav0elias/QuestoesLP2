package questao_6;

public class ImovelNovo extends Imovel {

	private double adicional;
	public ImovelNovo(String endereco, double preco, double adicional) {
		super(endereco, preco);
		this.adicional = adicional;
		
	}
	public double getAdicional() {
		return adicional;
	}
	public void setAdicional(double adicional) {
		this.adicional = adicional;
	}
	
	@Override
	public double getPreco() {
		return preco + adicional;
	}
	


}
