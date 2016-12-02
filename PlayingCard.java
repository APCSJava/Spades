/***
 * Represents a playing card.  Common properties such as the rank and
 * value are defined here.  However, subclasses are responsible for
 * implementing the two abstract methods and thereby establishing
 * the behavior of their specific suit, i.e., whether they beat a
 * comparison card and how best to display themselves as a string.
 */
public abstract class PlayingCard {
	
	private final String rank; // cannot change the rank, once assigned
	private final int value; // cannot change the value, once assigned

	public PlayingCard(int value, String rank) {
		this.rank = rank;
		this.value = value;
	}
	
	public int getValue() {
		return value;
	}
	
	public String getRank() {
		return rank;
	}
	
	/**
	 * Compares the current card with a second card to see whether
	 * this card counts as higher, based on value and/or suit.
	 * 
	 * @param other a second PlayingCard against which to compare
	 * @return whether this card beats the other card
	 */
	public abstract boolean beats(PlayingCard other);
	// all subclasses MUST implement this or be declared abstract
	
	/**
	 * Returns a printable representation of this card including its
	 * value and suit.
	 */
	public abstract String toString();
	// all subclasses MUST implement this or be declared abstract

}