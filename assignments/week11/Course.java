package week11;

import java.util.ArrayList;

public class Course {
    private String courseName;
    private ArrayList<String> students1=new ArrayList<>();
   // private String[] students= new String[1];
   // private int numberOfStudents;
    public Course(String courseName){
        this.courseName=courseName;
    }
    public void addStudent(String student){
      //  enlargeSize();
      //  students[numberOfStudents]=student;
      //  numberOfStudents++;
      //  System.out.println("After");
        students1.add(student);
        System.out.println("After adding student to the course..");
        System.out.println(this.toString());
        System.out.println("Number of students: "+students1.size());

    }
    public ArrayList<String> getStudents(){
        return students1;
    }
    public int getNumberOfStudents(){
        return students1.size();
    }
    public String getCourseName(){
        return courseName;
    }
    public void dropStudent(String student){

        if(students1.contains(student)){
            students1.remove(students1.indexOf(student));
            System.out.println("After dropping student from the course..");
            System.out.println(this.toString());
            System.out.println("Number of students: "+students1.size());
        }
        else{
            System.out.println("The student you entered is not on this course");
        }

    }

    @Override
    public String toString() {
        String str="";
        for (int i = 0; i < students1.size(); i++) {
            str+=students1.get(i)+" - ";
        }
        return str;
    }

    private boolean studentExist(String student) {

        return students1.contains(student);
    }


}
