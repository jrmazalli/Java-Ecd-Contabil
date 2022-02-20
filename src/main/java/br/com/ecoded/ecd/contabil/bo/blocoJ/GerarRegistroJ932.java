package br.com.ecoded.ecd.contabil.bo.blocoJ;

import br.com.ecoded.ecd.contabil.registros.blocoJ.RegistroJ932;
import br.com.ecoded.ecd.contabil.util.Util;

public class GerarRegistroJ932 {

	public static StringBuilder gerar(RegistroJ932 registroJ932, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registroJ932.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroJ932.getIdent_nom_t()));
		sb.append("|").append(Util.preencheRegistro(registroJ932.getIdent_cpf_cnpj_t()));
		sb.append("|").append(Util.preencheRegistro(registroJ932.getIdent_qualif_t()));
		sb.append("|").append(Util.preencheRegistro(registroJ932.getCod_assin_t()));
		sb.append("|").append(Util.preencheRegistro(registroJ932.getInd_crc_t()));
		sb.append("|").append(Util.preencheRegistro(registroJ932.getEmail_t()));
		sb.append("|").append(Util.preencheRegistro(registroJ932.getFone_t()));
		sb.append("|").append(Util.preencheRegistro(registroJ932.getUf_crc_t()));
		sb.append("|").append(Util.preencheRegistro(registroJ932.getNum_seq_crc_t()));
		sb.append("|").append(Util.preencheRegistro(registroJ932.getDt_crc_t()));

		sb.append("|").append('\n');

		return sb;
	}
}
