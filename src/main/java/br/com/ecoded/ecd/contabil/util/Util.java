package br.com.ecoded.ecd.contabil.util;

import java.io.File;
import java.io.FileWriter;
import java.time.LocalDate;
import java.util.Collection;

import br.com.ecoded.ecd.contabil.exception.EcdException;
import br.com.ecoded.ecd.contabil.registros.EcdContabil;

public final class Util {
	
    private final static LocalDate dataVersao2018 = LocalDate.of(2017, 12, 31);
    private final static LocalDate dataVersao2019 = LocalDate.of(2018, 12, 31);
    private final static LocalDate dataVersao2020 = LocalDate.of(2019, 12, 31);
	private final static LocalDate dataVersao2021 = LocalDate.of(2020, 12, 31);
	private final static LocalDate dataVersao2022 = LocalDate.of(2021, 12, 31);
	private final static LocalDate dataVersao2023 = LocalDate.of(2022, 12, 31);
	private final static LocalDate dataVersao2024 = LocalDate.of(2023, 12, 31);
	private final static LocalDate dataVersao2025 = LocalDate.of(2024, 12, 31);
	private final static LocalDate dataVersao2026 = LocalDate.of(2025, 12, 31);
	private final static LocalDate dataVersao2027 = LocalDate.of(2026, 12, 31);
	private final static LocalDate dataVersao2028 = LocalDate.of(2027, 12, 31);
	
	private Util() {

	}

	/**
	 * Verifica se um objeto está vazio.
	 * 
	 * @param obj
	 * @return <b>true</b> se o objeto for vazio(empty).
	 */
    public static boolean isEmpty(Object obj) {
		if (obj == null)
			return true;
		if (obj instanceof Collection)
			return ((Collection<?>) obj).size() == 0;

		final String s = String.valueOf(obj).trim();

		return s.length() == 0 || s.equalsIgnoreCase("null");
	}
    
    /**
     * Preenche o Registro
     *
     * @param String
     */
    public static String preencheRegistro(String string) {
        return Util.isEmpty(string) ? "" : string;
    }

    public static boolean versao2018(String dataStr) {
        return strToDate(dataStr).isAfter(dataVersao2018);
    }

    public static boolean versao2019(String dataStr) {
        return strToDate(dataStr).isAfter(dataVersao2019);
    }

    public static boolean versao2020(String dataStr) {
        return strToDate(dataStr).isAfter(dataVersao2020);
    }
    
    public static boolean versao2021(String dataStr) {
        return strToDate(dataStr).isAfter(dataVersao2021);
    }
    
    public static boolean versao2022(String dataStr) {
        return strToDate(dataStr).isAfter(dataVersao2022);
    }
    
    public static boolean versao2023(String dataStr) {
        return strToDate(dataStr).isAfter(dataVersao2023);
    }
    
    public static boolean versao2024(String dataStr) {
        return strToDate(dataStr).isAfter(dataVersao2024);
    }
    
    public static boolean versao2025(String dataStr) {
        return strToDate(dataStr).isAfter(dataVersao2025);
    }
    
    public static boolean versao2026(String dataStr) {
        return strToDate(dataStr).isAfter(dataVersao2026);
    }
    
    public static boolean versao2027(String dataStr) {
        return strToDate(dataStr).isAfter(dataVersao2027);
    }
    
    public static boolean versao2028(String dataStr) {
        return strToDate(dataStr).isAfter(dataVersao2028);
    }

    private static LocalDate strToDate(String dataStr) {
        return LocalDate.of(Integer.parseInt(dataStr.substring(4, 8)), Integer.parseInt(dataStr.substring(2, 4)), Integer.parseInt(dataStr.substring(0, 2)));
    }
    
    /**
     * Cria um arquivo com os dados passados 
     * @throws Exception 
     */
    public static void criarPastaArquivo(String pasta, String arquivo , String conteudo ) throws EcdException {
    	
    	File folder = new File(pasta);
    	if(!folder.exists()){
    		folder.mkdirs();
    	}
    	
    	FileWriter fileWriter;
    	try {
    		fileWriter = new FileWriter(new File(pasta+"/"+arquivo));
    		fileWriter.write(conteudo);
    		fileWriter.close();
    	} catch (Exception e) {
    		throw new EcdException("Erro ao Criar Arquivo "+e.getMessage());    		
    	}
    }
    
	public static String getCodVersao(EcdContabil ecdcontabil) {
		if (versao2024(ecdcontabil.getBloco0().getRegistro0000().getDt_ini())) {
			return "012";
		} else if (versao2023(ecdcontabil.getBloco0().getRegistro0000().getDt_ini())) {
			return "011";
		} else if (versao2022(ecdcontabil.getBloco0().getRegistro0000().getDt_ini())) {
			return "010";
		} else if (versao2021(ecdcontabil.getBloco0().getRegistro0000().getDt_ini())) {
			return "009";
		} else if (versao2020(ecdcontabil.getBloco0().getRegistro0000().getDt_ini())) {
			return "008";
		} else if (versao2019(ecdcontabil.getBloco0().getRegistro0000().getDt_ini())) {
			return "007";
		} else if (versao2018(ecdcontabil.getBloco0().getRegistro0000().getDt_ini())) {
			return "006";
		} else {
			return "ERRO_COD_VERSAO";
		}
	}
    
   
}