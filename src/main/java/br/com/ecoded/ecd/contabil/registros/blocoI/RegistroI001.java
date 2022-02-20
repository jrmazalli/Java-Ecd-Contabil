package br.com.ecoded.ecd.contabil.registros.blocoI;

public class RegistroI001 {

	private final String reg = "I001";
	private String ind_dad;

	/**
	 * @return the reg
	 */
	public String getReg() {
		return reg;
	}

	/**
	 * @return the ind_dad
	 */
	public String getInd_dad() {
		return ind_dad;
	}

	/**
	 * @param ind_dad
	 *            the ind_dad to set
	 */
	public void setInd_mov(String ind_dad) {
		this.ind_dad = ind_dad;
	}
}
