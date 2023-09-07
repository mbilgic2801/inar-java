package week5;

public class Question_05_04 {
    public static void main(String[] args) {
        double j;


        String firstColumn="Miles       ";
        String secondColumn="Kilometers";
        System.out.println(firstColumn+secondColumn);
        for(int i=1;i<11;i++){
            String space="";
            j = i * 1609 / 1000.0;
            System.out.print(i);

            for (int k = firstColumn.length()-(""+i).length();k>0;k--){
                space=space+" ";
            }
            System.out.printf("%s%.3f\n",space,j);

        }
    }
}
