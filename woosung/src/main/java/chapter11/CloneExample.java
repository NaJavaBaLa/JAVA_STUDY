package chapter11;

public class CloneExample {

	public static void main(String[] args) {
		
		// 원본 객체 생성 
		Clone original = new Clone("blue", "12345");
		
		
		// 복제 객체를 얻은 후에 비밀번호 값 변경 
		
		Clone cloned = original.getClone();
		cloned.password="asdfasdf";
		
		
		// 클론값 출력 
		System.out.println("cloned:");
		System.out.println(cloned.id);
		System.out.println(cloned.password);
		
		System.out.println();
		// 원본값 출력 
		System.out.println("original:");
		System.out.println(original.id);
		System.out.println(original.password);
		
		
		//결론적으로 원본의 값이 변하지 않았다는 것을 확인할 수 있음.. 
		
		
		
	}
}
