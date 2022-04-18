package br.com.ecoded.ecd.contabil.registros.contadores;

import br.com.ecoded.ecd.contabil.registros.blocoJ.BlocoJEnum;

public class ContadoresBlocoJ {

	private int contRegistroJ001 = 0;
	private int contRegistroJ005 = 0;
	private int contRegistroJ100 = 0;
	private int contRegistroJ150 = 0;
	private int contRegistroJ210 = 0;
	private int contRegistroJ215 = 0;
	private int contRegistroJ800 = 0;
	private int contRegistroJ801 = 0;
	private int contRegistroJ900 = 0;
	private int contRegistroJ930 = 0;
	private int contRegistroJ932 = 0;
	private int contRegistroJ935 = 0;
	private int contRegistroJ990 = 0;

	public void incrementar(BlocoJEnum registrosBlocoJ) {
		contRegistroJ990++;

		switch (registrosBlocoJ) {
		case RegistroJ001:
			contRegistroJ001++;
			break;
		case RegistroJ005:
			contRegistroJ005++;
			break;
		case RegistroJ100:
			contRegistroJ100++;
			break;
		case RegistroJ150:
			contRegistroJ150++;
			break;
		case RegistroJ210:
			contRegistroJ210++;
			break;
		case RegistroJ215:
			contRegistroJ215++;
			break;
		case RegistroJ800:
			contRegistroJ800++;
			break;
		case RegistroJ801:
			contRegistroJ801++;
			break;
		case RegistroJ900:
			contRegistroJ900++;
			break;
		case RegistroJ930:
			contRegistroJ930++;
			break;
		case RegistroJ932:
			contRegistroJ932++;
			break;
		case RegistroJ935:
			contRegistroJ935++;
			break;
		default:
			break;
		}
	}

	public int getContRegistroJ001() {
		return contRegistroJ001;
	}

	public void setContRegistroJ001(int contRegistroJ001) {
		this.contRegistroJ001 = contRegistroJ001;
	}

	public int getContRegistroJ005() {
		return contRegistroJ005;
	}

	public void setContRegistroJ005(int contRegistroJ005) {
		this.contRegistroJ005 = contRegistroJ005;
	}

	public int getContRegistroJ100() {
		return contRegistroJ100;
	}

	public void setContRegistroJ100(int contRegistroJ100) {
		this.contRegistroJ100 = contRegistroJ100;
	}

	public int getContRegistroJ150() {
		return contRegistroJ150;
	}

	public void setContRegistroJ150(int contRegistroJ150) {
		this.contRegistroJ150 = contRegistroJ150;
	}

	public int getContRegistroJ210() {
		return contRegistroJ210;
	}

	public void setContRegistroJ210(int contRegistroJ210) {
		this.contRegistroJ210 = contRegistroJ210;
	}

	public int getContRegistroJ215() {
		return contRegistroJ215;
	}

	public void setContRegistroJ215(int contRegistroJ215) {
		this.contRegistroJ215 = contRegistroJ215;
	}

	public int getContRegistroJ800() {
		return contRegistroJ800;
	}

	public void setContRegistroJ800(int contRegistroJ800) {
		this.contRegistroJ800 = contRegistroJ800;
	}

	public int getContRegistroJ801() {
		return contRegistroJ801;
	}

	public void setContRegistroJ801(int contRegistroJ801) {
		this.contRegistroJ801 = contRegistroJ801;
	}

	public int getContRegistroJ900() {
		return contRegistroJ900;
	}

	public void setContRegistroJ900(int contRegistroJ900) {
		this.contRegistroJ900 = contRegistroJ900;
	}

	public int getContRegistroJ930() {
		return contRegistroJ930;
	}

	public void setContRegistroJ930(int contRegistroJ930) {
		this.contRegistroJ930 = contRegistroJ930;
	}

	public int getContRegistroJ932() {
		return contRegistroJ932;
	}

	public void setContRegistroJ932(int contRegistroJ932) {
		this.contRegistroJ932 = contRegistroJ932;
	}

	public int getContRegistroJ935() {
		return contRegistroJ935;
	}

	public void setContRegistroJ935(int contRegistroJ935) {
		this.contRegistroJ935 = contRegistroJ935;
	}

	public int getContRegistroJ990() {
		return contRegistroJ990;
	}

	public void setContRegistroJ990(int contRegistroJ990) {
		this.contRegistroJ990 = contRegistroJ990;
	}

}
