package br.com.ecoded.ecd.contabil.registros.blocoC;

import java.util.ArrayList;
import java.util.List;

public class BlocoC {

	private RegistroC001 registroC001;
	private RegistroC040 registroC040;
	private List<RegistroC050> registroC050;
	private List<RegistroC150> registroC150;
	private List<RegistroC600> registroC600;
	private RegistroC990 registroC990;

	public RegistroC001 getRegistroC001() {
		return registroC001;
	}

	public void setRegistroC001(RegistroC001 registroC001) {
		this.registroC001 = registroC001;
	}

	public RegistroC040 getRegistroC040() {
		return registroC040;
	}

	public void setRegistroC040(RegistroC040 registroC040) {
		this.registroC040 = registroC040;
	}

	public List<RegistroC050> getRegistroC050() {
		if (registroC050 == null) {
			registroC050 = new ArrayList<RegistroC050>();
		}
		return registroC050;
	}

	public List<RegistroC150> getRegistroC150() {
		if (registroC150 == null) {
			registroC150 = new ArrayList<RegistroC150>();
		}
		return registroC150;
	}

	public List<RegistroC600> getRegistroC600() {
		if (registroC600 == null) {
			registroC600 = new ArrayList<RegistroC600>();
		}
		return registroC600;
	}

	public RegistroC990 getRegistroC990() {
		return registroC990;
	}

	public void setRegistroC990(RegistroC990 registroC990) {
		this.registroC990 = registroC990;
	}

}
