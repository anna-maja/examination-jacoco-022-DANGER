package se.nackademin.examination.examination_jacoco;

import static org.junit.Assert.*;
import org.junit.Test;
import java.util.logging.Logger;

public class ResultsFromInputsTest {

	private static final Logger LOG = Logger.getLogger(ResultFromInputs.class.getName());

	/**
	 * Testmethod for get- and set- ResultForNameLength
	 */
	@Test
	public void testSetGetResultForNameLength() {

		ResultFromInputs resultsFromInputs = new ResultFromInputs();

		resultsFromInputs.setResultForNameLenght(10);
		assertEquals(resultsFromInputs.getResultForNameLenght(), 10);
		LOG.info("Testing set- and getResultForNameLength with local 10 and "
				+ resultsFromInputs.getResultForNameLenght());
	}

	/**
	 * Testmethod for get- and set- ResultForGender
	 */
	@Test
	public void testGenderGetAndSet() {

		ResultFromInputs resultsFromInputs = new ResultFromInputs();

		resultsFromInputs.setResultForGender(1);
		assertEquals(resultsFromInputs.getResultForGender(), 1);
		LOG.info("Testing set- and getResultForGender with local 1 and " + resultsFromInputs.getResultForGender());
	}

	/**
	 * Testmethod for get- and set- ResultForAge
	 */
	@Test
	public void testAgeSetAndGet() {

		ResultFromInputs resultFromInputs = new ResultFromInputs();

		resultFromInputs.setResultForAge(40);
		assertEquals(resultFromInputs.getResultForAge(), 40);
		LOG.info("Testing set- and getResultForAge with local 40 and " + resultFromInputs.getResultForAge());
	}

	/**
	 * Testmethod for get- and set- ResultForHomeCity
	 */
	@Test
	public void testHomecitySetAndGet() {

		ResultFromInputs resultFromInputs = new ResultFromInputs();

		resultFromInputs.setResultForHomeCity(4);
		assertEquals(resultFromInputs.getResultForHomeCity(), 4);
		LOG.info("Testing set- and getResultForHomeCity with local 4 and " + resultFromInputs.getResultForAge());
	}
}
