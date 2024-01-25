package curd;

import java.util.List;
import java.util.Optional;



public interface StudentService {
	
	Student  saveStudent(Student student);
	
	Optional<Student> findById(int id);
	
	void deleteById(int id);
	
	List<Student>getAllStudents(int id);
	
}
