public class SmartPhone extends MobilePhone {
	
	public SmartPhone(String brand) {
		super(brand);
	}
	
	public void browseWeb(String webPage) {
		System.out.println("Taking you to " + webPage + ".");
	}
	
	public void findPosition() {
		System.out.println("You are at position N40° 44.9064', W073° 59.0735.");
	}
	
	@Override
	public void call(String number) {
		storeDialledNumber(number);
		if (number.charAt(0) == '0' && number.charAt(1) == '0') {
			System.out.println("Calling <" + number + "> through the internet to save you money.");
		} else {
			super.call(number);
		}
	}
	
	public void testPhone(Phone phone) {
		phone.call("999");
		SmartPhone sPhone = (SmartPhone) phone;
		sPhone.browseWeb("bbc.co.uk");
		sPhone.findPosition();
	}
	
	public static void main(String[] args) {
		MobilePhone myPhone = new SmartPhone("HTC");
		((SmartPhone)myPhone).browseWeb("bbc.co.uk");
		((SmartPhone)myPhone).findPosition();
		((SmartPhone)myPhone).call("00441582467259");
		System.out.println("***");
		Phone phone = new MobilePhone("Nokia");
		((SmartPhone)myPhone).testPhone(phone);
	}
}