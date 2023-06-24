package sec02;

public class DenyLogicOperatorExample {

	public static void main(String[] args) {
		// boolean 긍, 부정문 
		boolean play = true;
		System.out.println(play);

		play = !play;// true -> false

		System.out.println(play);

		play = !play; // false -> true
		System.out.println(play);
	}

}
