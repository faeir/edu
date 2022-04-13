package co.edu.array;

import java.util.Scanner;

public class ArrayExample5 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int[] scores = new int[5];
		
		for (int i=0; i < scores.length; i++) {
			System.out.println("입력>");
			scores[i] = scn.nextInt();			
		}
			int max = scores[0];
			int min = scores[0];
				
		for (int i = 0; i < scores.length; i++) {
			if (max < scores[i]) { 
				max = scores[i];
			} 
			if (scores[i] < min) {
				min = scores[i];
			}
		}
		System.out.println("최고점 " + max);
		System.out.println("최소점 " + min);
		}
	}

//