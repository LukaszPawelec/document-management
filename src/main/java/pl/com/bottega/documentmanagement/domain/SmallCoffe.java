package pl.com.bottega.documentmanagement.domain;

import java.math.BigDecimal;

/**
 * Created by Nizari on 21.08.2016.
 */
public class SmallCoffe implements Coffe {

    @Override
    public String name() {
        return "Small coffe";
    }

    @Override
    public BigDecimal cost() {
        return new BigDecimal(10);
    }
}