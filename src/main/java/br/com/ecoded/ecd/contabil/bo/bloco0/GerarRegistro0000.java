package br.com.ecoded.ecd.contabil.bo.bloco0;

import br.com.ecoded.ecd.contabil.registros.bloco0.Registro0000;
import br.com.ecoded.ecd.contabil.util.Util;

public class GerarRegistro0000 {

	public static StringBuilder gerar(Registro0000 registro0000, StringBuilder sb) {
		sb.append("|").append(Util.preencheRegistro(registro0000.getReg()));
		sb.append("|").append(Util.preencheRegistro(registro0000.getLecd()));
		sb.append("|").append(Util.preencheRegistro(registro0000.getDt_ini()));
		sb.append("|").append(Util.preencheRegistro(registro0000.getDt_fin()));
		sb.append("|").append(Util.preencheRegistro(registro0000.getNome()));
		sb.append("|").append(Util.preencheRegistro(registro0000.getCnpj()));
		sb.append("|").append(Util.preencheRegistro(registro0000.getUf()));
		sb.append("|").append(Util.preencheRegistro(registro0000.getIe()));
		sb.append("|").append(Util.preencheRegistro(registro0000.getCod_mun()));
		sb.append("|").append(Util.preencheRegistro(registro0000.getIm()));
		sb.append("|").append(Util.preencheRegistro(registro0000.getInd_sit_esp()));
		sb.append("|").append(Util.preencheRegistro(registro0000.getInd_sit_ini_per()));
		sb.append("|").append(Util.preencheRegistro(registro0000.getInd_nire()));
		sb.append("|").append(Util.preencheRegistro(registro0000.getInd_fin_esc()));
		sb.append("|").append(Util.preencheRegistro(registro0000.getCod_hash_sub()));
		sb.append("|").append(Util.preencheRegistro(registro0000.getInd_grande_porte()));
		sb.append("|").append(Util.preencheRegistro(registro0000.getTip_ecd()));
		sb.append("|").append(Util.preencheRegistro(registro0000.getCod_scp()));
		sb.append("|").append(Util.preencheRegistro(registro0000.getIdent_mf()));
		sb.append("|").append(Util.preencheRegistro(registro0000.getInd_esc_cons()));
		sb.append("|").append(Util.preencheRegistro(registro0000.getInd_centralizada()));
		sb.append("|").append(Util.preencheRegistro(registro0000.getInd_mudanc_pc()));
		sb.append("|").append(Util.preencheRegistro(registro0000.getCod_plan_ref()));
		sb.append("|").append('\n');
		return sb;
	}
}
