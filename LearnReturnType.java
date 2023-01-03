package week1.day1;

public class LearnReturnType {
	
	public void addtwoNumbers() {
		int a=5;
		int b=10;
		System.out.println(a+b);

	}
	
	private int addthreeNumbers(int a,int b,int c) {
		return a+b+c;

	}

	public static void main(String[] args) {
		LearnReturnType lr = new LearnReturnType();
		lr.addtwoNumbers();
		// shortcut to assign local variable -> Ctrl+2-> L
		int result = lr.addthreeNumbers(20, 50, 99);
		System.out.println(result);
		
	}
}
