package pl.com.bottega.documentmanagement.domain;

import java.math.BigDecimal;

/**
 * Created by Nizari on 20.08.2016.
 */
public interface PrintCostCalculator {

    BigDecimal cost(int pagesCount);
}
