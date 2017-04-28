package com.sda.main;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import com.sda.student.Student;
import com.sda.student.WriteStudent;
import com.sda.company.WriteCompany;
import com.sda.person.Person;
import com.sda.person.WritePerson;
import com.sda.company.Company;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;

import org.xml.sax.SAXException;

public class Main {

	public static void main(String[] args)
			throws ParserConfigurationException, SAXException, IOException, TransformerException {
		SimpleXMLParser sxp = new SimpleXMLParser();

		sxp.readXMLFile("staff.xml");
		sxp.writeXMLFile("staff2.xml");

		System.out.println(sxp.getAvgSalary("staff.xml"));
		System.out.println(sxp.getNameList("staff.xml"));
		sxp.getMinMaxID("staff.xml");

		WriteStudent xwr = new WriteStudent();

		List<Student> students = new LinkedList<>();
		students.add(new Student("John", "Simple", 3));
		students.add(new Student("Jane", "Doe", 1));

		xwr.writeStudents("students.xml", students);

		WriteCompany wcp = new WriteCompany();

		List<Company> company = new LinkedList<>();
		company.add(new Company(2008, 345, 23, "name= Testowa"));
		company.add(new Company(1979, 34345, 40, "name= Testowa 2"));
		company.add(new Company(1999, 5, 8, "name= Testowa 3"));

		wcp.writeCompany("companies.xml", company);

		WritePerson pr = new WritePerson();

		List<Person> person = new LinkedList<>();
		person.add(new Person("Tomasz", "Nowak", "Apple", 5000, "Rachunkowość", 1990));
		person.add(new Person("Anna", "Kowalska", "SECESPOL", 3500, "Konstrukcyjny", 1988));
		person.add(new Person("Jan", "Kwiatek", "<IT>", 6000, "IT", 1950));
		person.add(new Person("Grażyna", "Torbalska", "Esyifloresy", 4000, "Projektowy", 1970));
		person.add(new Person("Marian", "Tracz", "Traczpol", 10000, "Zarząd", 1940));

		pr.writePerson("person.xml", person);

	}
}
