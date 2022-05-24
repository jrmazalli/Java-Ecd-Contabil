package br.com.ecoded.ecd.contabil.bo;

import br.com.ecoded.ecd.contabil.registros.bloco0.Bloco0;
import br.com.ecoded.ecd.contabil.registros.bloco0.Registro0000;
import br.com.ecoded.ecd.contabil.registros.bloco0.Registro0001;
import br.com.ecoded.ecd.contabil.registros.bloco0.Registro0007;
import br.com.ecoded.ecd.contabil.registros.bloco0.Registro0990;
import br.com.ecoded.ecd.contabil.registros.blocoI.BlocoI;
import br.com.ecoded.ecd.contabil.registros.blocoI.RegistroI001;
import br.com.ecoded.ecd.contabil.registros.blocoI.RegistroI010;
import br.com.ecoded.ecd.contabil.registros.blocoI.RegistroI030;
import br.com.ecoded.ecd.contabil.registros.blocoI.RegistroI050;
import br.com.ecoded.ecd.contabil.registros.blocoI.RegistroI051;
import br.com.ecoded.ecd.contabil.registros.blocoI.RegistroI052;
import br.com.ecoded.ecd.contabil.registros.blocoI.RegistroI053;
import br.com.ecoded.ecd.contabil.registros.blocoI.RegistroI075;
import br.com.ecoded.ecd.contabil.registros.blocoI.RegistroI100;
import br.com.ecoded.ecd.contabil.registros.blocoI.RegistroI150;
import br.com.ecoded.ecd.contabil.registros.blocoI.RegistroI155;
import br.com.ecoded.ecd.contabil.registros.blocoI.RegistroI157;
import br.com.ecoded.ecd.contabil.registros.blocoI.RegistroI200;
import br.com.ecoded.ecd.contabil.registros.blocoI.RegistroI250;
import br.com.ecoded.ecd.contabil.registros.blocoI.RegistroI300;
import br.com.ecoded.ecd.contabil.registros.blocoI.RegistroI310;
import br.com.ecoded.ecd.contabil.registros.blocoI.RegistroI350;
import br.com.ecoded.ecd.contabil.registros.blocoI.RegistroI355;
import br.com.ecoded.ecd.contabil.registros.blocoI.RegistroI990;
import br.com.ecoded.ecd.contabil.registros.blocoJ.BlocoJ;
import br.com.ecoded.ecd.contabil.registros.blocoJ.RegistroJ001;
import br.com.ecoded.ecd.contabil.registros.blocoJ.RegistroJ005;
import br.com.ecoded.ecd.contabil.registros.blocoJ.RegistroJ100;
import br.com.ecoded.ecd.contabil.registros.blocoJ.RegistroJ150;
import br.com.ecoded.ecd.contabil.registros.blocoJ.RegistroJ210;
import br.com.ecoded.ecd.contabil.registros.blocoJ.RegistroJ215;
import br.com.ecoded.ecd.contabil.registros.blocoJ.RegistroJ800;
import br.com.ecoded.ecd.contabil.registros.blocoJ.RegistroJ801;
import br.com.ecoded.ecd.contabil.registros.blocoJ.RegistroJ900;
import br.com.ecoded.ecd.contabil.registros.blocoJ.RegistroJ930;
import br.com.ecoded.ecd.contabil.registros.blocoJ.RegistroJ932;
import br.com.ecoded.ecd.contabil.registros.blocoJ.RegistroJ935;
import br.com.ecoded.ecd.contabil.registros.blocoJ.RegistroJ990;

public class PrincipalTesteContabil {

	public static Bloco0 preencheBloco0() {
		Bloco0 bloco0 = new Bloco0();
		bloco0 = preencheRegistro0000(bloco0);
		bloco0 = preencheRegistro0001(bloco0);
		bloco0 = preencheRegistro0007(bloco0);
//		bloco0 = preencheRegistro0020(bloco0);
//		bloco0 = preencheRegistro0035(bloco0);
//		bloco0 = preencheRegistro0150(bloco0);
//		bloco0 = preencheRegistro0180(bloco0);
		bloco0 = preencheRegistro0990(bloco0);

		return bloco0;
	}

