package week1.day1;

public class Palindrome {
	public static void main(String[] args) {
		int num = 12121;
		int rev = 0;
		int temp1 = 0;
		num=num/10;

{
	int temp = num%10;
	temp1=(temp1*10)+temp;
}

if(temp1==rev)
{
	System.out.println("Palindrome");
}

else
{
	System.out.println("not a Palindrome");
}

}
}