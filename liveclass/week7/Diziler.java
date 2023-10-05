package week7;

import static java.util.Collections.shuffle;

public class Diziler {
    public static void main(String[] args) {
        int[] dizi = new int[20];

        for (int i = 0; i < dizi.length; i++) {
            dizi[i] = i;
        }
        for (int i = 0; i < dizi.length; i++) {
            System.out.print(dizi[i] + " ");

        }
        System.out.println();
        dizi=shuffle(dizi);
        for (int i = 0; i < dizi.length; i++) {
            System.out.print(dizi[i] + " ");
        }
        System.out.println();
        for(int number:dizi){
            System.out.print(number+" ");
        }


        }
    public static int[] shuffle(int[] dizi){
        for (int i = dizi.length - 1; i > 0; i--) {
            int j = (int) (Math.random() * (i + 1));
            int temp = dizi[i];
            dizi[i] = dizi[j];
            dizi[j] = temp;

        }
        return dizi;
    }
    }