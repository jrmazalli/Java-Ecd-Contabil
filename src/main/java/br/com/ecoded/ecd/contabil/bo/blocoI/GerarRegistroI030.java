package br.com.ecoded.ecd.contabil.bo.blocoI;

import br.com.ecoded.ecd.contabil.registros.blocoI.RegistroI030;
import br.com.ecoded.ecd.contabil.util.Util;

public class GerarRegistroI030 {
	
	public static StringBuilder gerar(RegistroI030 registroI030, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registroI030.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroI030.getDnrc_abert()));
		sb.append("|").append(Util.preencheRegistro(registroI030.getNum_ord()));
		sb.append("|").append(Util.preencheRegistro(registroI030.getNat_livr()));
		sb.append("|").append(Util.preencheRegistro(registroI030.getQtd_lin()));
		sb.append("|").append(Util.preencheRegistro(registroI030.getNome()));
		sb.append("|").append(Util.preencheRegistro(registroI030.getNire()));
		sb.append("|").append(Util.preencheRegistro(registroI030.getCnpj()));
		sb.append("|").append(Util.preencheRegistro(registroI030.getDt_arq()));
		sb.append("|").append(Util.preencheRegistro(registroI030.getDt_arq_conv()));
		sb.append("|").append(Util.preencheRegistro(registroI030.getDesc_mun()));
		sb.append("|").append(Util.preencheRegistro(registroI030.getDt_ex_social()));

		sb.append("|").append('\n');

		return sb;
	}

}
