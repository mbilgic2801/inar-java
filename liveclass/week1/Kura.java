package week1;

public class Kura {
    public static void main(String[] args) {
        int turuncu=0;
        int mavi=0;
        while(true){
            if(Math.random()>=0.5){
                turuncu++;
            }
            else mavi++;
            System.out.println("Aydan---->"+turuncu);
            System.out.println("Canan---->"+mavi);
            if(mavi==10||turuncu==10){break;}
        }
        if(mavi==10){
            System.out.println("kazanan mavi");
        }
        if(turuncu==10){
            System.out.println("kazanan turuncu");
        }
    }
}
