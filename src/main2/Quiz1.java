package main2;

public class Quiz1 {

	public static void main(String[] args) {

		Card card1 = new Card();
		Card card2 = new Card();
		Card card3 = new Card();

		System.out.println(card1.card(1));
		System.out.println(card2.card(2));
		System.out.println(card3.card(3));
	}

}

class Card {
	int cardNumber = 99;

	public int card(int card) {
		this.cardNumber = cardNumber + card;
		return cardNumber;
	}

}