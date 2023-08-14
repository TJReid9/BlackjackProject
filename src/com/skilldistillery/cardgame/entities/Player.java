package com.skilldistillery.cardgame.entities;

import java.util.List;

import com.skilldistillery.cardgame.blackjack.app.BlackjackHand;

public class Player {
	protected Hand playerHand;
	public int playerVal;

	public BlackjackHand makeHand(BlackjackHand bjHand) {
		this.playerHand = bjHand;
		return bjHand;
	}

	public void checkPlayerHand(List<Card> playerHand, int playerVal) {
		System.out.println("Players hand: ");
		for (Card card : playerHand) {
			System.out.println("\t" + card + " ");
		}
		System.out.println("Player total value: " + playerVal);
	}

	public void playerMenu() {
		System.out.println("|====================|");
		System.out.println("|    Hit or Stay?    |");
		System.out.println("|     1) Hit         |");
		System.out.println("|     2) Stay        |");
		System.out.println("|====================|");
	}
	

	public void againMenu() {

		System.out.println("|====================|");
		System.out.println("|    Play Again?     |");
		System.out.println("|     1) Yes         |");
		System.out.println("|     2) No          |");
		System.out.println("|====================|");

	}

}
