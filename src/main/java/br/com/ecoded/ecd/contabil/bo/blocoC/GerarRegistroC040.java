package br.com.ecoded.ecd.contabil.bo.blocoC;

import br.com.ecoded.ecd.contabil.registros.EcdContabil;
import br.com.ecoded.ecd.contabil.registros.blocoC.RegistroC040;
import br.com.ecoded.ecd.contabil.util.Util;

public class GerarRegistroC040 {

	public static StringBuilder gerar(EcdContabil ecdContabil, RegistroC040 registroC040, StringBuilder sb) {
		

		sb.append("|").append(Util.preencheRegistro(registroC040.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroC040.getHash_ecd_rec()));
		sb.append("|").append(Util.preencheRegistro(registroC040.getDt_ini_ecd_rec()));
		sb.append("|").append(Util.preencheRegistro(registroC040.getDt_fin_ecd_rec()));
		sb.append("|").append(Util.preencheRegistro(registroC040.getCnpj_ecd_rec()));
		sb.append("|").append(Util.preencheRegistro(registroC040.getInd_esc()));
		sb.append("|").append(Util.preencheRegistro(Util.getCodVersao(ecdContabil)));
		sb.append("|").append(Util.preencheRegistro(registroC040.getNum_ord()));
		sb.append("|").append(Util.preencheRegistro(registroC040.getNat_livr()));
		sb.append("|").append(Util.preencheRegistro(registroC040.getInd_sit_esp_ecd_rec()));
		sb.append("|").append(Util.preencheRegistro(registroC040.getDt_ini_ecd_rec()));
		sb.append("|").append(Util.preencheRegistro(registroC040.getInd_nire_ecd_rec()));
		sb.append("|").append(Util.preencheRegistro(registroC040.getInd_fin_esc_ecd_rec()));
		sb.append("|").append(Util.preencheRegistro(registroC040.getTip_ecd_rec()));
		sb.append("|").append(Util.preencheRegistro(registroC040.getCod_scp_ecd_rec()));
		sb.append("|").append(Util.preencheRegistro(registroC040.getIdent_mf_ecd_rec()));
		sb.append("|").append(Util.preencheRegistro(registroC040.getInd_esc_cons_ecd_rec()));
		sb.append("|").append(Util.preencheRegistro(registroC040.getInd_mudanca_pc_ecd_rec()));
		sb.append("|").append(Util.preencheRegistro(registroC040.getInd_plano_ref_ecd_rec()));
		sb.append("|").append('\n');

		return sb;
	}
}
