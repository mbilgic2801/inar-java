package week11;

import week10.MyDate_10_14;

public class Question_11_02 {
    public static void main(String[] args) {
        Person gurol=new Person("Gurol","Istanbul","99999999","gurol@inar.com");
        System.out.println(gurol.toString());
        Student nafiz=new Student("Nafiz","Ankara","33333333","nafiz@gmai.com","0");
        System.out.println(nafiz.toString());
        Employee recai=new Employee("Recai","İstanbul","66666666","recai@gmail.com",6000,910,new MyDate_10_14());
        System.out.println(recai.toString());
        Faculty serhat=new Faculty("Serhat","Texas, Dallas","41333333","serhat@inar.com",50000,101,new MyDate_10_14(),"10am to 6pm","manager");
        System.out.println(serhat.toString());
        Staff elon=new Staff("Elon","California","2030222220","elonmusk@gmail.com",6005000,12,new MyDate_10_14(),"CEO");
        System.out.println(elon.toString());
    }
}
