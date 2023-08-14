package com.skilldistillery.cardgame.blackjack.app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.skilldistillery.cardgame.entities.Card;
import com.skilldistillery.cardgame.entities.Dealer;
import com.skilldistillery.cardgame.entities.Deck;
import com.skilldistillery.cardgame.entities.Player;

public class BlackjackApp {
	BlackjackHand bjh = new BlackjackHand();
	Dealer dealer = new Dealer();
	Player player = new Player();
	private Deck deck = new Deck();
	public int dealerVal;
	public List<Card> playerHand = new ArrayList<>();
	public List<Card> dealerHand = new ArrayList<>();

	public static void main(String[] args) {
		BlackjackApp playBlackjack = new BlackjackApp();
		playBlackjack.shuffleCards();

		playBlackjack.play();

	}

	public void shuffleCards() {
		dealer.shuffle();
	}

	public void play() {
		Scanner kb = new Scanner(System.in);
		player.makeHand(new BlackjackHand());
		dealer.makeHand(new BlackjackHand());

		dealer.deal();
		playersTurn(kb);
		dealer.dealersTurn();
		dealer.pickWinner();

	}

	public void playersTurn(Scanner kb) {

		int choice = 0;
		while (choice != 2  || dealer.playerVal > 21 ) {

			dealer.playerCards();
			System.out.println();
			bjh.isBlackjack();
			bjh.isBust();
			if (dealer.playerVal == 21) {
				System.out.println("BlackJack!");
			}
			if (dealer.playerVal > 21) {
				System.out.println("Bust!");
				break;
			}
						
			player.playerMenu();
			choice = kb.nextInt();
			switch (choice) {
			case 1:
				dealer.hitPlayer();
				break;
			case 2:
				dealer.stay();
				break;
			default:
				System.err.println("Invalid choice");
				break;
			}
		}
	}
}
