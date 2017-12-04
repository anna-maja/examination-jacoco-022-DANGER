package se.nackademin.examination.examination_jacoco;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Logger;

import org.junit.Test;

public class GameTest {

	private static final Logger LOG = Logger.getLogger(ResultFromInputs.class.getName());

	Game g = new Game();
	Conversor c = new Conversor();
	ResultFromInputs r = new ResultFromInputs();

	@Test
	public void testCalculateOutputBasedOnNames() {

		// testcase 1: firstName < lastName
		String firstName = "Anna";
		int firstNameLength = 4;
		String lastName = "Karlsson";
		int lastNameLength = 8;

		assertEquals(g.calculateOutPutBasedOnNames(firstName, lastName) == 0, true);

		// testcase 2: firstName > lastName
		firstName = "Alexandra";
		firstNameLength = 9;
		lastName = "P";
		lastNameLength = 1;

		assertEquals(g.calculateOutPutBasedOnNames(firstName, lastName) == 1, true);

		// testcase 3: firstName > lastName
		firstName = "Anna";
		firstNameLength = 4;
		lastName = "Lova";
		lastNameLength = 4;

		assertEquals(g.calculateOutPutBasedOnNames(firstName, lastName) == 2, true);

	}

	@Test
	public void testCollectInputData() {

		ArrayList<String> localArray = new ArrayList<String>();
		Scanner scanner = new Scanner(System.in);
		String inputValue = "";

		// metoden add() kan testas
		// return resultArray kan testas

		localArray.add("0. OTHELLO");
		localArray.add("1. STINA");
		localArray.add("2. HUSSEIN");
		localArray.add("3. F");
		localArray.add("4. 30");
		localArray.add("5. STOCKHOLM");

		System.out.println(localArray.toString());
		System.out.println("0. OTHELLO, 1. STINA, 2. HUSSEIN, 3. F, 4. 30, 5. STOCKHOLM");
		assertEquals(g.collectInputData().contains(localArray), true);
		if (true) {
			System.out.println("Seems to be correct.");
		} else {
			System.out.println("Something fishy.");
		}
	}

	// full coverage
	@Test
	public void testSetGetGenderFromInputValues() {

		Game g = new Game();
		ResultFromInputs r = new ResultFromInputs();
		char localGenderChar = 'X';
		ArrayList<String> localArray = new ArrayList<String>();
		
		localArray.add(0, "A");
		localArray.add(1, "B");
		localArray.add(2, "C");
		localArray.add(3, "X");

		ArrayList<String> methodValues = g.collectInputData();
		char methodGender = g.getGenderFromInputValues(methodValues);
		assertEquals(methodGender == 'X', true);
		LOG.info("Testing to get gender X" + methodGender);
	}
	
	// 100% test coverage
	@Test
	public void testSetGetAgeFromInputValues() {

		Game g = new Game();
		ResultFromInputs r = new ResultFromInputs();
		int localAge = 0;
		ArrayList<String> localArray = new ArrayList<String>();
		
		localArray.add(0, "A");
		localArray.add(1, "B");
		localArray.add(2, "C");
		localArray.add(3, "X");
		localArray.add(4, "40");

		ArrayList<String> methodValues = g.collectInputData();
		int methodAge = g.getAgeFromInputValues(methodValues);
		assertEquals(methodAge == 40, true);
		LOG.info("Testing to get age 40: " + methodAge);
	}

	// testa att bygga en finalString med lokala värden och alla metoder.
	// testa println med förväntade värden och anropade värden
	// jämför println contains med lokalt värde.
	/*
	 * public void testBuildFinalString() { /*c.setNameConverterArrayValues();
	 * c.setAgeConverterArrayValues(); c.setGenderConverterArrayValues();
	 * c.setCityConverterArrayValues();
	 * 
	 * 
	 * int gender = 100; int age = 100; int name = 100; int homecity = 100;
	 * r.setResultForGender(5); r.setResultForAge(50); r.setResultForNameLenght(15);
	 * r.setResultForHomeCity(20);
	 * 
	 * System.out.println(firstName + " " + lastName + ", your are a great " +
	 * conversor.getGenderConverterArray().get(gender));
	 * System.out.println(conversor.getAgeConverterArray().get(age));
	 * System.out.println(conversor.getNameConverterArray().get(name)+
	 * " and combining that with the first letter of your homecity, i.e. "+conversor
	 * .getCityConverterArray().get(homecity) ); System.out.
	 * println("it seems that you are a dedicated student and will be a great Software Tester Engineer!"
	 * );
	 * 
	 * }
	 */
}
