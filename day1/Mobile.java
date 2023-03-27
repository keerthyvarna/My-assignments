package week1.day1;

public class Mobile {
	public void sendSms()
	{
		String mobileModel="Redmi 8";
		float mobileWeight=200.0f;
		System.out.println("mobile model: "+mobileModel);
		System.out.println("weight: "+mobileWeight+" grams");
	}
	public void makeCall()
	{
		boolean fullyCharged=true;
		int mobileCost=9000;
		System.out.println("it is fully charged: "+fullyCharged);
		System.out.println("cost=Rs."+mobileCost);
	}

	public static void main(String[] args) {
		System.out.println("This is my mobile");
		Mobile redmi= new Mobile();
		redmi.sendSms();
		redmi.makeCall();

	}

}
