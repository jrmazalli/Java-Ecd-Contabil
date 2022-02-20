package br.com.ecoded.ecd.contabil.bo.blocoJ;

import br.com.ecoded.ecd.contabil.registros.blocoJ.RegistroJ900;
import br.com.ecoded.ecd.contabil.util.Util;

public class GerarRegistroJ900 {

	public static StringBuilder gerar(RegistroJ900 registroJ900, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registroJ900.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroJ900.getDnrc_encer()));
		sb.append("|").append(Util.preencheRegistro(registroJ900.getNum_ord()));
		sb.append("|").append(Util.preencheRegistro(registroJ900.getNat_livro()));
		sb.append("|").append(Util.preencheRegistro(registroJ900.getNome()));
		sb.append("|").append(Util.preencheRegistro(registroJ900.getQtd_lin()));
		sb.append("|").append(Util.preencheRegistro(registroJ900.getDt_ini_escr()));
		sb.append("|").append(Util.preencheRegistro(registroJ900.getDt_fin_escr()));
		sb.append("|").append('\n');

		return sb;
	}
}
