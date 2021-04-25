package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o numero M e N da matriz");
		int m = sc.nextInt();
		int n = sc.nextInt();
		
		int[][] matr = new int[m][n];
		
		for(int i =0; i<m; i++) {
			for(int j = 0; j<n; j++) {
				matr[i][j] = sc.nextInt();
			}
		}
		System.out.println("Informe o numero para pesquisar na matriz");
		int x = sc.nextInt(); 
		for(int i=0; i<matr.length; i++) {
			for (int j=0; j<matr[i].length; j++){
				
				if (x == matr[i][j]) {
					
					System.out.println("Position: " + i + ", " + j);
					
					if (j > 0) {
						System.out.println("Esquerda: " + matr[i][j -1]);
					}
					if (j < matr[i].length-1) {
						System.out.println("Direita: " + matr[i][j +1]);
					}
					
					if (i > 0) {
						System.out.println("Acima: " + matr[i-1][j]);
					}
					
					if (i < matr.length-1) {
						System.out.println("Abaixo: " + matr[i+1][j]);
					}
					
					System.out.println("------------------------------");
				}
			}
	
		}
		
		sc.close();
		

	}

}
