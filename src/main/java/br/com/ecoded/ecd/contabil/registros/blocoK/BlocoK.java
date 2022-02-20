package br.com.ecoded.ecd.contabil.registros.blocoK;

import java.util.ArrayList;
import java.util.List;

public class BlocoK {

	private RegistroK001 registroK001;
	private RegistroK030 registroK030;
	private List<RegistroK100> registroK100;
	private List<RegistroK200> registroK200;
	private List<RegistroK210> registroK210;
	private List<RegistroK300> registroK300;
	private RegistroK990 registroK990;

	public RegistroK001 getRegistroK001() {
		return registroK001;
	}

	public void setRegistroK001(RegistroK001 registroK001) {
		this.registroK001 = registroK001;
	}

	public RegistroK030 getRegistroK030() {
		return registroK030;
	}

	public void setRegistroK030(RegistroK030 registroK030) {
		this.registroK030 = registroK030;
	}

	public List<RegistroK100> getRegistroK100() {
		if (registroK100 == null) {
			registroK100 = new ArrayList<RegistroK100>();
		}
		return this.registroK100;
	}

	public List<RegistroK200> getRegistroK200() {
		if (registroK200 == null) {
			registroK200 = new ArrayList<RegistroK200>();
		}
		return this.registroK200;
	}

	public List<RegistroK210> getRegistroK210() {
		if (registroK210 == null) {
			registroK210 = new ArrayList<RegistroK210>();
		}
		return this.registroK210;
	}

	public List<RegistroK300> getRegistroK300() {
		if (registroK300 == null) {
			registroK300 = new ArrayList<RegistroK300>();
		}
		return this.registroK300;
	}

	public RegistroK990 getRegistroK990() {
		return registroK990;
	}

	public void setRegistroK990(RegistroK990 registroK990) {
		this.registroK990 = registroK990;
	}

}
