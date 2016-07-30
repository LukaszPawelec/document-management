package pl.com.bottega.documentmanagement.api;

import pl.com.bottega.documentmanagement.domain.DocumentNumber;
import pl.com.bottega.documentmanagement.infrastructure.DocumentCriteria;

/**
 * Created by maciuch on 10.07.16.
 */
public interface DocumentsCatalog {
    DocumentDto get(DocumentNumber documentNumber);

    Iterable<DocumentDto> find(pl.com.bottega.documentmanagement.api.DocumentCriteria documentCriteria);
}
