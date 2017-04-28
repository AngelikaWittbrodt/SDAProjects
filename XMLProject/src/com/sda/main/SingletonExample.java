package com.sda.main;

public class SingletonExample {
	
	public static void main(String[] args) {
		
		SingletonExample se = SingletonExample.getInstance();
		SingletonExample se1 = SingletonExample.getInstance();

		se.getTest("Tekst");
		se1.getTest("Test");
	}

	private static SingletonExample instance;

	// Żeby uniknąć automatycznego tworzenia domyślnego, publicznego,bezargumentowego konstruktora
	private SingletonExample() {
	}

	public static SingletonExample getInstance() {
		// lazy initialization
		if (instance == null) {
			System.out.println("Tworzę instancję.");
			instance = new SingletonExample();
		}
		System.out.println("Zwracam instancję");
		return instance;
	}

	public void getTest(String txt) {
		System.out.println(txt);
	}
}
