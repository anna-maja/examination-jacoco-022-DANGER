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
	
	public void testCalculateOutputBasedOnGender () {
		char male = 'M';
		int m = 0; 
		char female = 'F';
		int f = 1; 
		char other = 'O';
		int o = 2; 
		
		assertEquals(g.calculateOutPutBasedOnGender(male) == m, true);
		LOG.info("Testing calculateOutPutBasedOnGender with M " + male + ": " +m);
		assertEquals(g.calculateOutPutBasedOnGender(female) == f, true);
		LOG.info("Testing calculateOutPutBasedOnGender with F  " + female + ": " +f);
		assertEquals(g.calculateOutPutBasedOnGender(other) == o, true);
		LOG.info("Testing calculateOutPutBasedOnGender with O " + other + ": " + o);

	}

	@Test
	public void testCalculateOutputBasedOnAge() {
		
		assertEquals(g.calculateOutPutBasedOnAge(24) == 0, true);
		LOG.info("Testing calculateOutPutBasedOnAge with 24 ");
		assertEquals(g.calculateOutPutBasedOnAge(25) == 0, true);
		LOG.info("Testing calculateOutPutBasedOnAge with 25 ");
		assertEquals(g.calculateOutPutBasedOnAge(30) == 1, true);
		LOG.info("Testing calculateOutPutBasedOnAge with 30 ");
	}
	
	@Test
	public void testCalculateOutputBasedOnHomeCity() {

		assertEquals(g.calculateOutPutBasedOnHomeCity("a") == 0, true);
		assertEquals(g.calculateOutPutBasedOnHomeCity("A") == 0, true);
		LOG.info("Testing calculateOutPutBasedOnAge with a and A ");
		assertEquals(g.calculateOutPutBasedOnHomeCity("b") == 1, true);
		assertEquals(g.calculateOutPutBasedOnHomeCity("B") == 1, true);
		LOG.info("Testing calculateOutPutBasedOnAge with b and B ");
		assertEquals(g.calculateOutPutBasedOnHomeCity("c") == 2, true);
		assertEquals(g.calculateOutPutBasedOnHomeCity("C") == 2, true);
		LOG.info("Testing calculateOutPutBasedOnAge with c and C");	
		assertEquals(g.calculateOutPutBasedOnHomeCity("d") == 3, true);
		assertEquals(g.calculateOutPutBasedOnHomeCity("D") == 3, true);
		LOG.info("Testing calculateOutPutBasedOnAge with d and D");
		assertEquals(g.calculateOutPutBasedOnHomeCity("e") == 4, true);
		assertEquals(g.calculateOutPutBasedOnHomeCity("E") == 4, true);
		LOG.info("Testing calculateOutPutBasedOnAge with e and E");
		assertEquals(g.calculateOutPutBasedOnHomeCity("f") == 5, true);
		assertEquals(g.calculateOutPutBasedOnHomeCity("F") == 5, true);
		LOG.info("Testing calculateOutPutBasedOnAge with f and F");   
		assertEquals(g.calculateOutPutBasedOnHomeCity("g") == 6, true);
		assertEquals(g.calculateOutPutBasedOnHomeCity("G") == 6, true);
		LOG.info("Testing calculateOutPutBasedOnAge with g and G");
		assertEquals(g.calculateOutPutBasedOnHomeCity("h") == 7, true);
		assertEquals(g.calculateOutPutBasedOnHomeCity("H") == 7, true);
		LOG.info("Testing calculateOutPutBasedOnAge with h and H");
		assertEquals(g.calculateOutPutBasedOnHomeCity("i") == 8, true);
		assertEquals(g.calculateOutPutBasedOnHomeCity("I") == 8, true);
		LOG.info("Testing calculateOutPutBasedOnAge with i and I"); 
		assertEquals(g.calculateOutPutBasedOnHomeCity("j") == 9, true);
		assertEquals(g.calculateOutPutBasedOnHomeCity("J") == 9, true);
		LOG.info("Testing calculateOutPutBasedOnAge with j and J");
		assertEquals(g.calculateOutPutBasedOnHomeCity("x") == 10, true);
		assertEquals(g.calculateOutPutBasedOnHomeCity("X") == 10, true);
		LOG.info("Testing calculateOutPutBasedOnAge with x and X");
		
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
