package week11;

import week10.MyDate_10_14;

public class Staff extends Employee{
     public String title;

    public Staff(String name, String address, String phoneNumber, String eMail, double salary, double office, MyDate_10_14 date, String title) {
        super(name, address, phoneNumber, eMail, salary, office, date);
        this.title = title;
    }

    public Staff() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String toString(){
        return  "   _Staff_\n"+
                "Name: "+name+"\n"+
                "Address: "+address+"\n"+
                "Phone number: "+phoneNumber+"\n"+
                "Email address: "+eMail+"\n"+
                "office: "+office+"\n"+
                "salary: "+salary+"\n"+
                "hiredDate: "+date.toString()+"\n"+
                "title: '"+title+"'";
    }
}
