package pl.com.bottega.documentmanagement.api;

import org.springframework.stereotype.Component;
import pl.com.bottega.documentmanagement.domain.Document;
import pl.com.bottega.documentmanagement.domain.DocumentNumberGenerator;


/**
 * Created by maciuch on 17.08.16.
 */
@Component
public class DocumentFactory {

    private DocumentNumberGenerator documentNumberGenerator;

    private UserManager userManager;

    public DocumentFactory(DocumentNumberGenerator documentNumberGenerator, UserManager userManager) {
        this.documentNumberGenerator = documentNumberGenerator;
        this.userManager = userManager;
    }

    public Document create(String title, String content) {
        return new Document(documentNumberGenerator.generate(), title, content, userManager.currentEmployee());
    }

}
