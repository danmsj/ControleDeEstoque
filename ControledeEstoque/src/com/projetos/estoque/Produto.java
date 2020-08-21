package com.projetos.estoque;

public class Produto {
	
	private String prodCod;
	private String prodNome;
	private int prodQtd;
	private boolean prodDisp;
	private double prodCom;
	private double prodVen;
	private String prodTam;
	private String prodLocal;

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


	public double getProdCom() {
		return prodCom;
	}




	public void setProdCom(double prodCom) {
		this.prodCom = prodCom;
	}




	public double getProdVen() {
		return prodVen;
	}




	public void setProdVen(double prodVen) {
		this.prodVen = prodVen;
	}




	public String getProdTam() {
		return prodTam;
	}




	public void setProdTam(String prodTam) {
		this.prodTam = prodTam;
	}




	public String getProdLocal() {
		return prodLocal;
	}




	public void setProdLocal(String prodLocal) {
		this.prodLocal = prodLocal;
	}




	public void verificarProdDisp() {
			if(isProdDisp() == true) {
			System.out.println("O produto "+getProdNome()+" "+getProdCod()+" está disponível e estocado em "+getProdLocal());
		}
	}
	
}
