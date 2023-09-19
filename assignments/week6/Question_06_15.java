package week6;

import week3.Question_03_13;

public class Question_06_15 {
    public static void main(String[] args) {
        header();
        for(int i=50000;i<=60000;i+=50){
            oneLine(i);
        }



    }
    public static double computeTax(int status, double taxableIncome){
        double tax=0;
        switch (status){
            case 0:{
                if( taxableIncome > 8350 ){
                    if( taxableIncome > 33950 ){
                        if( taxableIncome > 82250 ){
                            if( taxableIncome > 171550 ){
                                if( taxableIncome > 372950 ){
                                    tax = ( taxableIncome - 372950 ) * 0.35;
                                    taxableIncome = 372950;
                                }
                                tax=tax + (taxableIncome-171550)*0.33;
                                taxableIncome = 171550;
                            }
                            tax = tax + (taxableIncome-82250)*0.28;
                            taxableIncome = 82250;
                        }
                        tax = tax + (taxableIncome-33950)*0.25;
                        taxableIncome = 33950;
                    }
                    tax = tax + (taxableIncome-8350)*0.15;
                    taxableIncome=8350;
                    tax= tax + taxableIncome*0.1;
                }
                else tax = taxableIncome * 0.1;
            } break;
            case 1:{
                if( taxableIncome > 16700 ){
                    if( taxableIncome > 67900 ){
                        if( taxableIncome > 137050 ){
                            if( taxableIncome > 208850 ){
                                if( taxableIncome > 372950 ){
                                    tax=( taxableIncome - 372950 ) * 0.35;
                                    taxableIncome = 372950;
                                }
                                tax = tax + ( taxableIncome - 208850 ) * 0.33;
                                taxableIncome = 208850;
                            }
                            tax = tax + ( taxableIncome - 137050 ) * 0.28;
                            taxableIncome = 137050;
                        }
                        tax = tax + ( taxableIncome - 67900 ) * 0.25;
                        taxableIncome = 67900;
                    }
                    tax = tax + ( taxableIncome - 16700 ) * 0.15;
                    taxableIncome = 16700;
                    tax= tax + taxableIncome * 0.1;
                }
                else tax = taxableIncome * 0.1;
            } break;
            case 2:{
                if( taxableIncome > 8350 ){
                    if( taxableIncome > 33950 ){
                        if( taxableIncome > 68525 ){
                            if( taxableIncome > 104425 ){
                                if( taxableIncome > 186475 ){
                                    tax = (taxableIncome - 186475 ) * 0.35;
                                    taxableIncome = 186475;
                                }
                                tax = tax + ( taxableIncome - 104425) * 0.33;
                                taxableIncome = 104425;
                            }
                            tax = tax + ( taxableIncome - 68525 ) * 0.28;
                            taxableIncome = 68525;
                        }
                        tax = tax + ( taxableIncome - 33950 ) * 0.25;
                        taxableIncome = 33950;
                    }
                    tax = tax + ( taxableIncome - 8350 ) * 0.15;
                    taxableIncome = 8350;
                    tax= tax + taxableIncome * 0.1;
                }
                else tax = taxableIncome * 0.1;
            } break;
            case 3:{
                if( taxableIncome > 11950 ){
                    if( taxableIncome > 45500 ){
                        if( taxableIncome > 117450 ){
                            if( taxableIncome > 190200 ){
                                if( taxableIncome > 372950 ){
                                    tax = ( taxableIncome - 372950 ) * 0.35;
                                    taxableIncome = 372950;
                                }
                                tax = tax + ( taxableIncome - 190200 ) * 0.33;
                                taxableIncome = 190200;
                            }
                            tax = tax + ( taxableIncome - 117450 ) * 0.28;
                            taxableIncome = 117450;
                        }
                        tax = tax + ( taxableIncome - 45500 ) * 0.25;
                        taxableIncome = 45500;
                    }
                    tax = tax + ( taxableIncome - 11950 ) * 0.15;
                    taxableIncome = 11950;
                    tax = tax + taxableIncome * 0.1;
                }
                else tax = taxableIncome * 0.1;
            } break;
        }
        return tax;
    }
    public static void header(){
        System.out.println("Taxable         Single          Married Joint           Married         Head of  ");
        System.out.println("Income                          or Qualifying           Separate        a House  ");
        System.out.println("                                Widow(er)                                        ");
        System.out.println("---------------------------------------------------------------------------------");
    }
    public static void oneLine(double taxableIncome){
        System.out.printf("%.0f%15.0f%16.0f%24.0f%16.0f\n",taxableIncome,computeTax(0,taxableIncome),computeTax(1,taxableIncome),computeTax(2,taxableIncome),computeTax(3,taxableIncome));
    }
}
