package week10;

public class Question_10_03 {
    public static void main(String[] args) {
        MyInteger_10_03 number=new MyInteger_10_03(41614161);
        MyInteger_10_03 number2=new MyInteger_10_03(41614161);

        System.out.println(number.getValue());
        System.out.println(number.isEven());
        System.out.println(number.isOdd());
        System.out.println(number.isPrime());
        System.out.println(number.equals(10));
        System.out.println(number.equals(new MyInteger_10_03(41614161)));
        System.out.println(number.equals(number2));
        System.out.println(MyInteger_10_03.isEven(41614161));
        System.out.println(MyInteger_10_03.isOdd(41614161));
        System.out.println(MyInteger_10_03.isPrime(41614161));
        System.out.println(MyInteger_10_03.parseInt(new char[]{'1', '2', '3'}));
        System.out.println(MyInteger_10_03.parseInt("123"));

    }
}
