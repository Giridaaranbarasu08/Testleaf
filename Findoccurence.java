package week1.day1;

import java.util.Arrays;

public class Findoccurence {

	public static void main(String[] args) {

		int[] scores= {78,89,98,76,99,90,67,75,78,65};
	int num=78;
	int count=0;
	
//output=2
	Arrays.sort(scores);
	for (int i = 0; i < scores.length; i++) {
		if (scores[i]==num) {//scores[i]==78
			count++;//0+1, 0+2
		}
	}
	System.out.println(count);
		
	}

}
