package br.com.ecoded.ecd.contabil.bo.blocoC;

import br.com.ecoded.ecd.contabil.registros.EcdContabil;
import br.com.ecoded.ecd.contabil.registros.blocoC.BlocoC;
import br.com.ecoded.ecd.contabil.registros.blocoC.BlocoCEnum;
import br.com.ecoded.ecd.contabil.registros.blocoC.RegistroC990;
import br.com.ecoded.ecd.contabil.util.Util;

public class GerarBlocoC {

	private static StringBuilder sb = null;

	public static StringBuilder gerar(EcdContabil ecdContabil, StringBuilder sbr) {

		BlocoC blocoC = ecdContabil.getBlocoC();
		sb = sbr;

		// REGISTROC001
		if (!Util.isEmpty(blocoC.getRegistroC001())) {
			GerarRegistroC001.gerar(blocoC.getRegistroC001(), sb);
			ecdContabil.getContadoresBlocoC().incrementar(BlocoCEnum.RegistroC001);
		}

		// REGISTROC040
		if (!Util.isEmpty(blocoC.getRegistroC040())) {
			GerarRegistroC040.gerar(ecdContabil, blocoC.getRegistroC040(), sb);
			ecdContabil.getContadoresBlocoC().incrementar(BlocoCEnum.RegistroC040);
		}

		// REGISTROC050
		if (!Util.isEmpty(blocoC.getRegistroC050())) {
			blocoC.getRegistroC050().forEach(registroC050 -> {
				GerarRegistroC050.gerar(registroC050, sb);
				ecdContabil.getContadoresBlocoC().incrementar(BlocoCEnum.RegistroC050);

				// REGISTROC051
				if (!Util.isEmpty(registroC050.getRegistroC051())) {
					GerarRegistroC051.gerar(registroC050.getRegistroC051(), sb);
					ecdContabil.getContadoresBlocoC().incrementar(BlocoCEnum.RegistroC051);
				}

				// REGISTROC052
				if (!Util.isEmpty(registroC050.getRegistroC052())) {
					GerarRegistroC052.gerar(registroC050.getRegistroC052(), sb);
					ecdContabil.getContadoresBlocoC().incrementar(BlocoCEnum.RegistroC052);
				}
			});
		}

		// REGISTROC150
		if (!Util.isEmpty(blocoC.getRegistroC150())) {
			blocoC.getRegistroC150().forEach(registroC150 -> {
				GerarRegistroC150.gerar(registroC150, sb);
				ecdContabil.getContadoresBlocoC().incrementar(BlocoCEnum.RegistroC150);

				// REGISTROC155
				if (!Util.isEmpty(registroC150.getRegistroC155())) {
					registroC150.getRegistroC155().forEach(registroC155 -> {
						GerarRegistroC155.gerar(registroC155, sb);
						ecdContabil.getContadoresBlocoC().incrementar(BlocoCEnum.RegistroC155);
					});
				}
			});
		}

		// REGISTROC600
		if (!Util.isEmpty(blocoC.getRegistroC600())) {
			blocoC.getRegistroC600().forEach(registroC600 -> {
				GerarRegistroC600.gerar(registroC600, sb);
				ecdContabil.getContadoresBlocoC().incrementar(BlocoCEnum.RegistroC600);

				// REGISTROC650
				if (!Util.isEmpty(registroC600.getRegistroC650())) {
					registroC600.getRegistroC650().forEach(registroC650 -> {
						GerarRegistroC650.gerar(registroC650, sb);
						ecdContabil.getContadoresBlocoC().incrementar(BlocoCEnum.RegistroC650);
					});
				}
			});
		}

		// REGISTROC990
		if (ecdContabil.getContadoresBlocoC().getContRegistroC990() > 0) {
			RegistroC990 registroC990 = new RegistroC990();
			registroC990.setQtd_lin_c(String.valueOf(ecdContabil.getContadoresBlocoC().getContRegistroC990() + 1));

			blocoC.setRegistroC990(registroC990);
			GerarRegistroC990.gerar(blocoC.getRegistroC990(), sb);
		}

		return sb;
	}
}
