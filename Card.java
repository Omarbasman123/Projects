/*
*Nom d'etudiant : TAHA KADI, OMAR BASMAN ALMOGHLY 
*Numero d'etudiant : 300342384 , 300406240
*Code du cours : ITI1521  
 */

/**
 * Card class represents a playing card from a deck.  A card has a color and a value
 */

 public class Card {
  
    private final int color;   // Card's color
    private final int value;     //Card's value (1 - 13, with 1 representing ACE).

   /***
     * Codes for the colors and non-numeric cards. Cards 2 through 10 have their numerical values for their codes.
     * */
   
    public final static int CLUBS = 0;   
    public final static int DIAMONDS = 1;
    public final static int HEARTS = 2;
    public final static int SPADES = 3; 
  
    public final static int ACE = 1;     
    public final static int JACK = 11;    
    public final static int QUEEN = 12;   
    public final static int KING = 13;


    /**
     * Constrcutor, that creates a card with a specified color and value.
     * @throws IllegalArgumentException if the parameter values are not in the ranges
     */
    public Card(int value, int color) {
        if (value < 1 || value > 13) {
            throw new IllegalArgumentException("Value must be between 1 and 13.");
        }
        this.value = value;
        this.color = color;
    }

    /**
     * Returns the color of this card.
     */
    public int getColor() {
        return color;
    }

    /**
     * Returns the value of this card.
     * @return the value, which is one of the numbers 1 through 13, inclusive for
     * a regular card.
     */
    public int getValue() {
       return value;
    }

    /**
 * Returns a String representation of the card's color.
 * @return one of the strings "Spades", "Hearts", "Diamonds", or "Clubs"
 */
public String ColorToString() {
    String res = "";
    switch (getColor()) {
        case 0:
            res = "Clubs";
            break;
        case 1:
            res = "Diamonds";
            break;
        case 2:
            res = "Hearts";
            break;
        case 3:
            res = "Spades";
            break;
        default:
            break;
    }
    return res;
}

/**
 * Returns a String representation of the card's value.
 * @return for a regular card, one of the strings "Ace", "2",
 * "3", ..., "10", "Jack", "Queen", or "King".  
 */
public String ValueToString() {
    String res = "";
    switch (getValue()) {
        case 1:
            res = "Ace";
            break;
        case 11:
            res = "Jack";
            break;
        case 12:
            res = "Queen";
            break;
        case 13:
            res = "King";
            break;
        default:
            res = Integer.toString(getValue());  // For values between 2 and 10
            break;
    }
    return res;
}

/**
 * Returns a string representation of this card, including both
 * its color and its value.  Sample return values is: "Ace of Diamonds", 
 */
public String toString() {
    return ValueToString() + " of " + ColorToString();
}

} // end class Card
