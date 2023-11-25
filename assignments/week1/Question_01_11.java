public class Question_01_11 {
    public static void main(String[] args) {
        double cp = 312032486.0;
        int sec = 365 * 24 * 60 * 60;
        double diffPerYear = sec / 7.0 + sec / 45 - sec / 13;
        System.out.println("Population projection");
        System.out.println("Current population:312032486");
        System.out.println("One birth every 7 seconds.");
        System.out.println("One death every 13 seconds.");
        System.out.println("One new immigrant every 45 seconds.");
        System.out.println("Yearly Population projection formula:");
        System.out.println("Current population + births per year");
        System.out.println("- deaths per year");
        System.out.println("+ new immigrants per year");
        for (int i = 1; i < 6; i++) {
            cp = cp + diffPerYear;
            System.out.println("Year " + i + " projection:");
            System.out.println(cp);
        }


    }


}
