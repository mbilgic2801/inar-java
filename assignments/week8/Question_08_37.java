package week8;

import java.util.Scanner;


public class Question_08_37 {
    public static void main(String[] args) {

        String[][] statesAndCapitals = americaStates();

        playGame(statesAndCapitals);

    }

    private static void playGame(String[][] statesAndCapitals) {
        Scanner input = new Scanner(System.in);
        int counter = 0;
        String answer;
        for (int i = 0; i < statesAndCapitals.length; i++) {
            System.out.printf("What is the capital of %s? ", statesAndCapitals[i][0]);
            answer = input.next();
            if (answer.equals(statesAndCapitals[i][1])) {
                counter++;
                System.out.println("Your answer is correct");
            } else {
                System.out.printf("The correct answer should be %s\n", statesAndCapitals[i][0]);
            }
        }
        System.out.println("The correct count is " + counter);
    }

    public static String[][] americaStates() {
        String[][] statesAndCapitals = {
                {"Alabama", "Montgomery"}, {"Alaska", "Juneau"}, {"Arizona", "Phoenix"},
                {"Arkansas", "Little Rock"}, {"California", "Sacramento"},
                {"Colorado", "Denver"}, {"Connecticut", "Hartford"},
                {"Delaware", "Dover"}, {"Florida", "Tallahassee"},
                {"Georgia", "Atlanta"}, {"Hawaii", "Honolulu"}, {"Idaho", "Boise"},
                {"Illinois", "Springfield"}, {"Indiana", "Indianapolis"},
                {"Iowa Des", "Moines"}, {"Kansas", "Topeka"}, {"Kentucky", "Frankfort"},
                {"Louisiana", "Baton Rouge"}, {"Maine", "Augusta"},
                {"Maryland", "Annapolis"}, {"Massachusetts", "Boston"},
                {"Michigan", "Lansing"}, {"Minnesota", "Saint Paul"},
                {"Mississippi", "Jackson"}, {"Missouri", "Jefferson City"},
                {"Montana", "Helena"}, {"Nebraska", "Lincoln"},
                {"Nevada	", "Carson City"}, {"New Hampshire", "Concord"},
                {"New Jersey", "Trenton"}, {"New Mexico", "Santa Fe"},
                {"New York", "Albany"}, {"North Carolina", "Raleigh"},
                {"North Dakota", "Bismarck"}, {"Ohio", "Columbus"},
                {"Oklahoma", "Oklahoma City"}, {"Oregon", "Salem"},
                {"Pennsylvania", "Harrisburg"}, {"Rhode Island", "Providence"},
                {"South Carolina", "Columbia"}, {"South Dakota", "Pierre"},
                {"Tennessee", "Nashville"}, {"Texas", "Austin"},
                {"Utah", "Salt Lake City"}, {"Vermont", "Montpelier"},
                {"Virginia", "Richmond"}, {"Washington", "Olympia"},
                {"West Virginia", "Charleston"}, {"Wisconsin", "Madison"},
                {"Wyoming", "Cheyenne"}};
        return statesAndCapitals;
    }
}
