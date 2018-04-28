
public class SmurfRunner {
	public static void main(String[] args) {
		/*
		 * 1. Watch this smurf cartoon: https://www.youtube.com/watch?v=RqbpzEHuO2g 2.
		 * In a Runner class, make a Handy Smurf. Use the methods below to make him eat,
		 * and print his name.
		 * 
		 * 5. Make a Papa Smurf and print his name, hat color and girl or boy. 6. Make a
		 * Smurfette and print her name, hat color and girl or boy.
		 */
		Smurf handyman = new Smurf("handyman");
		handyman.eat();
		handyman.getName();
		Smurf papasmurf = new Smurf("papasmurf");
		papasmurf.getName();
		papasmurf.getHatColor();
		papasmurf.isGirlOrBoy();
		Smurf smurfette = new Smurf("smurfette");
		smurfette.getName();
		smurfette.getHatColor();
		smurfette.isGirlOrBoy();
	}
}
