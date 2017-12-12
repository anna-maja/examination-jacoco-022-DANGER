package se.nackademin.examination.examination_jacoco;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

public class DataAnalysisTest { // 100% coverage of all class DataAnalysis :-)

	@Test
	public void testBuildFinalString() {
		DataAnalysis dataAnalysis = new DataAnalysis();
		ArrayList<String> values = new ArrayList<String>();
		values.addAll(Arrays.asList("Game", "Rafael", "Silva", "M", "30", "Fortaleza"));
		String result = dataAnalysis.buildFinalString(values);
		assertTrue("The result should contain 'The name of the homecity is big and the participant is 30 or older' ",
				result.contains("The name of the homecity is big and the participant is 30 or older"));

	}

	
	@Test
	public void testGetResultStringNamesAndAge() {

		DataAnalysis dataAnalysis = new DataAnalysis();
		String result = "";

		// branch 1: fN <= lN && age <=30
		ArrayList<String> values1 = new ArrayList<String>();
		values1.addAll(Arrays.asList("Game", "A", "AB", "M", "30", "Korpilombolo"));

		result = dataAnalysis.getResultStringNamesAndAge(values1);
		assertTrue(
				"The result should contain 'The first name is smaller or equals in size to the last name and the participant is 30 or younger' ",
				result.contains(
						"The first name is smaller or equals in size to the last name and the participant is 30 or younger"));

		// branch 2: fN > lN && age >30
		ArrayList<String> values2 = new ArrayList<String>();
		values2.addAll(Arrays.asList("Game", "AAA", "B", "M", "31", "Korpilombolo"));

		result = dataAnalysis.getResultStringNamesAndAge(values2);
		assertTrue(
				"The result should contain 'The first name is greater or equals in size to the last name and the participant older than 30' ",
				result.contains(
						"The first name is greater or equals in size to the last name and the participant older than 30"));

		// branch 3: cover else: fN = Ln
		ArrayList<String> values3 = new ArrayList<String>();
		values3.addAll(Arrays.asList("Game", "AAA", "BBB", "M", "31", "Korpilombolo"));

		result = dataAnalysis.getResultStringNamesAndAge(values3);
		assertTrue("The result should contain 'No analysis was performed' ",
				result.contains("No analysis was performed"));
	}

	@Test
	public void testGetResulStringHomecityAndAge() {

		DataAnalysis d = new DataAnalysis();
		Game g = new Game();
		String result = "";

		// branch 1: (homeCity.length <5) && (getAge >= 30)

		ArrayList<String> values1 = new ArrayList<String>();
		values1.addAll(Arrays.asList("Game", "A", "AB", "M", "30", "Åmål"));
		result = d.getResulStringHomecityAndAge(values1);
		assertTrue("The result should contain 'The name of the homecity is small and the participant is 30 or older' ",
				result.contains("The name of the homecity is small and the participant is 30 or older"));

		// branch 2: (homeCity.length) <5 && (getAge <30)

		ArrayList<String> values2 = new ArrayList<String>();
		values2.addAll(Arrays.asList("Game", "A", "AB", "M", "29", "Åmål"));
		result = d.getResulStringHomecityAndAge(values2);
		assertTrue(
				"The result should contain 'The name of the homecity is small and the participant is younger than 30'",
				result.contains("The name of the homecity is small and the participant is younger than 30"));

		// branch 3: (homeCity.length >= 5) && (getAge >= 30)

		ArrayList<String> values3 = new ArrayList<String>();
		values3.addAll(Arrays.asList("Game", "A", "AB", "M", "30", "Korpilombolo"));
		result = d.getResulStringHomecityAndAge(values3);

		assertTrue("The result should contain 'The name of the homecity is big and the participant is 30 or older'",
				result.contains("The name of the homecity is big and the participant is 30 or older"));

		// branch 4: (homeCity.length >= 5) && (getAge <30)

		ArrayList<String> values4 = new ArrayList<String>();
		values4.addAll(Arrays.asList("Game", "A", "AB", "M", "29", "Korpilombolo"));
		result = d.getResulStringHomecityAndAge(values4);

		assertTrue("The result should contain 'The name of the homecity is big and the participant is younger than 30'",
				result.contains("The name of the homecity is big and the participant is younger than 30"));
	}
}