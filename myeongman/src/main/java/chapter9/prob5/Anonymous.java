package chapter9.prob5;

public class Anonymous {
	Vehicle field = new Vehicle() {

		@Override
		public void run() {
			System.out.println("자전거가 달립니다.");
		} 
	};
			
	void method1( ) {
		Vehicle local = new Vehicle() {
			@Override
			public void run() {
				System.out.println("승용차가 달립니다.");
			}
		};
		local.run();
	}
	
	void method2(Vehicle v) {
		v.run();
	}
}
