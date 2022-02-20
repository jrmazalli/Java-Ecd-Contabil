package br.com.ecoded.ecd.contabil.registros.blocoI;

import java.util.ArrayList;
import java.util.List;

public class BlocoI {

	private RegistroI001 registroI001;
	private RegistroI010 registroI010;
	private List<RegistroI012> registroI012; // 1 Registro Se o campo2 do registro I010 = A ou Z / Varios registros se o  campo 2 do i010 for R ou B (livro auxiliar)
	private List<RegistroI020> registroI020;
	private RegistroI030 registroI030;
	private List<RegistroI050> registroI050;
	private List<RegistroI075> registroI075;
	private List<RegistroI100> registroI100;
	private List<RegistroI150> registroI150;
	private List<RegistroI200> registroI200;
	private List<RegistroI300> registroI300;
	private List<RegistroI310> registroI310;
	private List<RegistroI350> registroI350;
	private RegistroI500 registroI500;
	private List<RegistroI510> registroI510;
	private List<RegistroI550> registroI550;
	private RegistroI990 registroI990;

	public RegistroI001 getRegistroI001() {
		return registroI001;
	}

	public void setRegistroI001(RegistroI001 registroI001) {
		this.registroI001 = registroI001;
	}

	public RegistroI010 getRegistroI010() {
		return registroI010;
	}

	public void setRegistroI010(RegistroI010 registroI010) {
		this.registroI010 = registroI010;
	}

	public List<RegistroI012> getRegistroI012() {
		if (registroI012 == null) {
			registroI012 = new ArrayList<RegistroI012>();
		}
		return this.registroI012;
	}

	public void setRegistroI012(List<RegistroI012> registroI012) {
		this.registroI012 = registroI012;
	}

	public List<RegistroI020> getRegistroI020() {
		if (registroI020 == null) {
			registroI020 = new ArrayList<RegistroI020>();
		}
		return this.registroI020;
	}

	public void setRegistroI020(List<RegistroI020> registroI020) {
		this.registroI020 = registroI020;
	}

	public RegistroI030 getRegistroI030() {
		return registroI030;
	}

	public void setRegistroI030(RegistroI030 registroI030) {
		this.registroI030 = registroI030;
	}

	public List<RegistroI050> getRegistroI050() {
		if (registroI050 == null) {
			registroI050 = new ArrayList<RegistroI050>();
		}
		return this.registroI050;
	}

	public void setRegistroI050(List<RegistroI050> registroI050) {
		this.registroI050 = registroI050;
	}

	public List<RegistroI075> getRegistroI075() {
		if (registroI075 == null) {
			registroI075 = new ArrayList<RegistroI075>();
		}
		return this.registroI075;
	}

	public void setRegistroI075(List<RegistroI075> registroI075) {
		this.registroI075 = registroI075;
	}

	public List<RegistroI100> getRegistroI100() {
		if (registroI100 == null) {
			registroI100 = new ArrayList<RegistroI100>();
		}
		return this.registroI100;
	}

	public void setRegistroI100(List<RegistroI100> registroI100) {
		this.registroI100 = registroI100;
	}

	public List<RegistroI150> getRegistroI150() {
		if (registroI150 == null) {
			registroI150 = new ArrayList<RegistroI150>();
		}
		return this.registroI150;
	}

	public void setRegistroI150(List<RegistroI150> registroI150) {
		this.registroI150 = registroI150;
	}

	public List<RegistroI200> getRegistroI200() {
		if (registroI200 == null) {
			registroI200 = new ArrayList<RegistroI200>();
		}
		return this.registroI200;
	}

	public void setRegistroI200(List<RegistroI200> registroI200) {
		this.registroI200 = registroI200;
	}

	public List<RegistroI300> getRegistroI300() {
		if (registroI300 == null) {
			registroI300 = new ArrayList<RegistroI300>();
		}
		return this.registroI300;
	}

	public void setRegistroI300(List<RegistroI300> registroI300) {
		this.registroI300 = registroI300;
	}

	public List<RegistroI310> getRegistroI310() {
		if (registroI310 == null) {
			registroI310 = new ArrayList<RegistroI310>();
		}
		return this.registroI310;
	}

	public void setRegistroI310(List<RegistroI310> registroI310) {
		this.registroI310 = registroI310;
	}

	public List<RegistroI350> getRegistroI350() {
		if (registroI350 == null) {
			registroI350 = new ArrayList<RegistroI350>();
		}
		return this.registroI350;
	}

	public void setRegistroI350(List<RegistroI350> registroI350) {
		this.registroI350 = registroI350;
	}

	public RegistroI500 getRegistroI500() {
		return registroI500;
	}

	public void setRegistroI500(RegistroI500 registroI500) {
		this.registroI500 = registroI500;
	}

	public List<RegistroI510> getRegistroI510() {
		if (registroI510 == null) {
			registroI510 = new ArrayList<RegistroI510>();
		}
		return this.registroI510;
	}

	public void setRegistroI510(List<RegistroI510> registroI510) {
		this.registroI510 = registroI510;
	}

	public List<RegistroI550> getRegistroI550() {
		if (registroI550 == null) {
			registroI550 = new ArrayList<RegistroI550>();
		}
		return this.registroI550;
	}

	public void setRegistroI550(List<RegistroI550> registroI550) {
		this.registroI550 = registroI550;
	}

	public RegistroI990 getRegistroI990() {
		return registroI990;
	}

	public void setRegistroI990(RegistroI990 registroI990) {
		this.registroI990 = registroI990;
	}

}
