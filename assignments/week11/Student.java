package week11;

public class Student extends Person{
    public String status;

    public Student() {
    }

    public Student(String name, String address, String phoneNumber, String eMail, String status) {
        super(name, address, phoneNumber, eMail);
        this.status = status;
    }
    public String toString(){
        return  "   _Person_\n"+
                "Name: "+name+"\n"+
                "Address: "+address+"\n"+
                "Phone number: "+phoneNumber+"\n"+
                "Email address: "+eMail+"\n"+
                "classStatus: "+status;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