	public static Bloco0 preencheRegistro0000(Bloco0 bloco0) {
		Registro0000 registro0000 = new Registro0000();
		registro0000.setLecd("LECD");
		registro0000.setDt_ini("01012019");
		registro0000.setDt_fin("31122019");
		registro0000.setNome("MAZATEST");
		registro0000.setCnpj("02209027000208");
		registro0000.setUf("MT");
		registro0000.setIe("124182292");
		registro0000.setCod_mun("5103403");
		registro0000.setIm("ISENTO");
		registro0000.setInd_sit_esp("");
		registro0000.setInd_sit_ini_per("0");
		registro0000.setInd_nire("1");
		registro0000.setInd_fin_esc("0");
		registro0000.setCod_hash_sub("");
		registro0000.setInd_grande_porte("0");
		registro0000.setTip_ecd("0");
		registro0000.setCod_scp("");
		registro0000.setIdent_mf("N");
		registro0000.setInd_esc_cons("N");
		registro0000.setInd_centralizada("0");
		registro0000.setInd_mudanc_pc("1");
		registro0000.setCod_plan_ref("1");
		bloco0.setRegistro0000(registro0000);

		return bloco0;
	}

	public static Bloco0 preencheRegistro0001(Bloco0 bloco0) {
		Registro0001 registro0001 = new Registro0001();
		registro0001.setInd_dad("0");
		bloco0.setRegistro0001(registro0001);
		return bloco0;
	}

	public static Bloco0 preencheRegistro0007(Bloco0 bloco0) {
		Registro0007 registro0007 = new Registro0007();
		registro0007.setCod_ent_ref("01");
		registro0007.setCod_inscr("");
		bloco0.getRegistro0007().add(registro0007);
		return bloco0;
	}

	public static Bloco0 preencheRegistro0990(Bloco0 bloco0) {
		Registro0990 registro0990 = new Registro0990();
		bloco0.setRegistro0990(registro0990);
		return bloco0;
	}

	public static BlocoI preencheBlocoI() {
		BlocoI blocoI = new BlocoI();
		blocoI = preencheRegistroI001(blocoI);
		blocoI = preencheRegistroI010(blocoI);
		blocoI = preencheRegistroI030(blocoI);
		blocoI = preencheRegistroI050(blocoI);
		blocoI = preencheRegistroI075(blocoI);
		blocoI = preencheRegistroI100(blocoI);
		blocoI = preencheRegistroI150(blocoI);
		blocoI = preencheRegistroI200(blocoI);
		blocoI = preencheRegistroI300(blocoI);
		blocoI = preencheRegistroI350(blocoI);
		blocoI = preencheRegistroI990(blocoI);
		return blocoI;
	}

	public static BlocoI preencheRegistroI001(BlocoI blocoI) {
		RegistroI001 registroI001 = new RegistroI001();
		registroI001.setInd_mov("1");

		blocoI.setRegistroI001(registroI001);
		return blocoI;
	}

	public static BlocoI preencheRegistroI010(BlocoI blocoI) {
		RegistroI010 registroI010 = new RegistroI010();
		registroI010.setInd_esc("G");
		registroI010.setCod_ver_lc("8.00");
		blocoI.setRegistroI010(registroI010);
		return blocoI;
	}

	public static BlocoI preencheRegistroI030(BlocoI blocoI) {
		RegistroI030 registroI030 = new RegistroI030();
		registroI030.setDnrc_abert("TERMO DE ABERTURA");
		registroI030.setNum_ord("22");
		registroI030.setNat_livr("Escrituracao Contabil Digital do Livro Diario Geral");
		registroI030.setQtd_lin("842116");
		registroI030.setNome("MAZATEST");
		registroI030.setNire("51300005123");
		registroI030.setCnpj("02209027000208");
		registroI030.setDt_arq("06031974");
		registroI030.setDt_arq_conv("");
		registroI030.setDesc_mun("CUIABA");
		registroI030.setDt_ex_social("31122019");
		blocoI.setRegistroI030(registroI030);
		return blocoI;
	}

