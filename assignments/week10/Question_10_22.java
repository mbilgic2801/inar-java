package week10;

public class Question_10_22 {
    public static void main(String[] args) {
        MyString1_10_22 a=new MyString1_10_22(new char[]{'m','e','h','m','e','t'});
        MyString1_10_22 b=new MyString1_10_22(new char[]{'m','e','H','M','e','t'});
        System.out.println(a.length);
        System.out.println(a.charAt(4));
        a.substring(2,6).tooString();
        System.out.println();
        System.out.println(a.equals(new MyString1_10_22(new char[]{'m','e','h','m','e','t'})));
        System.out.println(a.equals(new MyString1_10_22(new char[]{'m','e','h','m','e','t','t'})));
        b=b.toLowerCase();
        b.tooString();
        System.out.println();
        MyString1_10_22.valueOf(12345).tooString();


    }
}
