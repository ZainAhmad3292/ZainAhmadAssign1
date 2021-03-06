package zain.ahmad.s3292;

/**
 * A class that models playing card Objects. Cards have a value (note that Ace =
 * 1, Jack =11, Queen =12, King = 13) A suit (clubs, hearts, spades, diamonds).
 * There are 52 cards in a deck, no jokers. This code is to be used in Exercise
 * 1. When you create your own branch, add your name as an author.
 * 
 * @author dancye
 * @author Paul Bonenfant
 * 
 * @author ZainAhmad3292 Date: May 29th, 2021
 */
public class Card {

    private String suit; // clubs, spades, diamonds, hearts
    private int value;// 1-13

    public static final String[] SUITS = { "Hearts", "Diamonds", "Spades", "Clubs" };

    /**
     * @return the suit
     */
    public String getSuit() {
        return suit;
    }

    /**
     * @param suit the suit to set
     */
    public void setSuit(String suit) {
        this.suit = suit;
    }

    public void setValue(int num) {
        this.value = num;
    }

    public int getValue() {
        return value;
    }

}
