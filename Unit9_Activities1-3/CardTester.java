/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		Card card1 = new Card ("9", "Heart", 9);
		Card card2 = new Card("9", "Heart", 9);
		Card card3 = new Card("Jack", "Heart", 11);
		
		System.out.println(card1.toString());
		System.out.println(card2.toString());
		System.out.println(card3.toString());
		System.out.println("Card 1 and 2 should match: " + card2.matches(card1));
		System.out.println("Card 2 and 3 should not match: " + !card2.matches(card3));
				
	}
}
