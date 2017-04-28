package com.sda.student;

import java.io.File;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class WriteStudent {

	private final String path = "src//com//sda//main//resources//";

	public void writeStudents(String filename, List<Student> s)
			throws ParserConfigurationException, TransformerException {

		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		DocumentBuilder db = dbf.newDocumentBuilder();
		Document doc = db.newDocument();

		Element root = doc.createElement("root");
		Element students = doc.createElement("students");

		for (Student myStud : s) {
			Element currentStudent = doc.createElement("student");
			Element name = doc.createElement("name");
			Element lastname = doc.createElement("lastname");
			Element year = doc.createElement("year");

			name.setTextContent(myStud.getName());
			lastname.setTextContent(myStud.getLastname());
			year.setTextContent(myStud.getYear() + "");

			currentStudent.appendChild(name);
			currentStudent.appendChild(lastname);
			currentStudent.appendChild(year);

			students.appendChild(currentStudent);
		}
		root.appendChild(students);

		doc.appendChild(root);

		TransformerFactory tf = TransformerFactory.newInstance();
		Transformer t = tf.newTransformer();

		DOMSource source = new DOMSource(doc);
		StreamResult sr = new StreamResult(new File(this.path + filename));
		t.transform(source, sr);
	}
}
