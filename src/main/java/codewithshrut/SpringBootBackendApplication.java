package codewithshrut;


import codewithshrut.model.Employee;
import codewithshrut.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootBackendApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootBackendApplication.class, args);
    }

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public void run(String... args) throws Exception {
//        Employee employee = new Employee();
//        employee.setFirstName("Bapu");
//        employee.setLastName("Trivikram");
//        employee.setEmailId("bapu108@gmail.com");
//        employeeRepository.save(employee);
//
//        Employee employee1 = new Employee();
//        employee1.setFirstName("Shrut");
//        employee1.setLastName("Dorugade");
//        employee1.setEmailId("shrut@gmail.com");
//        employeeRepository.save(employee1);
    }
}
