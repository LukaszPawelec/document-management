package pl.com.bottega.documentmanagement.domain;

import java.util.UUID;

/**
 * Created by Nizari on 18.06.2016.
 */
public class ISODocumentRepository implements DocumentNumberGenerator{

    @Override
    public DocumentNumber generate() {
        return new DocumentNumber("ISO" + UUID.randomUUID().toString());
    }
}
