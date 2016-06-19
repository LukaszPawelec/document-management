package pl.com.bottega.documentmanagement.application;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pl.com.bottega.documentmanagement.api.DocumentFlowProcess;
import pl.com.bottega.documentmanagement.api.UserManager;
import pl.com.bottega.documentmanagement.domain.DocumentNumber;
import pl.com.bottega.documentmanagement.domain.EmployeeId;

/**
 * Created by Nizari on 18.06.2016.
 */
public class CreateDocumentProcess {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(new String[] {"application.xml"}); //przekazujemy kontrole stringowi nad tworzeniem calego grafu obiektu
        UserManager userManager = applicationContext.getBean("userManager", UserManager.class);
        userManager.signup("Janusz", "12345", new EmployeeId(1l));
        userManager.login("Janusz", "12345");
        DocumentFlowProcess documentFlowProcess = applicationContext.getBean("documentFlowProcess", DocumentFlowProcess.class);
        DocumentNumber number = documentFlowProcess.create("My first doc", "Ple ple ple");
        System.out.println(number);
    }
}