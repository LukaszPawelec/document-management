package pl.com.bottega.documentmanagement.domain;

import java.math.BigDecimal;

/**
 * Created by Nizari on 21.08.2016.
 */
public class LargeCoffe implements Coffe{

    @Override
    public String name() {
        return "Large coffe";
    }

    @Override
    public BigDecimal cost() {
        return new BigDecimal(20);
    }
}