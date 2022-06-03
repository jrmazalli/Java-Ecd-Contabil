package br.com.ecoded.ecd.contabil.registros.blocoJ;

import java.util.ArrayList;
import java.util.List;

public class BlocoJ {

	private RegistroJ001 registroJ001;
	private List<RegistroJ005> registroJ005;
	private List<RegistroJ210> registroJ210;
	private List<RegistroJ800> registroJ800;
	private List<RegistroJ801> registroJ801; // Se for arquivo substituto enviar so 1
	private RegistroJ900 registroJ900;
	private RegistroJ990 registroJ990;

	public RegistroJ001 getRegistroJ001() {
		return registroJ001;
	}

	public void setRegistroJ001(RegistroJ001 registroJ001) {
		this.registroJ001 = registroJ001;
	}

	public List<RegistroJ005> getRegistroJ005() {
		if (registroJ005 == null) {
			registroJ005 = new ArrayList<RegistroJ005>();
		}
		return registroJ005;
	}

	public void setRegistroJ005(List<RegistroJ005> registroJ005) {
		this.registroJ005 = registroJ005;
	}

	public List<RegistroJ210> getRegistroJ210() {
		if (registroJ210 == null) {
			registroJ210 = new ArrayList<RegistroJ210>();
		}
		return this.registroJ210;
	}

	public void setRegistroJ210(List<RegistroJ210> registroJ210) {
		this.registroJ210 = registroJ210;
	}

	public List<RegistroJ800> getRegistroJ800() {
		if (registroJ800 == null) {
			registroJ800 = new ArrayList<RegistroJ800>();
		}
		return this.registroJ800;
	}

	public void setRegistroJ800(List<RegistroJ800> registroJ800) {
		this.registroJ800 = registroJ800;
	}

	public List<RegistroJ801> getRegistroJ801() {
		if (registroJ801 == null) {
			registroJ801 = new ArrayList<RegistroJ801>();
		}
		return this.registroJ801;
	}

	public void setRegistroJ801(List<RegistroJ801> registroJ801) {
		this.registroJ801 = registroJ801;
	}

	public RegistroJ900 getRegistroJ900() {
		return registroJ900;
	}

	public void setRegistroJ900(RegistroJ900 registroJ900) {
		this.registroJ900 = registroJ900;
	}

	public RegistroJ990 getRegistroJ990() {
		return registroJ990;
	}

	public void setRegistroJ990(RegistroJ990 registroJ990) {
		this.registroJ990 = registroJ990;
	}

}
