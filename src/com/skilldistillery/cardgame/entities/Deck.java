package com.skilldistillery.cardgame.entities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	private List<Card> deck = new ArrayList<>();

	public Deck() {

		Suit[] suits = Suit.values();
		Rank[] ranks = Rank.values();
		for (Suit suit : suits) {
			for (Rank rank : ranks) {
				Card aCard = new Card(suit, rank);
				deck.add(aCard);
			}
		}

	}

	public void checkDeckSize() {
		System.out.println(deck.size() + " cards left.");
	}

	public void shuffle() {
		Collections.shuffle(deck);
	}

	public Card dealCard() {
		return deck.remove(0);
	}

	public List<Card> getDeck() {
		return deck;
	}

	public void setDeck(List<Card> deck) {
		this.deck = deck;

	}
}
