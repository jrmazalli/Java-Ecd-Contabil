package br.com.ecoded.ecd.contabil.bo;

import br.com.ecoded.ecd.contabil.exception.EcdException;
import br.com.ecoded.ecd.contabil.registros.EcdContabil;
import br.com.ecoded.ecd.contabil.util.Util;

public class TesteEcdContabil {

	public static void main(String[] args) {

		try {

			StringBuilder sb = new StringBuilder();
			EcdContabil ecdContabil = new EcdContabil();
			ecdContabil.setBloco0(PrincipalTesteContabil.preencheBloco0());
//			ecdContabil.setBlocoC(PrincipalTesteContabil.preencheBlocoC());
			ecdContabil.setBlocoI(PrincipalTesteContabil.preencheBlocoI());
			ecdContabil.setBlocoJ(PrincipalTesteContabil.preencheBlocoJ());
//			ecdContabil.setBlocoK(PrincipalTesteContabil.preencheBlocoK());

			sb = GerarEcdContabil.gerar(ecdContabil, sb);

			System.out.println("			GERAÇÃO SPED - ECD Contabil			");
			System.out.println("	");
			System.out.println(sb.toString());
			Util.criarPastaArquivo("C:/SPED-GERADO", "ecdcontabil.txt", sb.toString());
			System.out.println("Arquivo criado na pasta:  C:/SPED-GERADO	");

		} catch (EcdException e) {
			System.err.println();
			System.err.println(" Erro: " + e.getMessage());
		}

	}
}
