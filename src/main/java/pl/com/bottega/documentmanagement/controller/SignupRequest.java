package pl.com.bottega.documentmanagement.controller;

/**
 * Created by Nizari on 03.07.2016.
 */
public class SignupRequest {

    private String login;
    private String password;
    private long employeeId;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(long employeeId) {
        this.employeeId = employeeId;
    }
}