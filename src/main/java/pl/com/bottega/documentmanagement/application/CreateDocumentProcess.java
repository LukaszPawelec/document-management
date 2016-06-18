package pl.com.bottega.documentmanagement.application;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Nizari on 18.06.2016.
 */
public class CreateDocumentProcess {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(new String[] {"application.xml"}); //przekazujemy kontrole stringowi nad tworzeniem calego grafu obiektu




    }
}
