/**
 * 
 */
package arrays;

import java.util.Random;

/**
 * @author crice
 *
 */
public class DeckOfCards {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] deck = new int[52];
		String[] suits = { "Spades", "Hearts", "Diamonds", "Clubs" };
		String[] values = { "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King" };
		String cardSuit, cardValue;
		for (int i = 0; i < deck.length; i++) {
			deck[i] = i;

		}
		Random ran = new Random();
		int[] ranCards = new int[4];
		for (int i = 0; i < ranCards.length; i++) {
			ranCards[i] = deck[ran.nextInt(deck.length)];
			cardSuit = suits[ranCards[i] / 13];
			cardValue = values[ranCards[i] % 13];
			System.out.println(ranCards[i] + ":" + cardValue + " of " + cardSuit);
		}
//	
	}

}
