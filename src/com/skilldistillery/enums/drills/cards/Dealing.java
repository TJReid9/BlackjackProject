package com.skilldistillery.enums.drills.cards;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import com.skilldistillery.cardgame.entities.Card;
import com.skilldistillery.cardgame.entities.Deck;

public class Dealing {

	public static void main(String[] args) {
		Dealing deal = new Dealing();
		deal.launch();
	}
	
	public void launch() {
		Deck theDeck = new Deck();
		
		play(theDeck);
	
	}

	public void play(Deck deck) {

		int howMany = 15;

		deck.shuffle();

		for (int i = 0; i < howMany; i++) {
			Card dealtCard = deck.dealCard();
			System.out.println(dealtCard + ", ");
		}
		System.out.println();
		System.out.println(deck.checkDeckSize());
	}
}

//		Scanner kb = new Scanner(System.in);
//		System.out.println("How many cards do you want?");
//		
//		try {
//		int numberOfCards = kb.nextInt();
//
//		if (numberOfCards > 52) {
//			throw new InputMismatchException();
//
//		}
//		
//		List<Card> hand = new ArrayList<>(numberOfCards);
//		int totalVal = 0;
//		for (int i = 0; i < numberOfCards; i++) {
//			Card card = deck.dealCard();
//			totalVal += card.getValue();
//			hand.add(card);
//		}
//		 printHandAndValue(hand, totalVal);
//	    }
//	    catch (InputMismatchException e) {
//	      System.out.println("That is not a valid number of cards.");
//	    }
//	    finally {
//	      kb.close();
//	    }
//	  }
//	  
//	  private void printHandAndValue(List<Card> hand, int value) {
//	    for (Card card : hand) {
//	      System.out.println(card);
//	    }
//	    System.out.println("Total value: " + value);
//		
//		
//
//	}
