package pl.com.bottega.documentmanagement.domain;

import java.math.BigDecimal;

/**
 * Created by Nizari on 21.08.2016.
 */
public class MediumCoffe implements Coffe {

    @Override
    public String name() {
        return "Medium coffe";
    }

    @Override
    public BigDecimal cost() {
        return new BigDecimal(15);
    }
}