package week10;

import java.util.Arrays;
import java.util.Scanner;

public class Question_10_09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Course course = new Course("İngilizce");
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter student's name: ");
            String name = input.nextLine();
            //System.out.println("eklemeden önce "+course.getNumberOfStudents());
            course.addStudent(name);
            System.out.println(Arrays.toString(course.getStudents()));
            //  System.out.println("eklemeden önce "+course.getNumberOfStudents());
        }
        System.out.println(course.getNumberOfStudents());
        System.out.println(course.getCourseName());
        System.out.println(Arrays.toString(course.getStudents()));
        System.out.println("Oh no!Who is leaving the course? ");
        for (int i = 0; i < 2; i++) {
            String name=input.nextLine();
            course.dropStudent(name);
            System.out.println(course.getNumberOfStudents());
            System.out.println(course.getCourseName());
            System.out.println(Arrays.toString(course.getStudents()));
        }



    }
}
