package br.com.ecoded.ecd.contabil.bo.bloco0;

import br.com.ecoded.ecd.contabil.registros.bloco0.Registro0150;
import br.com.ecoded.ecd.contabil.util.Util;

public class GerarRegistro0150 {

	public static StringBuilder gerar(Registro0150 registro0150, StringBuilder sb) {
		sb.append("|").append(Util.preencheRegistro(registro0150.getReg()));
		sb.append("|").append(Util.preencheRegistro(registro0150.getCod_part()));
		sb.append("|").append(Util.preencheRegistro(registro0150.getNome()));
		sb.append("|").append(Util.preencheRegistro(registro0150.getCod_pais()));
		sb.append("|").append(Util.preencheRegistro(registro0150.getCnpj()));
		sb.append("|").append(Util.preencheRegistro(registro0150.getCpf()));
		sb.append("|").append(Util.preencheRegistro(registro0150.getNit()));
		sb.append("|").append(Util.preencheRegistro(registro0150.getUf()));
		sb.append("|").append(Util.preencheRegistro(registro0150.getIe()));
		sb.append("|").append(Util.preencheRegistro(registro0150.getIe_st()));
		sb.append("|").append(Util.preencheRegistro(registro0150.getCod_mun()));
		sb.append("|").append(Util.preencheRegistro(registro0150.getIm()));
		sb.append("|").append(Util.preencheRegistro(registro0150.getSuframa()));
		sb.append("|").append('\n');
		return sb;
	}
}
