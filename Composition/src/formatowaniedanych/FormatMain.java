package formatowaniedanych;

public class FormatMain {

	public static void main(String[] args) {
		print(new XmlFormatter());
		print(new JsonFormatter());
	}

	public static void print(DataFormatter dataFormatter) {

		Car car = new Car("BMW", 1);
		Person person = new Person("Jan", "Kowalski", 25);
		dataFormatter.format(car);
		dataFormatter.format(person);

	}
}
