package questao_14;

public class TestadorStrings {

	public TestadorStrings () {
		
	}

	static char c;
	public static boolean isTextoMaiusculo (String entrada) {
		
		//La�o for para percorer a string guardando o valor de cada caracter na vari�vel char c
		for(int i=0; i< entrada.length(); i++) {
			c= entrada.charAt(i);
			//estrutura condicional para verificar se existe letra mai�scula em alguma posi��o da vari�vel c
			if (Character.isUpperCase(c)) {
				return true;
			}
			//Verificar se existe algum valor contr�rio a letra, caso isso se satisfa�a, a exce��o se� chamada
			else if(!Character.isLetter(c)) {
				throw new SequenciaLetrasIlegalExcecao("Voc� digitou um n�mero");
			}
			
		}
		
		return false;
		
		
}
}
