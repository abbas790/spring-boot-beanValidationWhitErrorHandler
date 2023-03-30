package af.mcitp.SpringBootProject.main.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import af.mcitp.SpringBootProject.main.Model.Employee;


@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long> {

}