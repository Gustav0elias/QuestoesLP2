package questao_14;

import java.util.Scanner;

public class StringsUtil {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		
		TestadorStrings testador = new TestadorStrings();
		
		System.out.println("Insira uma sequencia simples de caracteres: ");
		String palavra = read.nextLine();
		//Passando a string de entrada para o m�todo isTextoMaiusculo
		testador.isTextoMaiusculo(palavra);
		
		System.out.println("A sequencia de caracteres possui letra mai�scula?");
		
		System.out.println(testador.isTextoMaiusculo(palavra));
		
		
	}

}
