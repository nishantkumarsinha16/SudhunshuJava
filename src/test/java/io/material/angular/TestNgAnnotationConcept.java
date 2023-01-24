package io.material.angular;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgAnnotationConcept {

	@Test
	public void run() {
		
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("beforeTest");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("beforeClass");
	}

	@BeforeGroups
	public void beforeGroup() {
		System.out.println("beforeGroup");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("beforeMethod");
	}

	@BeforeSuite
	public void beforeSuit() {
		System.out.println("beforeSuit");
	}

}