	public static BlocoI preencheRegistroI050(BlocoI blocoI) {
		RegistroI050 registroI050 = new RegistroI050();
		registroI050.setDt_alt("31122016");
		registroI050.setCod_nat("01");
		registroI050.setInd_cta("S");
		registroI050.setNivel("1");
		registroI050.setCod_cta("1");
		registroI050.setCod_cta_sup("");
		registroI050.setCta("ATIVO");

		RegistroI051 registroI051 = new RegistroI051();
		registroI051.setCod_ccus("");
		registroI051.setCod_cta_ref("1.01.01.01.01");

		RegistroI052 registroI052 = new RegistroI052();
		registroI052.setCod_ccus("");
		registroI052.setCod_agl("1.1.01.01.001");

		RegistroI053 registroI053 = new RegistroI053();
		registroI053.setCod_idt("");
		registroI053.setCod_cnt_corr("");
		registroI053.setNat_sub_cnt("");

		registroI050.getRegistroI051().add(registroI051);
		registroI050.getRegistroI052().add(registroI052);
		registroI050.getRegistroI053().add(registroI053);

		return blocoI;
	}

	public static BlocoI preencheRegistroI075(BlocoI blocoI) {
		RegistroI075 registroI075 = new RegistroI075();
		registroI075.setCod_hist("13");
		registroI075.setDescr_hist("S/NOTA FISCAL N.");

		blocoI.getRegistroI075().add(registroI075);

		return blocoI;
	}

	public static BlocoI preencheRegistroI100(BlocoI blocoI) {
		RegistroI100 registroI100 = new RegistroI100();
		registroI100.setDt_alt("31122016");
		registroI100.setCod_ccus("1");
		registroI100.setCcus("GERAL");
		blocoI.getRegistroI100().add(registroI100);
		return blocoI;
	}

	public static BlocoI preencheRegistroI150(BlocoI blocoI) {
		RegistroI150 registroI150 = new RegistroI150();
		registroI150.setDt_ini("01012019");
		registroI150.setDt_fin("31012019");
		blocoI.getRegistroI150().add(registroI150);

		RegistroI155 registroI155 = new RegistroI155();
		registroI155.setCod_cta("1.1.01.01.001");
		registroI155.setCod_ccus("");
		registroI155.setVl_sld_ini("10000,00");
		registroI155.setInd_dc_ini("D");
		registroI155.setVl_deb("0,00");
		registroI155.setVl_cred("0,00");
		registroI155.setVl_sld_fin("10000,00");
		registroI155.setInd_dc_fin("D");
//		registroI155.setVl_sld_ini_mf("");
//		registroI155.setInd_dc_ini_mf("");
//		registroI155.setVl_deb_mf("");
//		registroI155.setVl_cred_mf("");
//		registroI155.setVl_sld_fin_mf("");
//		registroI155.setInd_dc_fin_mf("");

		RegistroI157 registroI157 = new RegistroI157();
		registroI157.setCod_cta("");
		registroI157.setCod_ccus("");
		registroI157.setVl_sld_ini("");
		registroI157.setInd_dc_ini("");
		registroI157.setVl_sld_ini_mf("");
		registroI157.setInd_dc_ini_mf("");

		registroI150.getRegistroI155().add(registroI155);
		// registroI150.getRegistroI157().add(registroI157);

		return blocoI;
	}

	public static BlocoI preencheRegistroI200(BlocoI blocoI) {
		RegistroI200 registroI200 = new RegistroI200();
		registroI200.setNum_lcto("1");
		registroI200.setDt_lcto("31122019");
		registroI200.setVl_lcto("83701122,39");
		registroI200.setInd_lcto("N");
		registroI200.setDt_lcto_ext("");
		registroI200.setVl_lcto_mf("");
		blocoI.getRegistroI200().add(registroI200);

		RegistroI250 registroI250 = new RegistroI250();
		registroI250.setCod_cta("3.1.02.01.011");
		registroI250.setCod_ccus("");
		registroI250.setVl_dc("83701122,39");
		registroI250.setInd_dc("C");
		registroI250.setNum_arq("");
		registroI250.setCod_hist_pad("");
		registroI250.setHist(
				"CONTABILIZACAO DO RESULT. DA EQUIV. PATRIMONIAL  COM BASE NO PL DE 31/12/2019 DA CONTROLADA MAZATEST");
		registroI250.setCod_part("");
		// registroI250.setVl_dc_mf("");
		// registroI250.setInd_dc_mf("");

		registroI200.getRegistroI250().add(registroI250);

		return blocoI;
	}

