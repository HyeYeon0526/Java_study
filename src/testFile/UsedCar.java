package testFile;


public class UsedCar extends Car {
	private int year;
	
	public UsedCar(String s, int p, int y) { // UsedCar 생성자 
		super(s, p);
		year = y;
	}

	public int getYear() { // year을 반환하는 getter 
		return year;
	}	
	
	public String toString() { // Car의 toString을 받아서 값을 추가한 후 출력하는 toString 메소드 
		return super.toString()+ ", 생산년도 " + year;
	}
	
}
