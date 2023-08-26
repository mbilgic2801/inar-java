package week3;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Question_03_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double income;
        double tax=0;
        int status;
        System.out.print("(0-single filter, 1-married jointly or qualifying widow(er), 2-married " +
                            "\nseparately, 3-head of household) Enter the filing status: ");
        status = input.nextInt();
        System.out.print("Enter the taxable income: ");
        income = input.nextDouble();
        switch (status){
            case 0:{
                if( income > 8350 ){
                    if( income > 33950 ){
                        if( income > 82250 ){
                            if( income > 171550 ){
                                if( income > 372950 ){
                                    tax = ( income - 372950 ) * 0.35;
                                    income = 372950;
                                }
                                tax=tax + (income-171550)*0.33;
                                income = 171550;
                            }
                            tax = tax + (income-82250)*0.28;
                            income = 82250;
                        }
                        tax = tax + (income-33950)*0.25;
                        income = 33950;
                    }
                    tax = tax + (income-8350)*0.15;
                    income=8350;
                    tax= tax + income*0.1;
                }
                else tax = income * 0.1;
            } break;
            case 1:{
                if( income > 16700 ){
                    if( income > 67900 ){
                        if( income > 137050 ){
                            if( income > 208850 ){
                                if( income > 372950 ){
                                    tax=( income - 372950 ) * 0.35;
                                    income = 372950;
                                }
                                tax = tax + ( income - 208850 ) * 0.33;
                                income = 208850;
                            }
                            tax = tax + ( income - 137050 ) * 0.28;
                            income = 137050;
                        }
                        tax = tax + ( income - 67900 ) * 0.25;
                        income = 67900;
                    }
                    tax = tax + ( income - 16700 ) * 0.15;
                    income = 16700;
                    tax= tax + income * 0.1;
                }
                else tax = income * 0.1;
            } break;
            case 2:{
                if( income > 8350 ){
                    if( income > 33950 ){
                        if( income > 68525 ){
                            if( income > 104425 ){
                                if( income > 186475 ){
                                    tax = (income - 186475 ) * 0.35;
                                    income = 186475;
                                }
                                tax = tax + ( income - 104425) * 0.33;
                                income = 104425;
                            }
                            tax = tax + ( income - 68525 ) * 0.28;
                            income = 68525;
                        }
                        tax = tax + ( income - 33950 ) * 0.25;
                        income = 33950;
                    }
                    tax = tax + ( income - 8350 ) * 0.15;
                    income = 8350;
                    tax= tax + income * 0.1;
                }
                else tax = income * 0.1;
            } break;
            case 3:{
                if( income > 11950 ){
                    if( income > 45500 ){
                        if( income > 117450 ){
                            if( income > 190200 ){
                                if( income > 372950 ){
                                    tax = ( income - 372950 ) * 0.35;
                                    income = 372950;
                                }
                                tax = tax + ( income - 190200 ) * 0.33;
                                income = 190200;
                            }
                            tax = tax + ( income - 117450 ) * 0.28;
                            income = 117450;
                        }
                        tax = tax + ( income - 45500 ) * 0.25;
                        income = 45500;
                    }
                    tax = tax + ( income - 11950 ) * 0.15;
                    income = 11950;
                    tax = tax + income * 0.1;
                }
                else tax = income * 0.1;
            } break;
        }
        System.out.println("Tax is " + tax);
    }
}