	public static BlocoI preencheRegistroI300(BlocoI blocoI) {
		RegistroI300 registroI300 = new RegistroI300();
		registroI300.setDt_bcte("");
		// blocoI.getRegistroI300().add(registroI300);

		RegistroI310 registroI310 = new RegistroI310();
		registroI310.setCod_cta("");
		registroI310.setCod_ccus("");
		registroI310.setVal_debd("");
		registroI310.setVal_credd("");
		registroI310.setVal_deb_mf("");
		registroI310.setVal_cred_mf("");

		// registroI300.getRegistroI310().add(registroI310);

		return blocoI;
	}

	public static BlocoI preencheRegistroI350(BlocoI blocoI) {
		RegistroI350 registroI350 = new RegistroI350();
		registroI350.setDt_res("31122019");
		blocoI.getRegistroI350().add(registroI350);

		RegistroI355 registroI355 = new RegistroI355();
		registroI355.setCod_cta("3.1.02.01.011");
		registroI355.setCod_ccus("");
		registroI355.setVal_cta("83701122,39");
		registroI355.setInd_dc("C");
		// registroI355.setVal_cta_mf("");
		// registroI355.setInd_dc_mf("");

		registroI350.getRegistroI355().add(registroI355);

		return blocoI;
	}

	public static BlocoI preencheRegistroI990(BlocoI blocoI) {
		RegistroI990 registroI990 = new RegistroI990();
		blocoI.setRegistroI990(registroI990);
		return blocoI;
	}

//	// INICIA BLOCO J
	public static BlocoJ preencheBlocoJ() {
		BlocoJ blocoJ = new BlocoJ();
		blocoJ = preencheRegistroJ001(blocoJ);
		blocoJ = preencheRegistroJ005(blocoJ);
		blocoJ = preencheRegistroJ210(blocoJ);
		blocoJ = preencheRegistroJ800(blocoJ);
		blocoJ = preencheRegistroJ801(blocoJ);
		blocoJ = preencheRegistroJ900(blocoJ);
		blocoJ = preencheRegistroJ990(blocoJ);

		return blocoJ;
	}

	private static BlocoJ preencheRegistroJ001(BlocoJ blocoJ) {
		RegistroJ001 registroJ001 = new RegistroJ001();
		registroJ001.setInd_dad("0");
		blocoJ.setRegistroJ001(registroJ001);
		return blocoJ;
	}

	private static BlocoJ preencheRegistroJ005(BlocoJ blocoJ) {
		RegistroJ005 registroJ005 = new RegistroJ005();
		registroJ005.setDt_ini("01012019");
		registroJ005.setDt_fin("31122019");
		registroJ005.setId_dem("1");
		registroJ005.setCab_dem("");
		blocoJ.setRegistroJ005(registroJ005);
		// blocoJ.getRegistroJ005().add(registroJ005);

		RegistroJ100 registroJ100 = new RegistroJ100();
		registroJ100.setCod_agl("1");
		registroJ100.setInd_cod_agl("T");
		registroJ100.setNivel_agl("1");
		registroJ100.setCod_agl_sup("");
		registroJ100.setInd_grp_bal("A");
		registroJ100.setDesc_cod_agl("ATIVO");
		registroJ100.setVl_cta_ini("364537348,09");
		registroJ100.setInd_dc_cta_ini("D");
		registroJ100.setVl_cta_fin("448238470,48");
		registroJ100.setInd_dc_cta_fin("D");
		registroJ100.setNota_exp_ref("");

		RegistroJ150 registroJ150 = new RegistroJ150();
		registroJ150.setNu_ordem("1");
		registroJ150.setCod_agl("5");
		registroJ150.setInd_cod_agl("T");
		registroJ150.setNivel_agl("1");
		registroJ150.setCod_agl_sup("");
		registroJ150.setDescr_cod_agl("RESULTADO DO EXERCICIO");
		registroJ150.setVl_cta_ini_("96943136,03");
		registroJ150.setInd_dc_cta_ini("C");
		registroJ150.setVl_cta_fin("83701122,39");
		registroJ150.setInd_dc_cta_fin("C");
		registroJ150.setInd_grp_dre("R");
		registroJ150.setNota_exp_ref("");

		registroJ005.getRegistroJ100().add(registroJ100);
		registroJ005.getRegistroJ150().add(registroJ150);

		return blocoJ;
	}

