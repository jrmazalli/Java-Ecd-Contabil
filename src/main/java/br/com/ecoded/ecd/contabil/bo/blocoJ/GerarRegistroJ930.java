package br.com.ecoded.ecd.contabil.bo.blocoJ;

import br.com.ecoded.ecd.contabil.registros.blocoJ.RegistroJ930;
import br.com.ecoded.ecd.contabil.util.Util;

public class GerarRegistroJ930 {

	public static StringBuilder gerar(RegistroJ930 registroJ930, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registroJ930.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroJ930.getIdent_nom()));
		sb.append("|").append(Util.preencheRegistro(registroJ930.getIdent_cpf_cnpj()));
		sb.append("|").append(Util.preencheRegistro(registroJ930.getIdent_qualif()));
		sb.append("|").append(Util.preencheRegistro(registroJ930.getCod_assin()));
		sb.append("|").append(Util.preencheRegistro(registroJ930.getInd_crc()));
		sb.append("|").append(Util.preencheRegistro(registroJ930.getEmail()));
		sb.append("|").append(Util.preencheRegistro(registroJ930.getFone()));
		sb.append("|").append(Util.preencheRegistro(registroJ930.getUf_crc()));
		sb.append("|").append(Util.preencheRegistro(registroJ930.getNum_seq_crc()));
		sb.append("|").append(Util.preencheRegistro(registroJ930.getDt_crc()));
		sb.append("|").append(Util.preencheRegistro(registroJ930.getInd_resp_legal()));
		sb.append("|").append('\n');

		return sb;
	}
}
