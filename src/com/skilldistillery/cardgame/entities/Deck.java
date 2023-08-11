package com.skilldistillery.cardgame.entities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	private List<Card> deck;
	
	public Deck() {
		deck = makeDeck();
//		
//		Suit[] suits = Suit.values();
//		Rank[] ranks = Rank.values();
//		for (Suit suit : suits) {
//			for (Rank rank : ranks) {
//				Card aCard = new Card(suit, rank);
			}
		
	
	private List<Card> makeDeck(){
		List<Card> deck = new ArrayList<>(52);
		for (Suit suit : Suit.values()) {
			for (Rank rank : Rank.values()) {
				deck.add(new Card(suit, rank));
			}
		}
		return deck;
	}
	public int checkDeckSize() {
		return deck.size();
	}
	
	public void shuffle() {
		Collections.shuffle(deck);
	}
	
	public Card dealCard() {
		return deck.remove(0);
		
	}
}
