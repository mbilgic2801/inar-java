package week6;

public class Question_06_09 {
    public static void main(String[] args) {
        System.out.println("Feet      Meters      |      Meters      Feet");
        System.out.println("--------------------------------------------------");
        for(int i=1,j=20;i<=10;i++,j+=5){
            System.out.printf("%4.1f %10.3f %7s %9.1f %14.3f\n",(double)i,footToMeter(i),"|",(double)j,meterToFoot(j));

        }
    }
    public static double footToMeter(double foot){
        return foot * 0.305;
    }
    public static double meterToFoot(double meter){
        return meter * 3.279;
    }
}
