package week8;

import java.util.Scanner;

public class Question_08_36 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String qwert="0123456789";
        System.out.println(qwert.substring(0,5)+"   "+qwert.substring(5));
        System.out.print("Enter number n: ");
        int n=input.nextInt();
        char[][] matrix=new char[n][n];
        System.out.printf("Enter %d rows of letters separated by spaces:\n",n);
        CommonMethods.takeInput(matrix);
        CommonMethods.printArray(matrix);
        checkLatinSquare(matrix);
    }

    private static void checkLatinSquare(char[][] matrix) {
       int n= matrix.length;
       String str="";
        for (int i = 0; i < n; i++) {
            str+=(char)('A'+i);
        }
        for (int i = 0; i < n; i++) {
            String strTemp=str;

            for (int j = 0; j < n; j++) {
                if(!str.contains(""+matrix[i][j])){
                    System.out.println("invalid char");
                    return;
                }
                else{
                    int index=strTemp.indexOf(matrix[i][j]);
                    strTemp=strTemp.substring(0,index)+strTemp.substring(index);

                }
            }
          /*  if(!strTemp.equals("")){
                System.out.println("Not all chars used");
                return;
            }*/
        }
        for (int i = 0; i <n ; i++) {
            String strTemp=str;
            for (int j = 0; j <n ; j++) {
                int index=strTemp.indexOf(matrix[j][i]);
                strTemp=strTemp.substring(0,index)+strTemp.substring(index);

            }
            if(!strTemp.equals("")){
                System.out.println("Not all chars used");
                return;
            }
        }
        System.out.println("good matrix");
    }
}
