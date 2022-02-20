package br.com.ecoded.ecd.contabil.bo.blocoK;

import br.com.ecoded.ecd.contabil.registros.blocoK.RegistroK300;
import br.com.ecoded.ecd.contabil.util.Util;

public class GerarRegistroK300 {
	
	public static StringBuilder gerar(RegistroK300 registroK300, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registroK300.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroK300.getCod_cta()));
		sb.append("|").append(Util.preencheRegistro(registroK300.getVal_ag()));
		sb.append("|").append(Util.preencheRegistro(registroK300.getInd_val_ag()));
		sb.append("|").append(Util.preencheRegistro(registroK300.getVal_el()));
		sb.append("|").append(Util.preencheRegistro(registroK300.getInd_val_el()));
		sb.append("|").append(Util.preencheRegistro(registroK300.getVal_cs()));
		sb.append("|").append(Util.preencheRegistro(registroK300.getInd_val_cs()));
		sb.append("|").append('\n');

		return sb;
	}

}
