package com.dradest.sample.main;

import com.dradest.sample.generatejavadocs.SampleClass;

/**
 * Sample class used to demonstrate how to generate javadocs
 * @author drad
 * @version 1.0
 * @since 2019-02-22
 */

public class Main {

	public static void main(String[] args) {
		/* create new SampleClass object */
		SampleClass sc = new SampleClass();
		
		// Set x and str of sc object
		sc.setX(187);
		sc.setStr("He Wrote");
		
		// Retrieve x and str fields from sc object
		System.out.println(sc.getX() + " " + sc.getStr());

	}

}
