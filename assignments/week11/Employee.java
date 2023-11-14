package week11;

import week10.MyDate_10_14;

public class Employee extends Person{
    public double salary;
    public double office;
    public MyDate_10_14 date;

    public Employee() {
    }

    public Employee(String name, String address, String phoneNumber, String eMail, double salary, double office, MyDate_10_14 date) {
        super(name, address, phoneNumber, eMail);
        this.salary = salary;
        this.office = office;
        this.date = date;
    }
    public String toString(){
        return  "   _Employee_\n"+
                "Name: "+name+"\n"+
                "Address: "+address+"\n"+
                "Phone number: "+phoneNumber+"\n"+
                "Email address: "+eMail+"\n"+
                "office: "+office+"\n"+
                "salary: "+salary+"\n"+
                "hiredDate: "+date.toString();
    }
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getOffice() {
        return office;
    }

    public void setOffice(double office) {
        this.office = office;
    }

    public MyDate_10_14 getDate() {
        return date;
    }

    public void setDate(MyDate_10_14 date) {
        this.date = date;
    }
}
