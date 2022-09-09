package questao_14;

public class TestadorStrings {

	public TestadorStrings () {
		
	}

	static char c;
	public static boolean isTextoMaiusculo (String entrada) {
		
		//Laço for para percorer a string guardando o valor de cada caracter na variável char c
		for(int i=0; i< entrada.length(); i++) {
			c= entrada.charAt(i);
			//estrutura condicional para verificar se existe letra maiúscula em alguma posição da variável c
			if (Character.isUpperCase(c)) {
				return true;
			}
			//Verificar se existe algum valor contrário a letra, caso isso se satisfaça, a exceção seá chamada
			else if(!Character.isLetter(c)) {
				throw new SequenciaLetrasIlegalExcecao("Você digitou um número");
			}
			
		}
		
		return false;
		
		
}
}
