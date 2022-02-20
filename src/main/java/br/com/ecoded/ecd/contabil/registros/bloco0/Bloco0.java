package br.com.ecoded.ecd.contabil.registros.bloco0;

import java.util.ArrayList;
import java.util.List;

public class Bloco0 {

	private Registro0000 registro0000;
	private Registro0001 registro0001;
	private List<Registro0007> registro0007;
	private List<Registro0020> registro0020;
	private List<Registro0035> registro0035; // matriz e filial
	private List<Registro0150> registro0150;
	private List<Registro0180> registro0180;
	private Registro0990 registro0990;

	public Registro0000 getRegistro0000() {
		return registro0000;
	}

	public void setRegistro0000(Registro0000 registro0000) {
		this.registro0000 = registro0000;
	}

	public Registro0001 getRegistro0001() {
		return registro0001;
	}

	public void setRegistro0001(Registro0001 registro0001) {
		this.registro0001 = registro0001;
	}

	public List<Registro0007> getRegistro0007() {
		if (registro0007 == null) {
			registro0007 = new ArrayList<Registro0007>();
		}
		return this.registro0007;
	}

	public void setRegistro0007(List<Registro0007> registro0007) {
		this.registro0007 = registro0007;
	}

	public List<Registro0020> getRegistro0020() {
		if (registro0020 == null) {
			registro0020 = new ArrayList<Registro0020>();
		}
		return this.registro0020;
	}

	public void setRegistro0020(List<Registro0020> registro0020) {
		this.registro0020 = registro0020;
	}

	public List<Registro0035> getRegistro0035() {
		if (registro0035 == null) {
			registro0035 = new ArrayList<Registro0035>();
		}
		return this.registro0035;
	}

	public void setRegistro0035(List<Registro0035> registro0035) {
		this.registro0035 = registro0035;
	}

	public List<Registro0150> getRegistro0150() {
		if (registro0150 == null) {
			registro0150 = new ArrayList<Registro0150>();
		}
		return this.registro0150;
	}

	public void setRegistro0150(List<Registro0150> registro0150) {
		this.registro0150 = registro0150;
	}

	public List<Registro0180> getRegistro0180() {
		if (registro0180 == null) {
			registro0180 = new ArrayList<Registro0180>();
		}
		return this.registro0180;
	}

	public void setRegistro0180(List<Registro0180> registro0180) {
		this.registro0180 = registro0180;
	}

	public Registro0990 getRegistro0990() {
		return registro0990;
	}

	public void setRegistro0990(Registro0990 registro0990) {
		this.registro0990 = registro0990;
	}

}
