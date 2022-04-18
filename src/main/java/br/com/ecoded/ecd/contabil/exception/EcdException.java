package br.com.ecoded.ecd.contabil.exception;

//Exceção a ser lançada na ocorrência de falhas provenientes do ecd.
public class EcdException extends Exception {

	private static final long serialVersionUID = 8157032997005835424L;

	String message;

	public EcdException(Throwable e) {
		super(e);
	}

	public EcdException(String message) {
		this((Throwable) null);
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}