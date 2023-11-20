package week10;

public class Question_10_03 {
    public static void main(String[] args) {
        MyInteger_10_03 number=new MyInteger_10_03(41614161);
        MyInteger_10_03 number2=new MyInteger_10_03(41614161);

        System.out.println("getValue(): "+number.getValue());
        System.out.println("isEven(): "+number.isEven());
        System.out.println("isOdd(): "+number.isOdd());
        System.out.println("isPrime(): "+number.isPrime());
        System.out.println("equals(10): "+number.equals(10));
        System.out.println("equals(MyInteger(41614161)): "+number.equals(new MyInteger_10_03(41614161)));
       // System.out.println(number.equals(number2));
        System.out.println("isEven(41614161) static: "+MyInteger_10_03.isEven(41614161));
        System.out.println("isOdd(41614161) static: "+MyInteger_10_03.isOdd(41614161));
        System.out.println("isPrime(41614161) static: "+MyInteger_10_03.isPrime(41614161));
        System.out.println("parseInt(char[]{1, 2, 3}) static: "+MyInteger_10_03.parseInt(new char[]{'1', '2', '3'}));
        System.out.println("parseInt(String 123) static: "+MyInteger_10_03.parseInt("123"));

    }
}
