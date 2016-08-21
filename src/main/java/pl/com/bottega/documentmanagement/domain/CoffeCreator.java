package pl.com.bottega.documentmanagement.domain;

/**
 * Created by Nizari on 21.08.2016.
 */
public class CoffeCreator {

    public static void main(String[] args) {
        Coffe coffe = new CoffeWithMilk(new MediumCoffe());
        System.out.println(coffe.name() + " - " + coffe.cost() + " PLN");
    }
}