	private static BlocoJ preencheRegistroJ210(BlocoJ blocoJ) {
		RegistroJ210 registroJ210 = new RegistroJ210();
		registroJ210.setInd_tip("");
		registroJ210.setCod_agl("");
		registroJ210.setDescr_cod_agl("");
		registroJ210.setVl_cta_ini("");
		registroJ210.setInd_dc_cta_ini("");
		registroJ210.setVl_cta_fin("");
		registroJ210.setInd_dc_cta_fin("");
		registroJ210.setNotas_exp_ref("");
		// blocoJ.getRegistroJ210().add(registroJ210);

		RegistroJ215 registroJ215 = new RegistroJ215();
		registroJ215.setCod_hist_fat("");
		registroJ215.setDesc_fat("");
		registroJ215.setVl_fat_cont("");
		registroJ215.setInd_dc_fat("");

		// registroJ210.getRegistroJ215().add(registroJ215);

		return blocoJ;
	}

	private static BlocoJ preencheRegistroJ800(BlocoJ blocoJ) {
		RegistroJ800 registroJ800 = new RegistroJ800();
		registroJ800.setTipo_doc("");
		registroJ800.setDesc_rtf("");
		registroJ800.setHash_rtf("");
		registroJ800.setArq_rtf("");
		registroJ800.setInd_fim_rtf("");
		// blocoJ.getRegistroJ800().add(registroJ800);
		return blocoJ;
	}

	private static BlocoJ preencheRegistroJ801(BlocoJ blocoJ) {
		RegistroJ801 registroJ801 = new RegistroJ801();
		registroJ801.setTipo_doc("");
		registroJ801.setDesc_rtf("");
		registroJ801.setCod_mot_subs("");
		registroJ801.setHash_rtf("");
		registroJ801.setArq_rtf("");
		registroJ801.setInd_fim_rtf("");
		// blocoJ.getRegistroJ801().add(registroJ801);
		return blocoJ;
	}

	private static BlocoJ preencheRegistroJ900(BlocoJ blocoJ) {
		RegistroJ900 registroJ900 = new RegistroJ900();
		registroJ900.setDnrc_encer("TERMO DE ENCERRAMENTO");
		registroJ900.setNum_ord("22");
		registroJ900.setNat_livro("Escrituracao Contabil Digital do Livro Diario Geral");
		registroJ900.setNome("MAZATEST");
		registroJ900.setQtd_lin("842116");
		registroJ900.setDt_ini_escr("01012019");
		registroJ900.setDt_fin_escr("31122019");
		blocoJ.setRegistroJ900(registroJ900);

		RegistroJ930 registroJ930 = new RegistroJ930();
		registroJ930.setIdent_nom("MOÇO DA SILVA");
		registroJ930.setIdent_cpf_cnpj("36686362816");
		registroJ930.setIdent_qualif("Contador");
		registroJ930.setCod_assin("900");
		registroJ930.setInd_crc("288626O4");
		registroJ930.setEmail("contador@mazatest.com.br");
		registroJ930.setFone("1833220000");
		registroJ930.setUf_crc("SP");
		registroJ930.setNum_seq_crc("SP/2018/001");
		registroJ930.setDt_crc("31120087");
		registroJ930.setInd_resp_legal("N");

		RegistroJ932 registroJ932 = new RegistroJ932();
		registroJ932.setIdent_nom_t("");
		registroJ932.setIdent_cpf_cnpj_t("");
		registroJ932.setIdent_qualif_t("");
		registroJ932.setCod_assin_t("");
		registroJ932.setInd_crc_t("");
		registroJ932.setEmail_t("");
		registroJ932.setFone_t("");
		registroJ932.setUf_crc_t("");
		registroJ932.setNum_seq_crc_t("");
		registroJ932.setDt_crc_t("");

		RegistroJ935 registroJ935 = new RegistroJ935();
		registroJ935.setNi_cpf_cnpj("");
		registroJ935.setNome_auditor_firma("");
		registroJ935.setCod_cvm_auditor("");

		registroJ900.getRegistroJ930().add(registroJ930);
		// registroJ900.getRegistroJ932().add(registroJ932);

		// registroJ900.getRegistroJ935().add(registroJ935);

		return blocoJ;
	}

	public static BlocoJ preencheRegistroJ990(BlocoJ blocoJ) {
		RegistroJ990 registroJ990 = new RegistroJ990();
		blocoJ.setRegistroJ990(registroJ990);
		return blocoJ;
	}

}
