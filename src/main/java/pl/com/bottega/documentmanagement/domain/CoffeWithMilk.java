package pl.com.bottega.documentmanagement.domain;

import java.math.BigDecimal;

/**
 * Created by Nizari on 21.08.2016.
 */
public class CoffeWithMilk extends CoffeDecorator {

    CoffeWithMilk(Coffe coffe){
        super(coffe);
    }

    @Override
    public String name() {
        return coffe.name() + " with milk";
    }

    @Override
    public BigDecimal cost() {
        return coffe.cost().add(new BigDecimal(5));
    }
}
