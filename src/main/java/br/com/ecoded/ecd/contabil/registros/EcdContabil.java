package br.com.ecoded.ecd.contabil.registros;

import br.com.ecoded.ecd.contabil.registros.bloco0.Bloco0;
import br.com.ecoded.ecd.contabil.registros.bloco9.Bloco9;
import br.com.ecoded.ecd.contabil.registros.blocoC.BlocoC;
import br.com.ecoded.ecd.contabil.registros.blocoI.BlocoI;
import br.com.ecoded.ecd.contabil.registros.blocoJ.BlocoJ;
import br.com.ecoded.ecd.contabil.registros.blocoK.BlocoK;
import br.com.ecoded.ecd.contabil.registros.contadores.ContadoresBloco0;
import br.com.ecoded.ecd.contabil.registros.contadores.ContadoresBlocoC;
import br.com.ecoded.ecd.contabil.registros.contadores.ContadoresBlocoI;
import br.com.ecoded.ecd.contabil.registros.contadores.ContadoresBlocoJ;
import br.com.ecoded.ecd.contabil.registros.contadores.ContadoresBlocoK;

public class EcdContabil {

	private Bloco0 bloco0;
	private BlocoC blocoC;
	private BlocoJ blocoJ;
	private BlocoI blocoI;
	private BlocoK blocoK;
	private Bloco9 bloco9;

	private ContadoresBloco0 contadoresBloco0;
	private ContadoresBlocoC contadoresBlocoC;
	private ContadoresBlocoI contadoresBlocoI;
	private ContadoresBlocoJ contadoresBlocoJ;
	private ContadoresBlocoK contadoresBlocoK;

	public EcdContabil() {
		this.contadoresBloco0 = new ContadoresBloco0();
		this.contadoresBlocoC = new ContadoresBlocoC();
		this.contadoresBlocoI = new ContadoresBlocoI();
		this.contadoresBlocoJ = new ContadoresBlocoJ();
		this.contadoresBlocoK = new ContadoresBlocoK();
	}

	public Bloco0 getBloco0() {
		return bloco0;
	}

	public void setBloco0(Bloco0 bloco0) {
		this.bloco0 = bloco0;
	}

	public BlocoC getBlocoC() {
		return blocoC;
	}

	public void setBlocoC(BlocoC blocoC) {
		this.blocoC = blocoC;
	}

	public BlocoJ getBlocoJ() {
		return blocoJ;
	}

	public void setBlocoJ(BlocoJ blocoJ) {
		this.blocoJ = blocoJ;
	}

	public BlocoI getBlocoI() {
		return blocoI;
	}

	public void setBlocoI(BlocoI blocoI) {
		this.blocoI = blocoI;
	}

	public BlocoK getBlocoK() {
		return blocoK;
	}

	public void setBlocoK(BlocoK blocoK) {
		this.blocoK = blocoK;
	}

	public Bloco9 getBloco9() {
		return bloco9;
	}

	public void setBloco9(Bloco9 bloco9) {
		this.bloco9 = bloco9;
	}

	public ContadoresBloco0 getContadoresBloco0() {
		return contadoresBloco0;
	}

	public void setContadoresBloco0(ContadoresBloco0 contadoresBloco0) {
		this.contadoresBloco0 = contadoresBloco0;
	}

	public ContadoresBlocoC getContadoresBlocoC() {
		return contadoresBlocoC;
	}

	public void setContadoresBlocoC(ContadoresBlocoC contadoresBlocoC) {
		this.contadoresBlocoC = contadoresBlocoC;
	}

	public ContadoresBlocoI getContadoresBlocoI() {
		return contadoresBlocoI;
	}

	public void setContadoresBlocoI(ContadoresBlocoI contadoresBlocoI) {
		this.contadoresBlocoI = contadoresBlocoI;
	}

	public ContadoresBlocoJ getContadoresBlocoJ() {
		return contadoresBlocoJ;
	}

	public void setContadoresBlocoJ(ContadoresBlocoJ contadoresBlocoJ) {
		this.contadoresBlocoJ = contadoresBlocoJ;
	}

	public ContadoresBlocoK getContadoresBlocoK() {
		return contadoresBlocoK;
	}

	public void setContadoresBlocoK(ContadoresBlocoK contadoresBlocoK) {
		this.contadoresBlocoK = contadoresBlocoK;
	}

}
