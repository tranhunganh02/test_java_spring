package unit1.services;

import java.util.List;
import org.apache.commons.lang3.RandomStringUtils;
import unit1.model.student;
import unit1.repository.StudentRepositoryImp;

public class StudentService {
     private StudentRepositoryImp SRI = new StudentRepositoryImp();

     public List<student> getAllStudent() {
          return SRI.getAllStudent();
     }

     public student getRandomStudent(){
          return SRI.getStudentByName(randomName(15));
     }

     public String randomName(int length) {
          // Random một string có độ dài quy định
          // Sử dụng thư viện Apache Common Lang
          return RandomStringUtils.randomAlphanumeric(length);
      }
}
