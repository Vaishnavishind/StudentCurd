package curd;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	
	@Autowired
	StudentService studentService;
	
	@PostMapping("stu")
	public Student saveStudent(@RequestBody Student student)
	{
		return studentService.saveStudent(student);
		
	}
	
	@GetMapping("student/{id}")
	public Optional<Student>findById(@PathVariable int id)
	{
		return studentService.findById(id);
		
	}
	
	@DeleteMapping("delete/{id}")
	public void deleteById(@PathVariable int id)
	{
		studentService.deleteById(id);
	}
	
	@GetMapping("find/{id}")
	
	public List<Student>getById(@PathVariable int id)
	{
		return studentService.getAllStudents(id);
		
	}
	

	
}
