package questao_6;

import java.util.ArrayList;

public class ImovelUtil {

	public static void main(String[] args) {
	
		// Instanciando os objetos da classe ImovelNovo
		ImovelNovo imovelNovo1 = new ImovelNovo("Rua Carlos Reichenbach, 299", 100.000, 5.000 );
		ImovelNovo imovelNovo2 = new ImovelNovo("Avenida Walter Hugo Khouri, 140", 110.000, 9.000 );
		ImovelNovo imovelNovo3 = new ImovelNovo("Rua Adirley Queir�s, 79", 200.000, 12.000 );
		// Instanciando os objetos da classe ImovelVelho
		ImovelVelho imovelVelho1 = new ImovelVelho ("Rua Glauber Rocha, 120", 100.000, 8.000 );
		ImovelVelho imovelVelho2 = new ImovelVelho ("Avenida Nelson Pereira dos Santos, 96", 95.000, 7.000 );
		ImovelVelho imovelVelho3 = new ImovelVelho ("Avenida Rogerio Sganzerla, 30", 140.000, 10.000 );

		// Calculo do valor m�dio dos im�veis instanciados, utilizando o getPreco para ter o adicional e desconto inclusos
		double valorLiquidoMedio = 0;
		valorLiquidoMedio= (imovelNovo1.getPreco() + imovelNovo2.getPreco() + imovelNovo3.getPreco() +
				imovelVelho1.getPreco() + imovelVelho2.getPreco() + imovelVelho3.getPreco()) /6;
		
		
		//Utilizando o arraylist para facilitar a sa�da dos dados na tela
	 ArrayList<Imovel> imoveis = new ArrayList<Imovel>();
	 
	 	imoveis.add(imovelNovo1);
		imoveis.add(imovelNovo2);
		imoveis.add(imovelNovo3);
		imoveis.add(imovelVelho1);
		imoveis.add(imovelVelho2);
		imoveis.add(imovelVelho3);
		
		
		
		System.out.println("Cada im�vel e seu pre�o l�quido:");
		System.out.println(" ");
		//La�o for respons�vel pela sa�da dos dados de endere�o e pre�o
		for(Imovel j : imoveis) {
			System.out.println( j.getEndereco() + ", R$" + j.getPreco());
		}
		
		System.out.println(" ");
		//Para exibir o valor l�quido m�dio 
		System.out.println("Valor l�quido m�dio dos im�veis: " + valorLiquidoMedio);
		System.out.println(" ");
		
		System.out.println("--------------------------------------------------------------------------");
		System.out.println(" ");
		
		System.out.println("Endere�os do im�veis cujos pre�os liquidos s�o superiores ao pre�o liquido m�dio: ");
		System.out.println(" ");
		//La�o for respons�vel pela sa�da dos endere�os maiores que o valor l�quido m�dio
		for (Imovel i : imoveis) {
			//Estrutura condicional if para verificar se o valor l�quido do im�vel � maior que o valor l�quido m�dio	
			if(i.getPreco() > valorLiquidoMedio ) {
				System.out.println( i.getEndereco());
			}
		}
		
	}
}
