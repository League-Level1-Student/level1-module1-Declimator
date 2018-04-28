/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 1
 */
 

public class HarryPotter {

	private static boolean cloakOn;
	
	HarryPotter() {
		System.out.println("making Harry Potter...");
	}

	public void castSpell(String spell){
System.out.println("casting spell: " + spell);
	}

	public void makeInvisible(boolean invisible) {
		cloakOn = invisible;
		
		if (cloakOn)
			System.out.println("Harry is invisible");
		else
			System.out.println("Harry is visible");
	}

	public void spyOnSnape() {
		System.out.println("Harry sees Professor Snape doing nefarious things.");
	}

	public static void main(String[] args) {
		// 1. make harry potter
		HarryPotter harry = new HarryPotter();
		
		// 2. become invisible
		harry.makeInvisible(true);
		// 3. spy on professor snape
		harry.spyOnSnape();
		// 4. become visible again
		harry.makeInvisible(false);
		// 5. cast a “stupefy” spell
		harry.castSpell("stupefy");
	}

}






