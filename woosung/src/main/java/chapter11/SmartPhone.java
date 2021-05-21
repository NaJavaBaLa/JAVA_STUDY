package chapter11;

public class SmartPhone {
// toString() method
	
	private String company;
	private String os;
	
	public SmartPhone(String company, String os) {
		this.company = company;
		this.os = os;
	}

	@Override
	public String toString() {
		return "company=" + company + ", os=" + os;
	}
	
	
	
}
