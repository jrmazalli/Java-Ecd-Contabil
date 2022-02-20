package br.com.ecoded.ecd.contabil.registros.contadores;

import br.com.ecoded.ecd.contabil.registros.blocoC.BlocoCEnum;

public class ContadoresBlocoC {

	// Bloco C
	private int contRegistroC001 = 0;
	private int contRegistroC040 = 0;
	private int contRegistroC150 = 0;
	private int contRegistroC155 = 0;
	private int contRegistroC600 = 0;
	private int contRegistroC650 = 0;
	private int contRegistroC990 = 0;

	public void incrementar(BlocoCEnum registrosBlocoC) {
		contRegistroC990++;

		switch (registrosBlocoC) {
		case RegistroC001:
			contRegistroC001++;
			break;
		case RegistroC040:
			contRegistroC040++;
			break;
		case RegistroC150:
			contRegistroC150++;
			break;
		case RegistroC155:
			contRegistroC155++;
			break;
		case RegistroC600:
			contRegistroC600++;
			break;
		case RegistroC650:
			contRegistroC650++;
			break;
		case RegistroC990:
			contRegistroC990++;
			break;
		default:
			break;
		}
	}

	public int getContRegistroC001() {
		return contRegistroC001;
	}

	public void setContRegistroC001(int contRegistroC001) {
		this.contRegistroC001 = contRegistroC001;
	}

	public int getContRegistroC040() {
		return contRegistroC040;
	}

	public void setContRegistroC040(int contRegistroC040) {
		this.contRegistroC040 = contRegistroC040;
	}

	public int getContRegistroC150() {
		return contRegistroC150;
	}

	public void setContRegistroC150(int contRegistroC150) {
		this.contRegistroC150 = contRegistroC150;
	}

	public int getContRegistroC155() {
		return contRegistroC155;
	}

	public void setContRegistroC155(int contRegistroC155) {
		this.contRegistroC155 = contRegistroC155;
	}

	public int getContRegistroC600() {
		return contRegistroC600;
	}

	public void setContRegistroC600(int contRegistroC600) {
		this.contRegistroC600 = contRegistroC600;
	}

	public int getContRegistroC650() {
		return contRegistroC650;
	}

	public void setContRegistroC650(int contRegistroC650) {
		this.contRegistroC650 = contRegistroC650;
	}

	public void setContRegistroC990(int contRegistroC990) {
		this.contRegistroC990 = contRegistroC990;
	}

	/**
	 * @return the contRegistroC990
	 */
	public int getContRegistroC990() {
		return contRegistroC990;
	}

}
