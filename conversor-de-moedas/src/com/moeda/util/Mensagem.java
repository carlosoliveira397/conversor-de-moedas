package com.moeda.util;

import com.moeda.classe.Escolha;

public class Mensagem {
	
	public void menu() {
		System.out.println("-----------------------------------------");
		System.out.println("-------------CONVETER MOEDAS------------");
		System.out.println("-----------------------------------------");
		System.out.println("- (1) DOLAR           >> BRL            -");
		System.out.println("- (2) BRL             >> DOLAR          -");
		System.out.println("- (3) DOLAR           >> PESO ARGENTINO -");
		System.out.println("- (4) PESO ARGENTINO  >> DOLAR          -");
		System.out.println("- (5) DOLAR           >> PESO COLOMBIANO-");
		System.out.println("- (6) PESO COLOMBIANO >> DOLAR          -");
		System.out.println("- (7) Outras                            -");
		System.out.println("- (8) Hisorico de conversoes            -");
		System.out.println("- (9) SAIR                              -");
		System.out.println("-----------------------------------------");
	}
	
	public void valorPergunta(String de,String para) {
		System.out.println("-----------------------------------------");
		System.out.println("- Quanto para converter de "+ de +" para "+ para +" ?    -");
		System.out.println("-----------------------------------------");
	}
	
	public void resultado(Escolha escolha) {
		System.out.println("-----------------RESPOSTA----------------");
		System.out.println("-- "+escolha+" --");
		System.out.println("-----------------------------------------");
		System.out.println("");
	}
	
	public void historico(String historico) {
		System.out.println("-----------------------------------------");
		System.out.println("-- "+historico+" --");
		System.out.println("-----------------------------------------");
		System.out.println("");
	}
	
	public void fim() {
		System.out.println("-----------------------------------------");
		System.out.println("----------- Fim do programa! ------------");
		System.out.println("-----------------------------------------");
		System.out.println("");
	}
	
}
