package testFile;

public class Main {

	public static void main(String[] args) {
		Car car1 = new Car("blue", 2000000); // Car 생성자로 객체 생성 
		
		System.out.println(car1); // Car.toString에 저장된 값 출력 
		
		UsedCar car2 = new UsedCar("red", 1000000, 2004); // UsedCar 생성자로 객체 생성 
		
		System.out.println(car2); // UsedCar.toString에 저장된 값 출력 
	}

}
