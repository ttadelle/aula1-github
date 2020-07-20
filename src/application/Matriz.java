package application;

import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int n2 = sc.nextInt();
		
		int mat[][] = new int[n][n2];
		
		for(int i = 0; i < n; i++) {
			for (int j = 0; j < n2; j++)
				mat[i][j] = sc.nextInt();
		}
		
		int x = sc.nextInt();
		

		for(int i = 0; i < n; i++) {
			for (int j = 0; j < n2; j++)
				if (mat[i][j] ==  x) {
			    	System.out.println("Position: "+i+", "+j);
			    	if (j < 0) {
			    	}
			    	else {
			    	System.out.println("Left: "+mat[i][j-1]);
			    	}
			    	if ((j+ 1) > (n2 -1)) {
			    	}
			    	else {
			    		System.out.println("Right: "+mat[i][j+1]);
			    	}
			    	if ((i-1) < 0) {
			    	}
			    	else {
			    		System.out.println("Up: "+mat[i-1][j]);
			    	}
			    	if ((i+1)> (n+1)) {
			    	}
			    	else {
			    		System.out.println("Down: "+mat[i+1][j]);
			    	}				
				}
			}		
		
		sc.close();
	}
}
