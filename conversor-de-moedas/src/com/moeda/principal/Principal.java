package com.moeda.principal;

import java.util.ArrayList;
import java.util.Scanner;

import com.moeda.classe.Escolha;
import com.moeda.util.Mensagem;

public class Principal {
	
	public void menu () {
		
		ArrayList<Escolha> historico = new ArrayList<>();
		
		Mensagem mensagem = new Mensagem();
		
		Scanner scanner = new Scanner(System.in);
		
		int a = 2;
		
		String moeda1 = "";
		String moeda2 = "";
		String valor = "";
		
		do {
			
			try{
				
				mensagem.menu();
				int opicao = Integer.parseInt(scanner.nextLine());
				
				switch(opicao){
				
				case 1:  
					
					mensagem.valorPergunta("Dolar","Reais");
					valor = scanner.nextLine();
					valor = valor.replace(",", ".");
					moeda1 = "USD";
					moeda2 = "BRL";
					break;
					
				case 2:
					
					mensagem.valorPergunta("Reais","Dolar");
					valor = scanner.nextLine();
					valor = valor.replace(",", ".");
					moeda1 = "BRL";
					moeda2 = "USD";
					break;
					
				case 3:
					
					mensagem.valorPergunta("Dolar","Peso Argentino");
					valor = scanner.nextLine();
					valor = valor.replace(",", ".");
					moeda1 = "USD";
					moeda2 = "ARS";
					break;
					
				case 4:
					
					mensagem.valorPergunta("Peso Argentino","Dolar");
					valor = scanner.nextLine();
					valor = valor.replace(",", ".");
					moeda1 = "ARS";
					moeda2 = "USD";
					break;
					
				case 5:
					
					mensagem.valorPergunta("Dolar","Peso Colombiano");
					valor = scanner.nextLine();
					valor = valor.replace(",", ".");
					moeda1 = "USD";
					moeda2 = "COP";
					break;
					
				case 6:
					
					mensagem.valorPergunta("Peso Colombiano","Dolar");
					valor = scanner.nextLine();
					valor = valor.replace(",", ".");
					moeda1 = "COP";
					moeda2 = "USD";
					break;
					
				case 7:
					System.out.println("Sigla da moeda ex:'RMB' ? ");
					moeda1 = scanner.nextLine();
					System.out.println("Sigla da moeda ex:'USD' ? ");
					moeda2 = scanner.nextLine();
					System.out.println("Valor para converter: ");
					valor = scanner.nextLine();
					valor = valor.replace(",", ".");
					
					break;
				case 8:
					
					for (Escolha list : historico) {
						mensagem.historico(list.toString());
					}
					break;
					
				case 9:
					
					a = 0;
					break;
						
				default:
        				System.out.println("Opcao invalida !");
        				break;
					
				}
				
				if (opicao != 9 && opicao != 8) {
					
					Escolha escolha = new Escolha(valor, moeda1, moeda2);
						
					escolha.setResultado(escolha.consumirAPI());
					
					historico.add(escolha);
					
					mensagem.resultado(escolha);
					
				}else if(opicao == 9){
					mensagem.fim();
				}
				
			}catch(Exception e) {
				System.out.println("Valor invalido...");
			}
				
		} while(a != 0);
		
	}

}
