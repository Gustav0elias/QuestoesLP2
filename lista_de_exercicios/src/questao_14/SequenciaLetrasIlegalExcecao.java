package questao_14;

public class SequenciaLetrasIlegalExcecao extends ArithmeticException{


	private static final long serialVersionUID = -3678394625806531958L;
	
	//M�todo para facilitar a mensagem de erro caso ocorra a exce��o
	public SequenciaLetrasIlegalExcecao (String mensagemException) {
		super(mensagemException);
	}

}
