package com.skilldistillery.cardgame.entities;

import java.util.ArrayList;
import java.util.List;

public class Dealer extends Player {
	private Deck deck = new Deck();
	
	public int dealerVal;
	public List<Card> playerHand = new ArrayList<>();
	public List<Card> dealerHand = new ArrayList<>();

	public void shuffle() {
		System.out.println("Shuffling deck");
		System.out.println("Dealing Cards");
		deck.shuffle();
		System.out.println();
	
		}
	
	

	public void hitPlayer() {
		Card dealtCard = deck.dealCard();
		System.out.println("Player gets: " + dealtCard);
		playerHand.add(dealtCard);
		playerVal += dealtCard.getValue();
		
	}

	public void stay() {
		System.out.println("Player Value: " + playerVal);
	}

	public void dealersTurn() {
		System.out.println("Dealer flips hole card: " + dealerHand.get(0));
		System.out.println("Dealer Value: " + dealerHand + " " + dealerVal);
		while (dealerVal <= 16) {
			System.out.println("Dealer Hits");
			hitDealer();
		}
		System.out.println("Dealer stays with: " + dealerVal);
	}

	public void hitDealer() {
		Card dealtCard = deck.dealCard();
		dealerHand.add(dealtCard);
		System.out.println("Dealer's next card is: " + dealtCard);
		dealerVal += dealtCard.getValue();
		System.out.println(dealerHand + " " + dealerVal);
	}

	public void playerCards() {
		System.out.println("Dealers hand: \n\t" + dealerHand.get(1));
		checkPlayerHand((List<Card>) playerHand, playerVal);
	}

	public void deal() {
		int playerCount = 2;
		int firstDeal = 2;
		for (int i = 0; i < playerCount; i++) {
			for (int j = 0; j < firstDeal; j++) {
			Card dealtCard = deck.dealCard();
			if (i % 2 == 0) {
				playerHand.add(dealtCard);
				playerVal += (dealtCard).getValue();
			}

			if (i % 2 == 1) {
				dealerHand.add(dealtCard);
				dealerVal += (dealtCard).getValue();
			}
		}
	}
		System.out.println("Player first card: " + playerHand.get(0));
		System.out.println("Dealer lays first card face down.");
		System.out.println("Player second card: " + playerHand.get(1));
		System.out.println("Dealer second card: " + dealerHand.get(1));
		System.out.println();
	}

	public Deck getDeck() {
		return deck;
	}

	public void pickWinner() {
		if (playerVal > dealerVal && playerVal < 21) {
			System.out.println("Your Win!");
		}
		else if (playerVal < dealerVal && dealerVal > 21) {
			System.out.println("Dealer Bust!");
			System.out.println("You Win!");
		}

		else if (playerVal == dealerVal) {
			System.out.println("Push!");
			System.out.println("The game is a tie.");
		}
			
		else {
		System.out.println("Dealer Wins");
		}

	}
}
