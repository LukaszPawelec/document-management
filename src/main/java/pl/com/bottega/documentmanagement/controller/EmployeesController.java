package pl.com.bottega.documentmanagement.controller;

import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.com.bottega.documentmanagement.api.SignupResultDto;
import pl.com.bottega.documentmanagement.api.UserManager;
import pl.com.bottega.documentmanagement.domain.EmployeeId;

/**
 * Created by Nizari on 03.07.2016.
 */
@RestController("/employees")
public class EmployeesController {

    private UserManager userManager;

    public EmployeesController(UserManager userManager) {
        this.userManager = userManager;
    }

    @PutMapping
    public SignupResultDto signup(SignupRequest signupRequest) {
        EmployeeId employeeId = new EmployeeId(signupRequest.getEmployeeId());
        return userManager.signup(signupRequest.getLogin(), signupRequest.getPassword(), employeeId);
    }
}
