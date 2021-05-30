package zain.ahmad.s3292;

import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then
 * asks the user to pick a card and searches the array of cards for the match to
 * the user's card. To be used as starting code in ICE 1
 *
 * @author dancye
 * @author Paul Bonenfant
 * 
 * @author ZainAhmad3292 Date: May 29th, 2021
 */
public class CardTrick {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Card[] magicHand = new Card[7];

        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();
            c.setValue(randomNum(0, 12));
            c.setSuit(Card.SUITS[randomNum(0, 3)]);
            magicHand[i] = c;
        }

        // insert code to ask the user for Card value and suit, create their card
        System.out.println("Pick Any Card");
        System.out.println("Enter the card value ");
        int Cardvalue = sc.nextInt();

        System.out.println("Enter the card name");
        String Cardname = sc.nextLine();
       
        for (int i = 0; i < magicHand.length; i++) {

            if (Cardname == magicHand[i].getSuit() && Cardvalue == magicHand[i].getValue()) {
                System.out.println("The card matches");
                i = 7;
            }
        }
        System.out.println("The card does not match");
        // and search magicHand here
        //Then report the result here
    }

    public static int randomNum(int low, int high) {
        // generate number from 0 to 3
        return (int) (Math.random() * (high - low));
    }

}
