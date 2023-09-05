package unit1;

import java.util.List;

import unit1.model.student;
import unit1.services.StudentService;

public class Main {
    public static void main(String[] args) {
        StudentService SS =  new StudentService();

        List<student> STL = SS.getAllStudent();

        System.out.println(SS.getAllStudent()+ "|||" + STL.size() + "\n" + "Random name: "+SS.getRandomStudent());
    }
}