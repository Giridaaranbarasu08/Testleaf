package week1.day1;

public class Calculator {

	public void sub()
	{
		int a= 3;
		int b= 2;
		System.out.println(a-b);
		
	}
	
	public int multiply(int a,int b) {
		return a*b;
		
	}
	
	public static void main(String[] args) {
		Calculator c1 = new Calculator();
		c1.sub();
		  int result = c1.multiply(20, 3);
		System.out.println(result);
	}
	
}

