package pl.com.bottega.documentmanagement.domain;

import org.springframework.stereotype.Service;

/**
 * Created by maciuch on 12.06.16.
 */
@Service
public interface DocumentNumberGenerator {

    DocumentNumber generate();

}
