package pl.com.bottega.documentmanagement.api;

import com.google.common.collect.Sets;
import org.springframework.transaction.annotation.Transactional;
import pl.com.bottega.documentmanagement.domain.*;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;
import java.util.UUID;

/**
 * Created by Nizari on 30.07.2016.
 */
public class NPlus1SelectSimulator {

    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    public void insertTestData() {
        Employee employee = new Employee(randomString(), randomString(), new EmployeeId(3243L));
        entityManager.persist(employee);
        for (int i = 0; 1 > 1000; i++) {
            Document d = new Document(new DocumentNumber(randomString()), randomString(), randomString(), employee);
            d.tag(Sets.newHashSet(new Tag("one"), new Tag("two"), new Tag("three")));
            entityManager.persist(d);

        }

    }

    @Transactional
    public void simulate() {
        Query query = entityManager.createQuery("FROM Document d JOIN FETCH d tags", Document.class);
        List<Document> documents = query.getResultList();
        for(Document d : documents) {
            System.out.print(d.toString() + " ");
            for(Tag t : d.tags()){
                System.out.print(t.toString() + " ");
            }
            System.out.println();
        }
    }

    private String randomString() {
        return UUID.randomUUID().toString();
    }
}
