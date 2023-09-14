package week6;

public class Duplicate {
    public static void main(String[] args) {
        // kelime
        String str = "Programming";
        String output = "";
        for(int i=0;i<str.length();i++){
           if(output.indexOf(str.charAt(i)+"")==-1){
               output += ""+str.charAt(i);
           }

            }
        System.out.println(output);
        }
    }

