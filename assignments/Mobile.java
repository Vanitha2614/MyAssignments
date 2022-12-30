package week1.day1.assignments;

public class Mobile {

	public void makeCall() {
	String mobileModel="Samsung Galaxy";
	float mobileWeight=140f;
	System.out.println(mobileModel);
	System.out.println(mobileWeight);
	System.out.println("Calling");
	}
	
	public void sendMsg() {
	boolean isFullCharged=false;
	int mobileCost=20000;
	System.out.println(isFullCharged);
	System.out.println(mobileCost);
	System.out.println("Happy day");
	}
	
	public static void main(String[] args) {
		Mobile obj = new Mobile();
		obj.makeCall();
		obj.sendMsg();
		System.out.println("This is my mobile");
	}
}
