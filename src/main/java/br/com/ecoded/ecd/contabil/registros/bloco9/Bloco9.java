package br.com.ecoded.ecd.contabil.registros.bloco9;

import java.util.ArrayList;
import java.util.List;

public class Bloco9 {

	private Registro9001 registro9001;
	private List<Registro9900> registro9900;
	private Registro9990 registro9990;
	private Registro9999 registro9999;

	public Registro9001 getRegistro9001() {
		return registro9001;
	}

	public void setRegistro9001(Registro9001 registro9001) {
		this.registro9001 = registro9001;
	}

	public Registro9990 getRegistro9990() {
		return registro9990;
	}

	public void setRegistro9990(Registro9990 registro9990) {
		this.registro9990 = registro9990;
	}

	public List<Registro9900> getRegistro9900() {
		if (registro9900 == null) {
			registro9900 = new ArrayList<Registro9900>();
		}
		return registro9900;
	}

	public Registro9999 getRegistro9999() {
		return registro9999;
	}

	public void setRegistro9999(Registro9999 registro9999) {
		this.registro9999 = registro9999;
	}
}
