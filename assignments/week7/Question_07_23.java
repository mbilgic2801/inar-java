package week7;

public class Question_07_23 {
    public static void main(String[] args) {
        boolean[] isOpen=new boolean[100];
        for(int i=0;i<isOpen.length;i++){
            changeLocker(isOpen,i);
        }
        printOpenLockers(isOpen);
    }

    private static void printOpenLockers(boolean[] isOpen) {
        for (int i = 0; i < isOpen.length; i++) {
            if(isOpen[i]){
                System.out.printf("L%d ",i+1);
            }
        }
    }

    private static void changeLocker(boolean[] isOpen, int i) {
        for(int j=i;j< isOpen.length;j+=(i+1)){
            isOpen[j]=!isOpen[j];
        }
    }
}
