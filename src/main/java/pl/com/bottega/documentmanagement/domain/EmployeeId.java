package pl.com.bottega.documentmanagement.domain;

import javax.persistence.Embeddable;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by maciuch on 12.06.16.
 */
@Embeddable
public class EmployeeId {

    @Id
    @GeneratedValue
    private Long id;

    private EmployeeId() {}

    public EmployeeId(long id) {
        this.id = id;
    }
}