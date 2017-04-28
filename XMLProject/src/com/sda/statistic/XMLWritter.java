package com.sda.statistic;

public class XMLWritter {
	
	public void printFilenames(String file, int from, int to) {
		//będzie jeszcze jeden for okalający
		for(int i=from; i<= to; i++) {
			String filename = file +"_"+i+".xml";
			System.out.println(filename);
		}
	}
}
