package se.nackademin.examination.examination_jacoco;

import static org.junit.Assert.*;

import java.util.logging.Logger;

import org.junit.Test;
 

public class ConversorTest {
	private static final Logger LOG = Logger.getLogger(Conversor.class.getName());

 
	@Test
	public void testSetGetGenderConverterArrayValues() {
		Conversor c = new Conversor();
		c.setGenderConverterArrayValues();
		LOG.info("Testing the methods set- and getGenderConverterArrayValues");
		assertEquals(c.getGenderConverterArray().get(0), "man!");
		assertEquals(c.getGenderConverterArray().get(1), "woman!");
		assertEquals(c.getGenderConverterArray().get(2), "person!");
	}

	@Test
	public void testSetGetNameConverterArrayValues() {
		Conversor c = new Conversor();
		c.setNameConverterArrayValues();
		LOG.info("Testing the methods set- and getNameConverterArrayValues");
		assertEquals(c.getNameConverterArray().get(0), "Your first name is smaller than your last name");
		assertEquals(c.getNameConverterArray().get(1), "Your last name is smaller than your first name");
		assertEquals(c.getNameConverterArray().get(2), "The lengths of your first name is your last name are the same");
	}

	@Test
	public void testSetGetAgeConverterArrayValues() {
		Conversor c = new Conversor();
		c.setAgeConverterArrayValues();
		LOG.info("Testing the methods set- and getAgeConverterArrayValues");
		assertEquals(c.getAgeConverterArray().get(0),
				"You are young and talented! Things will come your way soon enough! ");
		assertEquals(c.getAgeConverterArray().get(1),
				"You are experienced and talented! Things will come your way soon enough!");
	}
	
	@Test
	public void testSetGetCityConverterArrayValues() {
		Conversor c = new Conversor();
		c.setCityConverterArrayValues();
		LOG.info("Testing the methods set- and getCityConverterArrayValues");
		assertEquals(c.getCityConverterArray().get(0), "A");
		assertEquals(c.getCityConverterArray().get(1), "B");
		assertEquals(c.getCityConverterArray().get(2), "C");
		assertEquals(c.getCityConverterArray().get(3), "D");
		assertEquals(c.getCityConverterArray().get(4), "E");
		assertEquals(c.getCityConverterArray().get(5), "F");
		assertEquals(c.getCityConverterArray().get(6), "G");
		assertEquals(c.getCityConverterArray().get(7), "H");
		assertEquals(c.getCityConverterArray().get(8), "I");
		assertEquals(c.getCityConverterArray().get(9), "J");
		assertEquals(c.getCityConverterArray().get(10), "X");
	}

}
