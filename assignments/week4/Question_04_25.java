package week4;

public class Question_04_25 {
    public static void main(String[] args) {
        //generate plate number
        //3 uppercase letter + 4 digit
        char letter1 = (char) ((int)(Math.random()*26+65));
        char letter2 = (char) ((int)(Math.random()*26+65));
        char letter3 = (char) ((int)(Math.random()*26+65));
        int digit1 = (int)(Math.random()*10);
        int digit2 = (int)(Math.random()*10);
        int digit3 = (int)(Math.random()*10);
        int digit4 = (int)(Math.random()*10);
        String plateNumber = ""+letter1+letter2+letter3+digit1+digit2+digit3+digit4;
        System.out.println(plateNumber);
    }
}
