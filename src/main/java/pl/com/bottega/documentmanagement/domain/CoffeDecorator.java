package pl.com.bottega.documentmanagement.domain;

/**
 * Created by Nizari on 21.08.2016.
 */
public abstract class CoffeDecorator implements Coffe {

    protected Coffe coffe;

    CoffeDecorator(Coffe coffe){
        this.coffe = coffe;
    }
}
