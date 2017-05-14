package formatowaniedanych;

public class XmlFormatter implements DataFormatter {
	@Override
	public void format(Person p) {
		System.out.println("<person>\n" + "\t<name>" + p.getName() + "<name/>\n" + "\t<surname>" + p.getSurname()
				+ "<surname/>\n" + "\t<age>" + p.getAge() + "<age/>\n" + "<person/>\n");
		;
	}

	@Override
	public void format(Car car) {
		System.out.println("<car>\n" + "\t<brand>" + car.getBrand() + "<brand/>\n" + "\t<age>" + car.getAge()
				+ "<age/>\n" + "<car/>");
	}

}
