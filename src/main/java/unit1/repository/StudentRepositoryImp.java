package unit1.repository;

import java.util.ArrayList;
import java.util.List;

import unit1.model.student;

public class StudentRepositoryImp implements StudentRepository{
     @Override
     public List<student> getAllStudent(){
          List<student> studentsList = new ArrayList<>();
          studentsList.add(new student(1, "ha", "123"));
          return studentsList; 
     }
     @Override
     public student getStudentByName(String name){
          return new student(name);
     }
}
