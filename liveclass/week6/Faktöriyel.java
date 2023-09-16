package week6;

public class Faktöriyel {
    public static void main(String[] args) {
        System.out.println(faktoriyel(5));

    }
    public static int faktoriyel(int a){
        if(a==0){
            return 1;
        }
        else {
            return a*faktoriyel(a-1);
        }
    }
}
