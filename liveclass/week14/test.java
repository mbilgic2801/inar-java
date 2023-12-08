package week14;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
public class test {
    public static void main(String[] args) {
        // Given a String find out, if there is a duplicate
        // Inar Academy -> case sensitive (A != a)
        System.out.println(isDuplicate1("Inar Academy"));
    }
    public static boolean isDuplicate1(String s){
        HashMap a=new HashMap<>();
        List<Integer> a1=new ArrayList<>();
        a1.add(12412);
        a1.add(32);
        System.out.println(a1.toString());
        System.out.println(a1);
        a.put("qwsa","sasdsa");
        System.out.println(a.isEmpty());
        System.out.println(a.toString());
        return false;
    }
    public static boolean isDuplicate(String s){
        String str="";
        int count=0;
        for (int i = 0; i < s.length(); i++) {
            if(str.indexOf(s.charAt(i))<0){
                str+=s.charAt(i);
                count++;
            }
            else{
                count++;
                System.out.println(count);
                return true;
            }
        }
        System.out.println(count);
        return false;
    }
}
