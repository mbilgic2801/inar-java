package week10;

public class MyString2_10_23 {
    public String str;
    public MyString2_10_23(){
        
    }
    public MyString2_10_23(String str){
        this.str=str;
    }
    public int compare(String s){
        MyString2_10_23 str2=new MyString2_10_23(s);
        for (int i = 0; i <(Math.min(s.length(), str.length())) ; i++) {
            if(str.charAt(i)<str2.str.charAt(i)){
                return -1;
            }
            else if(str.charAt(i)>str2.str.charAt(i)){
                return 1;
            }

        }
        return 0;
    }
}
