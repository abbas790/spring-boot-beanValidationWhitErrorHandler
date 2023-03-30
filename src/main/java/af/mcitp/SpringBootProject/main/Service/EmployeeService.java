package af.mcitp.SpringBootProject.main.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import af.mcitp.SpringBootProject.main.Model.Employee;
import af.mcitp.SpringBootProject.main.Repository.EmployeeRepository;

@Service
public class EmployeeService {
	@Autowired
	EmployeeRepository em;
	
	public Employee saveOrUpdate(Employee employee) {
		   return em.save(employee);
		}
	
	public void Delete(long id) {
		em.deleteById(id);
	}
	public Optional<Employee> Find(long id) {
		return em.findById(id);
				
	}
	
	public List<Employee> get(){
		return em.findAll();
	}

}
