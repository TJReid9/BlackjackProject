package com.skilldistillery.cardgame.entities;

import java.util.ArrayList;

public abstract class Hand {
	protected ArrayList<Card> hand = new ArrayList<>();
	
	public Hand(){	}
	
	public void addCard(Card card) {
		hand.add(card);
	}
	
	public void clearHand() {
		hand.clear();
	}
	
	public abstract int getHandValue();

	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		for (Card card : hand) {
			sb.append(card.toString() + " ");
			
		}
		return sb.toString();
	}
		
		
	
}
