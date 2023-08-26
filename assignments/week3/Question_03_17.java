package week3;

import java.util.Scanner;

public class Question_03_17 {
    public static void main(String[] args) {
        byte player;
        Scanner input = new Scanner(System.in);

            byte computer = (byte) (Math.random() * 3);
            System.out.print("scissor (0), rock (1), paper (2): ");
            player = input.nextByte();
            switch (computer) {
                case 0: {
                    switch (player) {
                        case 0:
                            System.out.println("The computer is scissor. You are scissor too. It is a draw");
                            break;
                        case 1:
                            System.out.println("The computer is scissor. You are rock. You win.");
                            break;
                        case 2:
                            System.out.println("The computer is scissor. You are paper. You lose.");
                            break;
                    }
                } break;
                case 1: {
                    switch (player) {
                        case 0:
                            System.out.println("The computer is rock. You are scissor. You lose.");
                            break;
                        case 1:
                            System.out.println("The computer is rock. You are rock too. It is a draw.");
                            break;
                        case 2:
                            System.out.println("The computer is rock. You are paper. You win");
                            break;
                    }
                } break;
                case 2: {
                    switch (player) {
                        case 0:
                            System.out.println("The computer is paper. You are scissor too. You win.");
                            break;
                        case 1:
                            System.out.println("The computer is paper. You are rock. You lose.");
                            break;
                        case 2:
                            System.out.println("The computer is paper. You are paper too. It is a draw");
                            break;
                    }
                } break;
            }


    }
}
