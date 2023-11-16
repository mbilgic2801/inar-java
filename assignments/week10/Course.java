package week10;

public class Course {
    private String courseName;
    private String[] students= new String[1];
    private int numberOfStudents;
    public Course(String courseName){
        this.courseName=courseName;
    }
    public void addStudent(String student){
        enlargeSize();
        students[numberOfStudents]=student;
        numberOfStudents++;
    }
    public String[] getStudents(){
        return students;
    }
    public int getNumberOfStudents(){
        return numberOfStudents;
    }
    public String getCourseName(){
        return courseName;
    }
    public void dropStudent(String student){
        if(studentExist(student)) {
            String[] temp = new String[numberOfStudents - 1];
            for (int i = 0, j = 0, k = 0; i < students.length; i++, j++) {
                if (!students[i].equals(student)) {
                    temp[k] = students[j];
                    k++;
                }

            }
            students = temp;
            numberOfStudents--;
        }
        else{
            System.out.println("The student you entered is not on this course");
        }
    }

    private boolean studentExist(String student) {

        for (int i = 0; i < students.length; i++) {
            if(students[i].equals(student)){
                return true;
            }
        }
        return false;
    }

    private void enlargeSize(){
        if(numberOfStudents==students.length){
            String[] temp=new String[numberOfStudents+1];
            for (int i = 0; i < numberOfStudents; i++) {
                temp[i]=students[i];

            }
            students=temp;

        }

    }
}
