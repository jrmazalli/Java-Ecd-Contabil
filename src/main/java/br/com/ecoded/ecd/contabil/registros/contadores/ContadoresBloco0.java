package br.com.ecoded.ecd.contabil.registros.contadores;

import br.com.ecoded.ecd.contabil.registros.bloco0.Bloco0Enum;

public class ContadoresBloco0 {

	private int contRegistro0000 = 0;
	private int contRegistro0001 = 0;
	private int contRegistro0007 = 0;
	private int contRegistro0020 = 0;
	private int contRegistro0035 = 0;
	private int contRegistro0150 = 0;
	private int contRegistro0180 = 0;
	private int contRegistro0990 = 0;

	public void incrementar(Bloco0Enum registroBloco0) {

		contRegistro0990++;

		switch (registroBloco0) {
		case Registro0000:
			contRegistro0000++;
			break;
		case Registro0001:
			contRegistro0001++;
			break;
		case Registro0007:
			contRegistro0007++;
			break;
		case Registro0020:
			contRegistro0020++;
			break;
		case Registro0035:
			contRegistro0035++;
			break;
		case Registro0150:
			contRegistro0150++;
			break;

		case Registro0180:
			contRegistro0180++;
			break;
		default:
			break;
		}
	}

	public int getContRegistro0000() {
		return contRegistro0000;
	}

	public void setContRegistro0000(int contRegistro0000) {
		this.contRegistro0000 = contRegistro0000;
	}

	public int getContRegistro0001() {
		return contRegistro0001;
	}

	public void setContRegistro0001(int contRegistro0001) {
		this.contRegistro0001 = contRegistro0001;
	}

	public int getContRegistro0007() {
		return contRegistro0007;
	}

	public void setContRegistro0007(int contRegistro0007) {
		this.contRegistro0007 = contRegistro0007;
	}

	public int getContRegistro0020() {
		return contRegistro0020;
	}

	public void setContRegistro0020(int contRegistro0020) {
		this.contRegistro0020 = contRegistro0020;
	}

	public int getContRegistro0035() {
		return contRegistro0035;
	}

	public void setContRegistro0035(int contRegistro0035) {
		this.contRegistro0035 = contRegistro0035;
	}

	public int getContRegistro0150() {
		return contRegistro0150;
	}

	public void setContRegistro0150(int contRegistro0150) {
		this.contRegistro0150 = contRegistro0150;
	}

	public int getContRegistro0180() {
		return contRegistro0180;
	}

	public void setContRegistro0180(int contRegistro0180) {
		this.contRegistro0180 = contRegistro0180;
	}

	public void setContRegistro0990(int contRegistro0990) {
		this.contRegistro0990 = contRegistro0990;
	}

	public int getContRegistro0990() {
		return contRegistro0990;
	}

}
