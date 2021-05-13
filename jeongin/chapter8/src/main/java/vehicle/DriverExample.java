package vehicle;

public class DriverExample {

	public static void main(String[] args) {
		Driver driver = new Driver();
		
		Bus bus=new Bus();
		Taxi taxi = new Taxi();
		
		Vehicle vehicle = new Bus();// vehicle을 Bus로 선
		
		//vehicle.checkFare();  //vihicle interface에는 checkFare함수가 없다.
		
		driver.drive(bus); // drive 메소드의 매개변수는Vehicle이지만Bus 와 Taxi가 Vehicle interface를 상속받
		driver.drive(taxi);// 았으므로 매개변수로 활용 가능
		
		Bus bus2=(Bus)vehicle; // 강제타입 변
		bus2.run();
		bus2.checkFare(); //bus클래스의 checkFare() 사용가
		
	}

}
