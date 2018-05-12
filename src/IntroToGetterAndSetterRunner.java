
public class IntroToGetterAndSetterRunner {
	public static void main(String[] args) {
		Person persone = new Person("person 1");
		Person perstwo = new Person("person 2");
		Person persthree = new Person("person 3");
		persone.setSuperpower("skill 1");
		perstwo.setSuperpower("skill 2");
		persthree.setSuperpower("skill 3");
		System.out.println(persone);
		System.out.println(perstwo);
		System.out.println(persthree);
	}

}
