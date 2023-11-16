package week11;

public class Question_11_05 {
    public static void main(String[] args) {
        Course english=new Course("English");
        english.addStudent("Nisanur Altuntas");
        english.addStudent("Gurkan Serteser");
        english.addStudent("Sinan Cetin");
        english.addStudent("Mehmet Toprak");
        english.addStudent("Sefa Atakul");
        english.addStudent("Musa Denis");
        english.addStudent("Berkan Eris");

        english.dropStudent("Sinan Cetin");
        english.dropStudent("Berkan Eris");
        english.dropStudent("Mehmet Toprak");
    }

}
