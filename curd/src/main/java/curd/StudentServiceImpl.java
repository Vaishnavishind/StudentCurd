package curd;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService{

	
	@Autowired
	StudentRepository studentRepository;
	
	@Override
	public Student saveStudent(Student student) {
		// TODO Auto-generated method stub
		return studentRepository.save(student);
	}

	@Override
	public Optional<Student> findById(int id) {
		// TODO Auto-generated method stub
		return studentRepository.findById(id);
	}

	@Override
	public void deleteById(int id) {
		
		studentRepository.deleteById(id);
	}

	@Override
	public List<Student> getAllStudents(int id) {
		// TODO Auto-generated method stub
		return studentRepository.findAll();
	}

	

	
	

	

}
