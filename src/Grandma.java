
public class Grandma {
	
	public boolean canGrandmaHearYou(String phrase) {
		// String goodbye = "GOODBYE";
		boolean canSheHearYou = false; // initially grandma can't hear you
		if (phrase == phrase.toUpperCase() ) {
			canSheHearYou = true;
			return canSheHearYou; // true -> grandma can hear you
		}
		return canSheHearYou; // false -> grandma can't hear you
	}
	
	public void grandmaResponds(boolean canSheHearYou) {
		String response [] = {"HUH, SPEAK UP BILLY!", "NO, NOT SINCE THE WAR"};
		// logic to determine response
		if (canSheHearYou == true) {
			// print response[1];
			System.out.println(response[1]); // grandma hear you -> she SHOUTS "NO, NOT SINCE THE WAR"
		} else if ( canSheHearYou == false) { 
			// print response[0];
			System.out.println(response[0]); // grandma can't hear you -> she SHOUTS "HUH? SPEAK UP BILLY!"
		}
		
	}

}
