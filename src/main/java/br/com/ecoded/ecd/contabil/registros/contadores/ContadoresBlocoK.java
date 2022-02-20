package br.com.ecoded.ecd.contabil.registros.contadores;

import br.com.ecoded.ecd.contabil.registros.blocoK.BlocoKEnum;

public class ContadoresBlocoK {

	// Bloco K
	private int contRegistroK001 = 0;
	private int contRegistroK030 = 0;
	private int contRegistroK100 = 0;
	private int contRegistroK110 = 0;
	private int contRegistroK115 = 0;
	private int contRegistroK200 = 0;
	private int contRegistroK210 = 0;
	private int contRegistroK230 = 0;
	private int contRegistroK300 = 0;
	private int contRegistroK310 = 0;
	private int contRegistroK315 = 0;
	private int contRegistroK990 = 0;

	public void incrementar(BlocoKEnum registrosBlocoM) {
		contRegistroK990++;

		switch (registrosBlocoM) {
		case RegistroK001:
			contRegistroK001++;
			break;
		case RegistroK030:
			contRegistroK030++;
			break;
		case RegistroK100:
			contRegistroK100++;
			break;
		case RegistroK110:
			contRegistroK110++;
			break;
		case RegistroK115:
			contRegistroK115++;
			break;
		case RegistroK200:
			contRegistroK200++;
			break;
		case RegistroK210:
			contRegistroK210++;
			break;
		case RegistroK300:
			contRegistroK300++;
			break;
		case RegistroK310:
			contRegistroK310++;
			break;
		case RegistroK315:
			contRegistroK315++;
			break;

		default:
			break;
		}
	}

	public int getContRegistroK001() {
		return contRegistroK001;
	}

	public void setContRegistroK001(int contRegistroK001) {
		this.contRegistroK001 = contRegistroK001;
	}

	public int getContRegistroK030() {
		return contRegistroK030;
	}

	public void setContRegistroK030(int contRegistroK030) {
		this.contRegistroK030 = contRegistroK030;
	}

	public int getContRegistroK100() {
		return contRegistroK100;
	}

	public void setContRegistroK100(int contRegistroK100) {
		this.contRegistroK100 = contRegistroK100;
	}

	public int getContRegistroK110() {
		return contRegistroK110;
	}

	public void setContRegistroK110(int contRegistroK110) {
		this.contRegistroK110 = contRegistroK110;
	}

	public int getContRegistroK115() {
		return contRegistroK115;
	}

	public void setContRegistroK115(int contRegistroK115) {
		this.contRegistroK115 = contRegistroK115;
	}

	public int getContRegistroK200() {
		return contRegistroK200;
	}

	public void setContRegistroK200(int contRegistroK200) {
		this.contRegistroK200 = contRegistroK200;
	}

	public int getContRegistroK210() {
		return contRegistroK210;
	}

	public void setContRegistroK210(int contRegistroK210) {
		this.contRegistroK210 = contRegistroK210;
	}

	public int getContRegistroK230() {
		return contRegistroK230;
	}

	public void setContRegistroK230(int contRegistroK230) {
		this.contRegistroK230 = contRegistroK230;
	}

	public int getContRegistroK300() {
		return contRegistroK300;
	}

	public void setContRegistroK300(int contRegistroK300) {
		this.contRegistroK300 = contRegistroK300;
	}

	public int getContRegistroK315() {
		return contRegistroK315;
	}

	public void setContRegistroK315(int contRegistroK315) {
		this.contRegistroK315 = contRegistroK315;
	}

	public void setContRegistroK990(int contRegistroK990) {
		this.contRegistroK990 = contRegistroK990;
	}
	
	public int getContRegistroK310() {
		return contRegistroK310;
	}

	public void setContRegistroK310(int contRegistroK310) {
		this.contRegistroK310 = contRegistroK310;
	}

	/**
	 * @return the contRegistroK990
	 */
	public int getContRegistroK990() {
		return contRegistroK990;
	}

}
