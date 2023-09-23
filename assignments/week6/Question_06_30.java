package week6;

public class Question_06_30 {
    public static void main(String[] args) {
       craps();
    }
    public static void craps(){
        int tempSum=0;
        int firstDice=rollDice();
        int secondDice=rollDice();
        int sum=firstDice+secondDice;
        if(sum==2||sum==3||sum==12){
            System.out.printf("you rolled %d + %d = %d\n",firstDice,secondDice,sum);
            System.out.println("you lose");return;
        }
        else if (sum==7||sum==11) {
            System.out.printf("you rolled %d + %d = %d\n",firstDice,secondDice,sum);
            System.out.println("you win");return;
        }
        else{
            System.out.printf("you rolled %d + %d = %d\n",firstDice,secondDice,sum);
            System.out.printf("point is %d\n",sum);
            tempSum=sum;
            sum=0;
            while(true) {
                firstDice = rollDice();
                secondDice = rollDice();
                sum=firstDice+secondDice;
                if(sum==tempSum){
                    System.out.printf("you rolled %d + %d = %d\n",firstDice,secondDice,sum);
                    System.out.println("you win");break;
                }
                if(sum==7){
                    System.out.printf("you rolled %d + %d = %d\n",firstDice,secondDice,sum);
                    System.out.println("you lose");break;
                }
            }

        }
    }
    public static int rollDice(){
        return (int)(Math.random()*6+1);
    }

}
