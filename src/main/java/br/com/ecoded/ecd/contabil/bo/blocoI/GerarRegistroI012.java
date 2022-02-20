package br.com.ecoded.ecd.contabil.bo.blocoI;

import br.com.ecoded.ecd.contabil.registros.blocoI.RegistroI012;
import br.com.ecoded.ecd.contabil.util.Util;

public class GerarRegistroI012 {
	
	public static StringBuilder gerar(RegistroI012 registroI012, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registroI012.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroI012.getNum_ord()));
		sb.append("|").append(Util.preencheRegistro(registroI012.getNat_livr()));
		sb.append("|").append(Util.preencheRegistro(registroI012.getTipo()));
		sb.append("|").append(Util.preencheRegistro(registroI012.getCod_hash_aux()));
		sb.append("|").append('\n');

		return sb;
	}

}
