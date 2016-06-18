package pl.com.bottega.documentmanagement.domain;

import pl.com.bottega.documentmanagement.infrastructure.DocumentDto;

/**
 * Created by Nizari on 12.06.2016.
 */
public class Document {

    public Document(DocumentNumber documentNumber, String content, String title) {

    }

    public void change(String Title, String Content) {

    }

    public void verify(Employee employee) {
    }

    public void publish(Employee employee) {
    }

    public void archive(Employee employee) {
    }

    public void createNewVersion(DocumentNumber documentNumber) {
    }

    public void confirm(Employee confirmator) {
    }

    public void confirm(Employee confirmator, Employee forEmployee) {
    }

    public DocumentDto export() {
        DocumentDto dto = new DocumentDto();
        return dto;
    }

}