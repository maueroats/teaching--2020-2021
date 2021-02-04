public class Card {
    private int rank, suit;
    public static final int CLUB=1, DIAMOND=2, HEART=3, SPADE=4;
    public Card (int rank, int suit) { /* TODO */ }
    public int getRank() { return rank; }
    public int getSuit() { return suit; }
    public String toString() { return "TODO"; }
    public static Card parse_one(String str) { return null; /* TODO */ }
    public static Card[] parse_hand(String str) { return null; /* TODO */ }

    // we have not learned how to write equals yet, so this is given
    public boolean equals(Object other) {
        if (other instanceof Card ) {
            Card o = (Card) other; 
            return suit==o.suit && rank==o.rank;
        } else {
            return false;
        }
    }

    public static void cardTest() {
        System.out.println("=== toString ===");
        Card s9 = new Card(9,4);
        Card jc = new Card(11,1);
        System.out.println(s9); //.toString().equals("9S"));
        System.out.println(jc); //.toString().equals("JC"));

        System.out.println("=== parse_one ===");
        Card c = Card.parse_one("JH");
        System.out.println("parse_one: "+(c.equals(new Card(11,3))));

        System.out.println("=== parse_hand ===");
        String hand1 = "2H 6C";
        Card[] expected_ans1 = {new Card(2,3), new Card(6,1)};
        Card[] actual_ans1 = Card.parse_hand(hand1);
        for (int k=0; k < actual_ans1.length; k++) {
            System.out.println(actual_ans1[k].equals(expected_ans1[k]));
        }
    }
    public static void main(String[] args) {
        cardTest();
    }
}

