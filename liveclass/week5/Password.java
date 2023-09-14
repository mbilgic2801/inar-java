package week5;

import java.util.Date;
import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final String PASSWORD = "pass1234";
        //3 kere üst üste yanlış girerse "access denied"
        //kullanıcının yanlış yaptığı zamanları bir stringte toplasın ve başarılı girişinde göstersin
        //yanlış girişte şifre yanlış olduğunu ve kaç hakkı kaldığını

        Date date = new Date();
        int wrongCounter = 0;
        String wrongOutput ="";
        System.out.print("Enter your password: ");
        for(int i=0;i<3;i++){
            String password = input.nextLine();
            if(password.equals(PASSWORD)){
                if(i>0) {
                    System.out.println("hello Mehmet, these are unsuccessful login attempts:");
                    System.out.println(wrongOutput);
                    break;
                }
                else{
                    System.out.println("Hello mehmet");
                    break;
                }

            }
            else{
                if(wrongCounter==2){
                    System.out.println("Access denied");
                    break;
                }
                else{
                    wrongOutput += (i+1) +" "+ date.toString()+"\n";
                    wrongCounter++;
                    System.out.println("invalid password you have "+(3-wrongCounter)+" rights");

                }
            }
        }
    }
}
