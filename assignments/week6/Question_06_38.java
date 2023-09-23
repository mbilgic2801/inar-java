package week6;

public class Question_06_38 {
    public static void main(String[] args) {
        for (int i = 1; i <= 200; i++) {
            if (i < 101) {
                System.out.print(getRandomUpperCaseLetter() + " ");
            } else {
                System.out.print(getRandomDigitCharacter() + " ");
            }
            if (i % 10 == 0) {
                System.out.println();
            }
        }
    }

    public static char getRandomUpperCaseLetter() {
        return getRandomCharacter('A', 'Z');
    }
    public static char getRandomDigitCharacter(){
        return getRandomCharacter('0','9');
    }
    public static char getRandomCharacter(char c1, char c2){
        return (char) ((int)(Math.random()*(c2-c1+1))+c1);
    }
}
