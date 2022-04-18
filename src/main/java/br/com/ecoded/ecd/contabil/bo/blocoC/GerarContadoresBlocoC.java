package br.com.ecoded.ecd.contabil.bo.blocoC;

import br.com.ecoded.ecd.contabil.registros.EcdContabil;
import br.com.ecoded.ecd.contabil.registros.bloco9.Bloco9;
import br.com.ecoded.ecd.contabil.registros.bloco9.Registro9900;
import br.com.ecoded.ecd.contabil.registros.blocoC.BlocoC;

public class GerarContadoresBlocoC {

    public static EcdContabil gerar(EcdContabil ecdcontabil) {

        BlocoC blocoC = ecdcontabil.getBlocoC();
        Bloco9 bloco9 = ecdcontabil.getBloco9();
        Registro9900 registro9900;

       
        int cont;
        cont = ecdcontabil.getContadoresBlocoC().getContRegistroC001();
        if (cont > 0) {
        	registro9900 = new Registro9900();
        	registro9900.setReg_blc("C001");
        	registro9900.setQtd_reg_blc(String.valueOf(cont));
            bloco9.getRegistro9900().add(registro9900);
        }
        cont = ecdcontabil.getContadoresBlocoC().getContRegistroC040();
        if (cont > 0) {
        	registro9900 = new Registro9900();
        	registro9900.setReg_blc("C040");
        	registro9900.setQtd_reg_blc(String.valueOf(cont));
            bloco9.getRegistro9900().add(registro9900);
        }
        
        cont = ecdcontabil.getContadoresBlocoC().getContRegistroC050();
        if (cont > 0) {
        	registro9900 = new Registro9900();
        	registro9900.setReg_blc("C050");
        	registro9900.setQtd_reg_blc(String.valueOf(cont));
            bloco9.getRegistro9900().add(registro9900);
        }
        
        cont = ecdcontabil.getContadoresBlocoC().getContRegistroC051();
        if (cont > 0) {
        	registro9900 = new Registro9900();
        	registro9900.setReg_blc("C051");
        	registro9900.setQtd_reg_blc(String.valueOf(cont));
            bloco9.getRegistro9900().add(registro9900);
        }
        
        cont = ecdcontabil.getContadoresBlocoC().getContRegistroC052();
        if (cont > 0) {
        	registro9900 = new Registro9900();
        	registro9900.setReg_blc("C052");
        	registro9900.setQtd_reg_blc(String.valueOf(cont));
            bloco9.getRegistro9900().add(registro9900);
        }
        
        cont = ecdcontabil.getContadoresBlocoC().getContRegistroC150();
        if (cont > 0) {
        	registro9900 = new Registro9900();
        	registro9900.setReg_blc("C150");
        	registro9900.setQtd_reg_blc(String.valueOf(cont));
            bloco9.getRegistro9900().add(registro9900);
        }
        cont = ecdcontabil.getContadoresBlocoC().getContRegistroC155();
        if (cont > 0) {
        	registro9900 = new Registro9900();
        	registro9900.setReg_blc("C155");
        	registro9900.setQtd_reg_blc(String.valueOf(cont));
            bloco9.getRegistro9900().add(registro9900);
        }
        cont = ecdcontabil.getContadoresBlocoC().getContRegistroC600();
        if (cont > 0) {
        	registro9900 = new Registro9900();
        	registro9900.setReg_blc("C600");
        	registro9900.setQtd_reg_blc(String.valueOf(cont));
            bloco9.getRegistro9900().add(registro9900);
        }
        cont = ecdcontabil.getContadoresBlocoC().getContRegistroC650();
        if (cont > 0) {
        	registro9900 = new Registro9900();
        	registro9900.setReg_blc("C650");
        	registro9900.setQtd_reg_blc(String.valueOf(cont));
            bloco9.getRegistro9900().add(registro9900);
        }

        // Qnt Registros RegistroC990
//        if (!Util.isEmpty(blocoC.getRegistroC990())) {
//            bloco9.getRegistro9900().add(New9900("C990", 1));
//        }
//
//        int somatorio = Integer.valueOf(bloco9.getRegistro9999().getQtd_lin())
//                + Integer.valueOf(blocoC.getRegistroC990().getQtd_lin_0());
//        bloco9.getRegistro9999().setQtd_lin(String.valueOf(somatorio));
//
//        ecdcontabil.setBloco9(bloco9);
//
//        return ecdcontabil;
//    }
//
//    private static Registro9900 New9900(String Reg_blc, int Qtd_reg_blc) {
//        Registro9900 vRet = new Registro9900();
//        vRet.setReg_blc(Reg_blc);
//        vRet.setQtd_reg_blc(String.valueOf(Qtd_reg_blc));
//        return vRet;
//    }
        
        cont = ecdcontabil.getContadoresBlocoC().getContRegistroC990();
        if (cont > 0) {
            registro9900 = new Registro9900();
            registro9900.setReg_blc("C990");
            registro9900.setQtd_reg_blc("1");
            bloco9.getRegistro9900().add(registro9900);
        }

        int somatorio = Integer.parseInt(bloco9.getRegistro9999().getQtd_lin()) + Integer.parseInt(blocoC.getRegistroC990().getQtd_lin_c());
        bloco9.getRegistro9999().setQtd_lin(String.valueOf(somatorio));

        ecdcontabil.setBloco9(bloco9);

        return ecdcontabil;
    }
}
