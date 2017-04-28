package com.sda.main;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

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
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class SimpleXMLParser {

	private final String path = "src//com//sda//main//resources//";
	private ArrayList<String> list = new ArrayList<>();

	public void readXMLFile(String filename) throws ParserConfigurationException, SAXException, IOException {

		// Tworzymy obiekt reprezentujący nasz plik
		File f = new File(this.path + filename);

		// Fabryka obiektków to metoda projektowa która zwraca nam obiekt za
		// pomocą metody statycznej.
		// Otrzymujemy tylko jedną instancję w całej aplikacji.

		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		DocumentBuilder db = dbf.newDocumentBuilder();

		// Parsowanie tekstu np. ł ma więcej niż jeden bajt przy UFT - 8
		// Pobiera ileś bajtów i ucina, może np. uciąć literkę i zrobić z niej
		// inną.

		Document doc = db.parse(f);

		// Normalizacja w celu ucinania tekstu inteligentnie.

		doc.getDocumentElement().normalize();

		// Każdy element drzewa jest node, są też node tekstowe, atrubuty też są
		// node
		NodeList nList = doc.getElementsByTagName("staff");

		for (int i = 0; i < nList.getLength(); i++) {
			Node n = nList.item(i);
			if (n.getNodeType() == Node.ELEMENT_NODE) {
				// Downcasting
				Element elem = (Element) n;
				System.out.println(elem.getAttribute("id"));

				String staffName = elem.getElementsByTagName("firstname").item(0).getTextContent() + " "
						+ elem.getElementsByTagName("lastname").item(0).getTextContent();

				System.out.println(staffName);
				System.out.println("===============");
			}
		}
	}

	public void writeXMLFile(String filename) throws ParserConfigurationException, TransformerException {

		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		DocumentBuilder db = dbf.newDocumentBuilder();
		Document doc = db.newDocument();

		Element root = doc.createElement("root");

		Element child = doc.createElement("childred");
		child.setAttribute("id", "15");
		child.setTextContent("wartosc");

		Element child2 = doc.createElement("childred");
		child2.setAttribute("id", "16");
		child2.setTextContent("wartosc druga");

		root.appendChild(child);
		root.appendChild(child2);

		doc.appendChild(root);

		TransformerFactory tf = TransformerFactory.newInstance();
		Transformer t = tf.newTransformer();

		DOMSource source = new DOMSource(doc);
		StreamResult sr = new StreamResult(new File(this.path + filename));
		t.transform(source, sr);

	}

	public double getAvgSalary(String filename) throws ParserConfigurationException, SAXException, IOException {

		File f = new File(this.path + filename);
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		DocumentBuilder db = dbf.newDocumentBuilder();
		Document doc = db.parse(f);
		doc.getDocumentElement().normalize();
		double avg = 0;
		NodeList nList = doc.getElementsByTagName("staff");

		for (int i = 0; i < nList.getLength(); i++) {
			Node n = nList.item(i);
			if (n.getNodeType() == Node.ELEMENT_NODE) {
				Element e = (Element) n;

				avg += Double.parseDouble(e.getElementsByTagName("salary").item(0).getTextContent());
			}
		}
		avg /= nList.getLength();
		return avg;
	}

	public ArrayList<String> getNameList(String filename)
			throws ParserConfigurationException, SAXException, IOException {

		File f = new File(this.path + filename);
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		DocumentBuilder db = dbf.newDocumentBuilder();
		Document doc = db.parse(f);
		doc.getDocumentElement().normalize();
		NodeList nList = doc.getElementsByTagName("staff");

		for (int i = 0; i < nList.getLength(); i++) {
			Node n = nList.item(i);

			Element elem = (Element) n;

			String staffName = elem.getElementsByTagName("firstname").item(0).getTextContent() + " "
					+ elem.getElementsByTagName("lastname").item(0).getTextContent();

			list.add(staffName);

		}
		return list;
	}

	public void getMinMaxID(String filename) throws ParserConfigurationException, SAXException, IOException {

		File f = new File(this.path + filename);
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		DocumentBuilder db = dbf.newDocumentBuilder();
		Document doc = db.parse(f);
		doc.getDocumentElement().normalize();
		NodeList nList = doc.getElementsByTagName("staff");

		Integer min = null;
		Integer max = null;

		for (int i = 0; i < nList.getLength(); i++) {
			Node n = nList.item(i);
			if (n.getNodeType() == Node.ELEMENT_NODE) {
				Element elem = (Element) n;
				if (min == null) {
					min = Integer.parseInt(elem.getAttribute("id"));
				}
				if (max == null) {
					max = Integer.parseInt(elem.getAttribute("id"));
				}
				if (min > Integer.parseInt(elem.getAttribute("id"))) {
					min = Integer.parseInt(elem.getAttribute("id"));
				}
				if (Integer.parseInt(elem.getAttribute("id")) > min) {
					max = Integer.parseInt(elem.getAttribute("id"));
				}
			}
		}
		System.out.println("Minimum id: " + min);
		System.out.println("Maximum id: " + max);
	}

}
