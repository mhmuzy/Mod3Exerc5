package Hitss.Treinamento.Apresentacao;

import java.util.Scanner;

public class Show {
	public static void main(String[] args) {
		try {
			
		
		System.out.println("");
		System.out.println("         Hitss Treinamento");
		System.out.println("");
		System.out.println("Segue a sequência:");
		System.out.println("");
		double litro, km, calc;
		
		km = 0.5;
		
		
		System.out.println("");
		
		
		for (litro = 0; litro < 10; litro++) {
			
		
		
		System.out.println("");
		
		calc = litro * km;
		
		System.out.println("A quanatidade de Km's Rodados é de: " + calc);

		}
		} catch (Exception e) {
			System.out.println("Erro de processamento: " + e.getMessage());
		}
	}
}
