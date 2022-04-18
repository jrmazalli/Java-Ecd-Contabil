package br.com.ecoded.ecd.contabil.registros.contadores;

import br.com.ecoded.ecd.contabil.registros.blocoC.BlocoCEnum;

public class ContadoresBlocoC {

	private int contRegistroC001 = 0;
	private int contRegistroC040 = 0;
	private int contRegistroC050 = 0;
	private int contRegistroC051 = 0;
	private int contRegistroC052 = 0;
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
		case RegistroC050:
			contRegistroC050++;
			break;
		case RegistroC051:
			contRegistroC051++;
			break;
		case RegistroC052:
			contRegistroC052++;
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

	public int getContRegistroC050() {
		return contRegistroC050;
	}

	public void setContRegistroC050(int contRegistroC050) {
		this.contRegistroC050 = contRegistroC050;
	}

	public int getContRegistroC051() {
		return contRegistroC051;
	}

	public void setContRegistroC051(int contRegistroC051) {
		this.contRegistroC051 = contRegistroC051;
	}

	public int getContRegistroC052() {
		return contRegistroC052;
	}

	public void setContRegistroC052(int contRegistroC052) {
		this.contRegistroC052 = contRegistroC052;
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

	public int getContRegistroC990() {
		return contRegistroC990;
	}

}
