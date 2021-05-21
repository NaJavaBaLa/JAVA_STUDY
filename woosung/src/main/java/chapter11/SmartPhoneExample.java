package chapter11;

public class SmartPhoneExample {
// toString() method
	public static void main(String[] args) {
		
		SmartPhone myPhone = new SmartPhone("구글", "안드로이드");
		String strobj = myPhone.toString();

		System.out.println(strobj);
		
		System.out.println(myPhone);
		
	}

}
