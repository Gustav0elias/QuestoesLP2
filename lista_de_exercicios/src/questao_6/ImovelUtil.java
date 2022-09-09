package questao_6;

import java.util.ArrayList;

public class ImovelUtil {

	public static void main(String[] args) {
	
		// Instanciando os objetos da classe ImovelNovo
		ImovelNovo imovelNovo1 = new ImovelNovo("Rua Carlos Reichenbach, 299", 100.000, 5.000 );
		ImovelNovo imovelNovo2 = new ImovelNovo("Avenida Walter Hugo Khouri, 140", 110.000, 9.000 );
		ImovelNovo imovelNovo3 = new ImovelNovo("Rua Adirley Queirós, 79", 200.000, 12.000 );
		// Instanciando os objetos da classe ImovelVelho
		ImovelVelho imovelVelho1 = new ImovelVelho ("Rua Glauber Rocha, 120", 100.000, 8.000 );
		ImovelVelho imovelVelho2 = new ImovelVelho ("Avenida Nelson Pereira dos Santos, 96", 95.000, 7.000 );
		ImovelVelho imovelVelho3 = new ImovelVelho ("Avenida Rogerio Sganzerla, 30", 140.000, 10.000 );

		// Calculo do valor médio dos imóveis instanciados, utilizando o getPreco para ter o adicional e desconto inclusos
		double valorLiquidoMedio = 0;
		valorLiquidoMedio= (imovelNovo1.getPreco() + imovelNovo2.getPreco() + imovelNovo3.getPreco() +
				imovelVelho1.getPreco() + imovelVelho2.getPreco() + imovelVelho3.getPreco()) /6;
		
		
		//Utilizando o arraylist para facilitar a saída dos dados na tela
	 ArrayList<Imovel> imoveis = new ArrayList<Imovel>();
	 
	 	imoveis.add(imovelNovo1);
		imoveis.add(imovelNovo2);
		imoveis.add(imovelNovo3);
		imoveis.add(imovelVelho1);
		imoveis.add(imovelVelho2);
		imoveis.add(imovelVelho3);
		
		
		
		System.out.println("Cada imóvel e seu preço líquido:");
		System.out.println(" ");
		//Laço for responsável pela saída dos dados de endereço e preço
		for(Imovel j : imoveis) {
			System.out.println( j.getEndereco() + ", R$" + j.getPreco());
		}
		
		System.out.println(" ");
		//Para exibir o valor líquido médio 
		System.out.println("Valor líquido médio dos imóveis: " + valorLiquidoMedio);
		System.out.println(" ");
		
		System.out.println("--------------------------------------------------------------------------");
		System.out.println(" ");
		
		System.out.println("Endereços do imóveis cujos preços liquidos são superiores ao preço liquido médio: ");
		System.out.println(" ");
		//Laço for responsável pela saída dos endereços maiores que o valor líquido médio
		for (Imovel i : imoveis) {
			//Estrutura condicional if para verificar se o valor líquido do imóvel é maior que o valor líquido médio	
			if(i.getPreco() > valorLiquidoMedio ) {
				System.out.println( i.getEndereco());
			}
		}
		
	}
}
