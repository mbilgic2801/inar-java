package week5;

public class Question_05_03 {
    public static void main(String[] args) {
        double j;

        String tableName="Kilograms       Pounds";
        System.out.println(tableName);
        for(int i=1;i<200;i+=2){
            String space="";
            j = i * 22 / 10.0;
            System.out.print(i);

            for (int k = tableName.length()-(""+i+""+j).length();k>0;k--){
                space=space+" ";
            }
            System.out.printf("%s%.1f\n",space,j);

        }

    }
}
