package com.projetos.estoque;

public class Produto {
	
	private String prodCod;
	private String prodNome;
	private int prodQtd;
	private boolean prodDisp;
	private float prodCom;
	private float prodVen;
	private String prodTam;

	public Produto() {
			}

	public String getProdCod() {
		return prodCod;
	}

	public void setProdCod(String prodCod) {
		this.prodCod = prodCod;
	}

	public String getProdNome() {
		return prodNome;
	}

	public void setProdNome(String prodNome) {
		this.prodNome = prodNome;
	}

	public int getProdQtd() {
		return prodQtd;
	}

	public void setProdQtd(int prodQtd) {
		this.prodQtd = prodQtd;
	}

	public boolean isProdDisp() {
		return prodDisp;
	}

	public void setProdDisp(boolean prodDisp) {
		this.prodDisp = prodDisp;
	}

	public float getProdCom() {
		return prodCom;
	}

	public void setProdCom(float prodCom) {
		this.prodCom = prodCom;
	}

	public float getProdVen() {
		return prodVen;
	}

	public void setProdVen(float prodVen) {
		this.prodVen = prodVen;
	}

	public String getProdTam() {
		return prodTam;
	}

	public void setProdTam(String prodTam) {
		this.prodTam = prodTam;
	}
	
}
