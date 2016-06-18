package pl.com.bottega.documentmanagement.api;

import com.google.common.base.Charsets;
import com.google.common.hash.Hashing;
import pl.com.bottega.documentmanagement.domain.Employee;
import pl.com.bottega.documentmanagement.domain.EmployeeId;
import pl.com.bottega.documentmanagement.domain.repositories.EmployeeRepository;

/**
 * Created by maciuch on 12.06.16.
 */
public class UserManager {

    private EmployeeRepository employeeRepository;

    public SignupResultDto signup(String login, String password, EmployeeId employeeId) {
        Employee employee = employeeRepository.findByEmployeeId(employeeId);
        if(employee == null)
            return setupNewAccount(login, password, employeeId);
        else if (employee.isRegistered())
            return failed("Employee is already registered");
        else {
            employee.setupAccount(login, password);
            employeeRepository.save(employee);
            return success();
        }
    }


    private SignupResultDto setupNewAccount(String login, String password, EmployeeId employeeId) {
        if(employeeRepository.isLoginOccupied(login))
            return failed("Login is occupied");
        else {
            Employee employee = new Employee(login, hashedPassword(password), employeeId);
            employeeRepository.save(employee);
            return success();
        }
    }

    private SignupResultDto failed(String reason) {
        return new SignupResultDto(reason);
    }

    private SignupResultDto success() {
        return new SignupResultDto();
    }

    private String hashedPassword(String password) {
        return Hashing.sha1().hashString(password,Charsets.UTF_8).toString();
    }

    public void login(String login, String password) {

    }

    public Employee currentEmployee() {
        return null;
    }

}