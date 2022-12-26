package week1.day2;

import java.util.Arrays;

public class Reportcard { 
	public static void main(String[] args) {
		int scores [] = {76,98,56,89,41,78,55,44,35,66,22};
		int length = scores.length;
		Arrays.sort(scores);
		System.out.println("TOTAL strength in the classroom is "+ length);
		System.out.println("FIRST Rank score is "+ scores[length-1]);
		System.out.println("Last rank score is  "+ scores[0]);
		for (int i = 0; i < scores.length; i++) {
			System.out.println(scores[i]);
			
		}
		
	
		
		
		
		
		
	}

}
