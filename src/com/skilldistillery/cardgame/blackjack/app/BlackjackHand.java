package com.skilldistillery.cardgame.blackjack.app;

import java.util.ArrayList;
import java.util.List;

import com.skilldistillery.cardgame.entities.Card;
import com.skilldistillery.cardgame.entities.Hand;

public class BlackjackHand extends Hand {

	public BlackjackHand() {

	}

	@Override
	public int getHandValue() {
		List<Card> hand = new ArrayList<>();
		int totalVal = 0;
		for (int i = 0; i < hand.size(); i++) {
			Card card = hand.get(i);
			totalVal += card.getValue();
			hand.add(card);
		}
		return totalVal;

	}

	public boolean isBlackjack() {
		boolean blackJack = false;
		if (getHandValue() == 21) {
			blackJack = true;
		}
		return blackJack;
	}

	public boolean isBust() {
		boolean busted = false;
		if (getHandValue() > 21) {
			busted = true;
		}
		return busted;

	}
}
