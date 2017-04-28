package com.sda.company;

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

public class WriteCompany {

	private final String path = "src//com//sda//main//resources//";

	public void writeCompany(String filename, List<Company> c) throws ParserConfigurationException, TransformerException {

		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		DocumentBuilder db = dbf.newDocumentBuilder();
		Document doc = db.newDocument();

		Element root = doc.createElement("root");

		for (Company myComp : c) {
			Element currentCompany = doc.createElement("company");
			Element starts = doc.createElement("starts");
			Element employees = doc.createElement("employees");
			Element vat = doc.createElement("vat");

			currentCompany.setTextContent(myComp.getTest());
			starts.setTextContent(myComp.getStarts() + "");
			employees.setTextContent(myComp.getEmployees() + "");
			vat.setTextContent(myComp.getVat() + "");

			currentCompany.appendChild(starts);
			currentCompany.appendChild(employees);
			currentCompany.appendChild(vat);

			root.appendChild(currentCompany);
		}

		doc.appendChild(root);

		TransformerFactory tf = TransformerFactory.newInstance();
		Transformer t = tf.newTransformer();

		DOMSource source = new DOMSource(doc);
		StreamResult sr = new StreamResult(new File(this.path + filename));
		t.transform(source, sr);
	}
}
