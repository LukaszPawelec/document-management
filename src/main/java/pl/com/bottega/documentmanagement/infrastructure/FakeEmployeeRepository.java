package pl.com.bottega.documentmanagement.infrastructure;

import org.springframework.stereotype.Repository;
import pl.com.bottega.documentmanagement.domain.Employee;
import pl.com.bottega.documentmanagement.domain.EmployeeId;
import pl.com.bottega.documentmanagement.domain.repositories.EmployeeRepository;

/**
 * Created by Nizari on 18.06.2016.
 */
@Repository
public class FakeEmployeeRepository implements EmployeeRepository{

    @Override
    public void save(Employee employee) {
        System.out.println("Save");
    }

    @Override
    public Employee findByEmployeeId(EmployeeId employeeId) {
        System.out.println("findBy");
        return null;
    }

    @Override
    public boolean isLoginOccupied(String login) {
        System.out.println("isLogin");
        return false;
    }
}
