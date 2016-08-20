package pl.com.bottega.documentmanagement.infrastructure;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;
import pl.com.bottega.documentmanagement.api.DocumentCriteria;
import pl.com.bottega.documentmanagement.api.DocumentSearchResults;
import pl.com.bottega.documentmanagement.domain.DocumentStatus;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by Nizari on 31.07.2016.
 */
@RunWith(SpringRunner.class)
@ContextConfiguration("/application.xml")
@TestPropertySource({"/jdbc-test.properties", "/hibernate-test.properties"})
public class JPADocumentCatalogTest {

    @Autowired
    private JPADocumentsCatalog jpaDocumentsCatalog;

    @Test
    public void shouldFindDocumentByStatus() {
        //given


        //when
        DocumentCriteria documentCriteria = new DocumentCriteria();
        documentCriteria.setStatus(DocumentStatus.DRAFT);
        DocumentSearchResults results = jpaDocumentsCatalog.find(documentCriteria);

        //then
        assertEquals(new Long(0), results.getTotalPages());

    }

}
