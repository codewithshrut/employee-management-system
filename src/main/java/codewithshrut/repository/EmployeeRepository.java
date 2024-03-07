package codewithshrut.repository;

import codewithshrut.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// @Repository - optional one as Spring Data Jpa takes care of classes
// where JpaRepository is added.
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
