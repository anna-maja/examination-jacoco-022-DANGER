package se.nackademin.examination.examination_jacoco;
import java.util.ArrayList;


public class Main { 
	public static void main(String[] args){	
		/**
		 *
		 * All code hidden to make sure I can test only class methods without disturbance from Main.
		 *
		 */
		//new GUI022Danger();
			

		Game game = new Game();
		ArrayList<String> values = new ArrayList<String>();					
		values = game.collectInputData();		
		game.run(values);
		
	}
}
