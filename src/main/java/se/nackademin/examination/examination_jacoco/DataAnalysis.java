package se.nackademin.examination.examination_jacoco;

import java.util.ArrayList;
 
public class DataAnalysis {
	
	/*
	 * Testa result<String med lokala och metodvärden.
	 */
	public String buildFinalString(ArrayList<String> values){
		String	resultString = "#####################-- ANALYSIS OF THE INPUT DATA --#####################\n";	
		resultString += getResultStringNamesAndAge(values);
		resultString+="\n";
		resultString += getResulStringHomecityAndAge(values);
		
		return resultString;
	}	
	
	/* skapa lokala värden och metodvärden. Jämför String-return med contains.
	 testa fN <= lN, 
	 fN > lN, 
	 fN = lN.
	 */
	public String getResultStringNamesAndAge(ArrayList<String> values){
		Game game = new Game();
		if (values.get(1).length()<=values.get(2).length() && game.getAgeFromInputValues(values)<=30){
			return "The first name is smaller or equals in size to the last name and the participant is 30 or younger";
		} if (values.get(1).length()>values.get(2).length() && game.getAgeFromInputValues(values)>30){
			return "The first name is greater or equals in size to the last name and the participant older than 30";
		}
		
		return "No analysis was performed";
	}
	
	/* skapa lokala värden och metodvärden. Jämför String-return med contains.
	// (homeCity.length <5 && getAge >= 30)
	 * homeCity.length <5 && getAge <30
	 * homeCity.length >= 5 &&  getAge >= 30)
	 * homeCity.length >= 5 && getAge <30
	*/
	public String getResulStringHomecityAndAge(ArrayList<String> values){
		Game game = new Game();
		if (values.get(5).length()<5){
			if (game.getAgeFromInputValues(values)>=30){
				return "The name of the homecity is small and the participant is 30 or older";
			}else{
				return "The name of the homecity is small and the participant is younger than 30";
			}
		}else{
			
			if (game.getAgeFromInputValues(values)>=30){
				return "The name of the homecity is big and the participant is 30 or older";
			}else{
				return "The name of the homecity is big and the participant is younger than 30";
			}
			
		}
		
		
	}
	

}
