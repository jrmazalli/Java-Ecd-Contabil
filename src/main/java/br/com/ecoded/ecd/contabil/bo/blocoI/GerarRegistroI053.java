package br.com.ecoded.ecd.contabil.bo.blocoI;

import br.com.ecoded.ecd.contabil.registros.blocoI.RegistroI053;
import br.com.ecoded.ecd.contabil.util.Util;

public class GerarRegistroI053 {
	
	public static StringBuilder gerar(RegistroI053 registroI053, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registroI053.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroI053.getCod_idt()));
		sb.append("|").append(Util.preencheRegistro(registroI053.getCod_cnt_corr()));
		sb.append("|").append(Util.preencheRegistro(registroI053.getNat_sub_cnt()));
		sb.append("|").append('\n');

		return sb;
	}

}
