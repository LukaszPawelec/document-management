package pl.com.bottega.documentmanagement.domain.Repositories;

import pl.com.bottega.documentmanagement.infrastructure.DocumentCriteria;
import pl.com.bottega.documentmanagement.domain.Document;
import pl.com.bottega.documentmanagement.domain.DocumentNumber;

/**
 * Created by Nizari on 12.06.2016.
 */
public interface DocumentRepository {

    void save (Document document);

    Document load(DocumentNumber documentNumber);

    Iterable<Document> find(DocumentCriteria documentCriteria);
}
