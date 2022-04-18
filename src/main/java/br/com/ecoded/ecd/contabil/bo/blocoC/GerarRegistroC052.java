package br.com.ecoded.ecd.contabil.bo.blocoC;

import br.com.ecoded.ecd.contabil.registros.blocoC.RegistroC052;
import br.com.ecoded.ecd.contabil.util.Util;

public class GerarRegistroC052 {
	
	public static StringBuilder gerar(RegistroC052 registroC052, StringBuilder sb) {
		
		sb.append("|").append(Util.preencheRegistro(registroC052.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroC052.getCod_ccus()));
		sb.append("|").append(Util.preencheRegistro(registroC052.getCod_agl()));
		sb.append("|").append('\n');

		return sb;
	}

}
