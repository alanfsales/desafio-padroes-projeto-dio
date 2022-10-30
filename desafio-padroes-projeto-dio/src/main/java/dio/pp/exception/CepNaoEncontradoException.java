package dio.pp.exception;
public class CepNaoEncontradoException extends RuntimeException{

	private static final long serialVersionUID = 1L;
	
	public CepNaoEncontradoException(String mensagem) {
		super(mensagem);
	}

}