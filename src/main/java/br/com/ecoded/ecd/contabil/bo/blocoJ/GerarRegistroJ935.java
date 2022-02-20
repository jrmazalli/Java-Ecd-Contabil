package br.com.ecoded.ecd.contabil.bo.blocoJ;

import br.com.ecoded.ecd.contabil.registros.blocoJ.RegistroJ935;
import br.com.ecoded.ecd.contabil.util.Util;

public class GerarRegistroJ935 {

	public static StringBuilder gerar(RegistroJ935 registroJ935, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registroJ935.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroJ935.getNi_cpf_cnpj()));
		sb.append("|").append(Util.preencheRegistro(registroJ935.getNome_auditor_firma()));
		sb.append("|").append(Util.preencheRegistro(registroJ935.getCod_cvm_auditor()));
		sb.append("|").append('\n');

		return sb;
	}
}
