package pl.com.bottega.documentmanagement.api;

import org.springframework.stereotype.Service;
import pl.com.bottega.documentmanagement.domain.Employee;
import pl.com.bottega.documentmanagement.domain.EmployeeId;

/**
 * Created by maciuch on 31.07.16.
 */
@Service
public class EmployeeFactory {

    private String INITIAL_ROLE = "STAFF";

    private PasswordHasher passwordHasher;

    public EmployeeFactory(PasswordHasher passwordHasher) {
        this.passwordHasher = passwordHasher;
    }

    public Employee create(String login, String password, EmployeeId employeeId) {
        Employee employee = new Employee(login, passwordHasher.hashedPassword(password), employeeId);
        return employee;
    }

}
