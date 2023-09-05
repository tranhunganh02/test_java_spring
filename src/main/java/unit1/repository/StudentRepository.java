package unit1.repository;

import java.util.List;

import unit1.model.student;

public interface StudentRepository {
     
     List<student> getAllStudent();

     student getStudentByName(String name);

}
