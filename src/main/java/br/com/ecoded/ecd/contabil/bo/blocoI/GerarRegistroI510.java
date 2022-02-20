package br.com.ecoded.ecd.contabil.bo.blocoI;

import br.com.ecoded.ecd.contabil.registros.blocoI.RegistroI510;
import br.com.ecoded.ecd.contabil.util.Util;

public class GerarRegistroI510 {

	public static StringBuilder gerar(RegistroI510 registroI510, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registroI510.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroI510.getNm_campo()));
		sb.append("|").append(Util.preencheRegistro(registroI510.getDec_campo()));
		sb.append("|").append(Util.preencheRegistro(registroI510.getTipo_campo()));
		sb.append("|").append(Util.preencheRegistro(registroI510.getTam_campo()));
		sb.append("|").append(Util.preencheRegistro(registroI510.getDec_campo()));
		sb.append("|").append(Util.preencheRegistro(registroI510.getCol_campo()));
		sb.append("|").append('\n');

		return sb;
	}

}
