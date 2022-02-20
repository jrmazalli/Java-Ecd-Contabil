package br.com.ecoded.ecd.contabil.bo.blocoK;

import br.com.ecoded.ecd.contabil.registros.EcdContabil;
import br.com.ecoded.ecd.contabil.registros.blocoK.BlocoK;
import br.com.ecoded.ecd.contabil.registros.blocoK.BlocoKEnum;
import br.com.ecoded.ecd.contabil.registros.blocoK.RegistroK990;
import br.com.ecoded.ecd.contabil.util.Util;

public class GerarBlocoK {

	private static StringBuilder sb = null;

	public static StringBuilder gerar(EcdContabil ecdcontabil, StringBuilder sbr) {
		BlocoK blocoK = ecdcontabil.getBlocoK();
		sb = sbr;

		// REGISTROK001
		if (!Util.isEmpty(blocoK.getRegistroK001())) {
			GerarRegistroK001.gerar(blocoK.getRegistroK001(), sb);
			ecdcontabil.getContadoresBlocoK().incrementar(BlocoKEnum.RegistroK001);
		}

		// REGISTROK030
		if (!Util.isEmpty(blocoK.getRegistroK030())) {
			GerarRegistroK030.gerar(blocoK.getRegistroK030(), sb);
			ecdcontabil.getContadoresBlocoK().incrementar(BlocoKEnum.RegistroK030);
		}

		// REGISTROK100
		if (!Util.isEmpty(blocoK.getRegistroK100())) {
			blocoK.getRegistroK100().forEach(registroK100 -> {
				GerarRegistroK100.gerar(registroK100, sb);
				ecdcontabil.getContadoresBlocoK().incrementar(BlocoKEnum.RegistroK100);

				// REGISTROK110
				if (!Util.isEmpty(registroK100.getRegistroK110())) {
					registroK100.getRegistroK110().forEach(registroK110 -> {
						GerarRegistroK110.gerar(registroK110, sb);
						ecdcontabil.getContadoresBlocoK().incrementar(BlocoKEnum.RegistroK110);
					});
				}

				// REGISTROK115
				if (!Util.isEmpty(registroK100.getRegistroK115())) {
					registroK100.getRegistroK115().forEach(registroK115 -> {
						GerarRegistroK115.gerar(registroK115, sb);
						ecdcontabil.getContadoresBlocoK().incrementar(BlocoKEnum.RegistroK115);
					});
				}

			});
		}

		// REGISTROK200
		if (!Util.isEmpty(blocoK.getRegistroK200())) {
			blocoK.getRegistroK200().forEach(registroK200 -> {
				GerarRegistroK200.gerar(registroK200, sb);
				ecdcontabil.getContadoresBlocoK().incrementar(BlocoKEnum.RegistroK200);
			});
		}

		// REGISTROK210
		if (!Util.isEmpty(blocoK.getRegistroK210())) {
			blocoK.getRegistroK210().forEach(registroK210 -> {
				GerarRegistroK210.gerar(registroK210, sb);
				ecdcontabil.getContadoresBlocoK().incrementar(BlocoKEnum.RegistroK210);
			});
		}

		// REGISTROK300
		if (!Util.isEmpty(blocoK.getRegistroK300())) {
			blocoK.getRegistroK300().forEach(registroK300 -> {
				GerarRegistroK300.gerar(registroK300, sb);
				ecdcontabil.getContadoresBlocoK().incrementar(BlocoKEnum.RegistroK300);

				// REGISTROK110
				if (!Util.isEmpty(registroK300.getRegistroK310())) {
					registroK300.getRegistroK310().forEach(registroK310 -> {
						GerarRegistroK310.gerar(registroK310, sb);
						ecdcontabil.getContadoresBlocoK().incrementar(BlocoKEnum.RegistroK310);
					});
				}

				// REGISTROK115
				if (!Util.isEmpty(registroK300.getRegistroK315())) {
					registroK300.getRegistroK315().forEach(registroK315 -> {
						GerarRegistroK315.gerar(registroK315, sb);
						ecdcontabil.getContadoresBlocoK().incrementar(BlocoKEnum.RegistroK315);
					});
				}

			});
		}

		// REGISTROP990
		if (ecdcontabil.getContadoresBlocoK().getContRegistroK990() > 0) {
			RegistroK990 registroK990 = new RegistroK990();
			registroK990.setQtd_lin_k(String.valueOf(ecdcontabil.getContadoresBlocoK().getContRegistroK990() + 1));

			blocoK.setRegistroK990(registroK990);
			GerarRegistroK990.gerar(blocoK.getRegistroK990(), sb);
		}

		return sb;
	}
}
