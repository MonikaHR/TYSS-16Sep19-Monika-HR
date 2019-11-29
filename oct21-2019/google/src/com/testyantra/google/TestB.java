package com.testyantra.google;


public class TestB {
	public static void main(String[] args) {
		Browser b = new Browser();

		Google g = new Gmail();
		b.open(g);

		Google g1 = new GoogleDrive();
		b.open(g1);

	}
}

