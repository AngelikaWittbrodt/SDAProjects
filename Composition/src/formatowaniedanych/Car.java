package formatowaniedanych;

public class Car {

	private String brand;
	private int age;
	
	public Car(String brand, int age) {
		super();
		this.brand = brand;
		this.age = age;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
