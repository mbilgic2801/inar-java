package week11;

import week10.MyDate_10_14;

public class Faculty extends Employee{
     public String officeHours;
     public String rank;

     public Faculty() {
     }

     public Faculty(String name, String address, String phoneNumber, String eMail, double salary, double office, MyDate_10_14 date, String officeHours, String rank) {
          super(name, address, phoneNumber, eMail, salary, office, date);
          this.officeHours = officeHours;
          this.rank = rank;
     }
     public String toString(){
          return  "   _Employee_\n"+
                  "Name: "+name+"\n"+
                  "Address: "+address+"\n"+
                  "Phone number: "+phoneNumber+"\n"+
                  "Email address: "+eMail+"\n"+
                  "office: "+office+"\n"+
                  "salary: "+salary+"\n"+
                  "hiredDate: "+date.toString()+"\n"+
                  "officeHours: '"+officeHours+"'\n"+
                  "rank: '"+rank+"'";
     }
     public String getOfficeHours() {
          return officeHours;
     }

     public void setOfficeHours(String officeHours) {
          this.officeHours = officeHours;
     }

     public String getRank() {
          return rank;
     }

     public void setRank(String rank) {
          this.rank = rank;
     }
}
