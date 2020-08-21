package com.projetos.estoque;

public class ControleDeEstoque {

	public static void main(String[] args) {
		
		Produto produto = new Produto();
		produto.setProdCod("AD65449");
		produto.setProdNome("Peça");
		produto.setProdDisp(true);
		produto.setProdQtd(10);
		produto.setProdTam("30mx40mx20m");
		produto.setProdCom(10000.00);
		produto.setProdVen(20000.00);
		produto.setProdLocal("GDG/1/22");
		
	
		produto.verificarProdDisp();


	}


}
