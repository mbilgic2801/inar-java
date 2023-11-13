package week10;

public class MyString1_10_22 {

    public int length;
    char[] str=new char[length];


    public MyString1_10_22() {
    }

    public MyString1_10_22(char[] chars) {
        this.length = chars.length;
        str = new char[length];
        for (int i = 0; i < length; i++) {
            str[i]=chars[i];
        }
    }

    public char charAt(int index) {
        return str[index];
    }

    public MyString1_10_22 substring(int begin, int end) {
       /* MyString1_10_22 a = new MyString1_10_22(new char[end-begin]);
        for (int i = begin, j = 0; i < end+1; i++, j++) {
            a.str[j] = this.str[i];
        }
        return a;*/
        char[] ch= new char[end-begin];
        for (int i = begin,j=0; i <end ; i++,j++) {
            ch[j]=str[i];
        }
        return new MyString1_10_22(ch);
    }

    public MyString1_10_22 toLowerCase() {
        MyString1_10_22 a = new MyString1_10_22(new char[str.length]);
        for (int i = 0; i < this.length; i++) {
            if (str[i] >= 'A' && str[i] <= 'Z') {
                a.str[i] = (char) (str[i] + 32);
            } else {
                a.str[i] = this.str[i];
            }
        }
        return a;
    }

    public boolean equals(MyString1_10_22 s) {
        if (s.length != this.length) {
            return false;
        }
        for (int i = 0; i < s.length; i++) {
            if (this.str[i] != s.str[i]) {
                return false;
            }
        }
        return true;
    }
    public void tooString(){

        for (int i = 0; i < length; i++) {
            System.out.print(str[i]);
        }


    }
    public static MyString1_10_22 valueOf(int i){
        int numberLength=0;
        int temp=i;
        while(temp>0){
            temp/=10;
            numberLength++;
        }
        char[] ch=new char[numberLength];
        int k=(int)(Math.pow(10,numberLength-1));
        //System.out.println(k);
        for (int j = 0; j <numberLength; j++) {
            ch[j]=(char)( (i/k)+48);
            i%=k;
            k/=10;
          //  System.out.println(k);

        }
        return new MyString1_10_22(ch);
    }
}
