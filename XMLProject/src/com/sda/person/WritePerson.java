package com.sda.person;

import java.io.File;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class WritePerson {

	private final String path = "src//com/sda//main//resources//";
	
	public void writePerson(String filename, List<Person> p) throws ParserConfigurationException, TransformerException {
		
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		DocumentBuilder db = dbf.newDocumentBuilder();
		Document doc = db.newDocument();
		
		Element root = doc.createElement("root");
		
		for(Person myPers : p) {
		Element currentPerson = doc.createElement("person");
		Element name = doc.createElement("name");
		Element lastname = doc.createElement("lastname");
		Element company = doc.createElement("company");
		Element salary = doc.createElement("salary");
		Element department = doc.createElement("department");
		Element yearOfBorn = doc.createElement("yearOfBorn");
		
		name.setTextContent(myPers.getName());
		lastname.setTextContent(myPers.getLastname());
		company.setTextContent(myPers.getCompany());
		salary.setTextContent(myPers.getSalary()+"");
		department.setTextContent(myPers.getDepartment());
		yearOfBorn.setTextContent(myPers.getYearOfBorn()+"");
		
		currentPerson.appendChild(name);
		currentPerson.appendChild(lastname);
		currentPerson.appendChild(company);
		currentPerson.appendChild(salary);
		currentPerson.appendChild(department);
		currentPerson.appendChild(yearOfBorn);
		
		root.appendChild(currentPerson);
		}
		
		doc.appendChild(root);

		TransformerFactory tf = TransformerFactory.newInstance();
		Transformer t = tf.newTransformer();

		DOMSource source = new DOMSource(doc);
		StreamResult sr = new StreamResult(new File(this.path + filename));
		t.transform(source, sr);
		
	}
}
