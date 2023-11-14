package week11;

public class Person {
    public String name;
    public String address;
    public String phoneNumber;
    public String eMail;
    public String toString(){
        return  "   _Person_\n"+
                "Name: "+name+"\n"+
                "Address: "+address+"\n"+
                "Phone number: "+phoneNumber+"\n"+
                "Email address: "+eMail;
    }

    public Person() {
    }

    public Person(String name, String address, String phoneNumber, String eMail) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.eMail = eMail;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }
}
