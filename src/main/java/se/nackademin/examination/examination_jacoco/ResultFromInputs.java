package se.nackademin.examination.examination_jacoco;

public class ResultFromInputs {

	private int resultForNameLenght = 0;
	private int resultForGender = ' ';
	private int resultForAge = 0;
	private int resultForHomeCity = 0;

	// 100% testcoverage for get-set ResultForNameLength
	public int getResultForNameLenght() { // coverage.
		return resultForNameLenght;
	}

	public void setResultForNameLenght(int resultForNameLenght) { // coverage.
		this.resultForNameLenght = resultForNameLenght;
	}

	// 100% test coverage for get-setResultForGender.
	public int getResultForGender() {
		return resultForGender;
	}

	public void setResultForGender(int resultForGender) {
		this.resultForGender = resultForGender;
	}

	// 100% test coverage for get-setResultForAge
	public int getResultForAge() {
		return resultForAge;
	}

	public void setResultForAge(int resultForAge) {
		this.resultForAge = resultForAge;
	}

	// 100% test coverage for get-setResultForHomeCity
	public int getResultForHomeCity() {
		return resultForHomeCity;
	}

	public void setResultForHomeCity(int resultForHomeCity) {
		this.resultForHomeCity = resultForHomeCity;
	}

}
