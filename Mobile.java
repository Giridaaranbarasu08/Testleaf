package week1.day1;

public class Mobile {

	private void sendSms() {
		System.out.println("Hello");

	}
	
	private void takeSnapShot() {
		System.out.println("Take screenshot");
		
	

	}
	public static void main(String[] args) {
		Mobile obj = new Mobile();
		obj.sendSms();
		obj.takeSnapShot();
	}
}

