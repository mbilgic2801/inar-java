package week3;

public class Question_03_24 {
    public static void main(String[] args) {

            String nameOfRank = "";
            String nameOfSuit = "";

            int rank = (int) (Math.random() * 13);
            int suit = (int) (Math.random() * 4);


            switch (rank) {
                case 0:
                    nameOfRank = "Ace";
                    break;
                case 1:
                    nameOfRank = "2";
                    break;
                case 2:
                    nameOfRank = "3";
                    break;
                case 3:
                    nameOfRank = "4";
                    break;
                case 4:
                    nameOfRank = "5";
                    break;
                case 5:
                    nameOfRank = "6";
                    break;
                case 6:
                    nameOfRank = "7";
                    break;
                case 7:
                    nameOfRank = "8";
                    break;
                case 8:
                    nameOfRank = "9";
                    break;
                case 9:
                    nameOfRank = "10";
                    break;
                case 10:
                    nameOfRank = "Jack";
                    break;
                case 11:
                    nameOfRank = "Queen";
                    break;
                case 12:
                    nameOfRank = "King";
                    break;
            }
            switch (suit) {
                case 0:
                    nameOfSuit = "Clubs";
                    break;
                case 1:
                    nameOfSuit = "Diamonds";
                    break;
                case 2:
                    nameOfSuit = "Hearts";
                    break;
                case 3:
                    nameOfSuit = "Spades";
                    break;

            }
            System.out.println("The card you picked is " + nameOfRank + " of " + nameOfSuit);

        }

    }

