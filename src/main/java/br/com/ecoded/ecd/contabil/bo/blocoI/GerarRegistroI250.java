package br.com.ecoded.ecd.contabil.bo.blocoI;

import br.com.ecoded.ecd.contabil.registros.EcdContabil;
import br.com.ecoded.ecd.contabil.registros.blocoI.RegistroI250;
import br.com.ecoded.ecd.contabil.util.Util;

public class GerarRegistroI250 {

	public static StringBuilder gerar(EcdContabil ecdContabil,  RegistroI250 registroI250, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registroI250.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroI250.getCod_cta()));
		sb.append("|").append(Util.preencheRegistro(registroI250.getCod_ccus()));
		sb.append("|").append(Util.preencheRegistro(registroI250.getVl_dc()));
		sb.append("|").append(Util.preencheRegistro(registroI250.getInd_dc()));
		sb.append("|").append(Util.preencheRegistro(registroI250.getNum_arq()));
		sb.append("|").append(Util.preencheRegistro(registroI250.getCod_hist_pad()));
		sb.append("|").append(Util.preencheRegistro(registroI250.getHist()));
		sb.append("|").append(Util.preencheRegistro(registroI250.getCod_part()));
		if (Util.versao2022(ecdContabil.getBloco0().getRegistro0000().getDt_ini())) {
			sb.append("|").append(Util.preencheRegistro(registroI250.getVl_dc_mf()));
			sb.append("|").append(Util.preencheRegistro(registroI250.getInd_dc_mf()));
		}
		sb.append("|").append('\n');

		return sb;
	}
}
