package bootJPA.one.data;

import org.springframework.data.jpa.repository.JpaRepository;
import bootJPA.one.model.Employee;
import bootJPA.one.model.Employee;

/**
 * @author Renjith
 *
 */
public interface EmployeeRepository extends JpaRepository<Employee
, Long> {

}
