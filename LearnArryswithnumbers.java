package week1.day1;

import java.util.Arrays;

public class LearnArryswithnumbers {
	public static void main(String[] args) {
		
		int[] scores= {78,89,98,76,99,90,67,75,78,65};
		//to sort an arry
		//arrays.sort option
		Arrays.sort(scores);
//To find the size of an aary
		//scores.length - ctrl 2 L
		int length = scores.length;
	System.out.println(length);//10
	//to print minimum value of an array
	System.out.println("the minimum value is " + scores[0]);
	//to print maximum value of an array
		System.out.println("the maximum value is " + scores[scores.length-1]);	
	                                   //second largest value [scores.length-2]
		
		
		for (int i = 0; i < length; i++) {
		//for (int i = 0; i <= length-1; i++)
			System.out.println(scores[i]);// eg :scores[0]=78
		
		
		}
	
	}
	

}
