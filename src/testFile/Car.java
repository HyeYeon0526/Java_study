package testFile;

public class Car {
	private String color;
	private int price;
	
	public Car(String s, int p) { // 색상과 가격을 초기화하는 생성자 
		color = s;
		price = p;
	}
	
	public String getColor() { // color을 반환하는 getter 
		return color;
	}
	public int getPrice() { // price를 반환하는 getter 
		return price;
	}
	
	public String toString() { // 입력한 값을 출력하는 toString 메소드 
		return "색상 " + color + ", 가격 " + price;
	}
	
}
