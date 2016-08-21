package pl.com.bottega.documentmanagement.infrastructure;

import org.springframework.stereotype.Component;
import pl.com.bottega.documentmanagement.domain.PrintCostCalculator;

import java.math.BigDecimal;

/**
 * Created by Nizari on 20.08.2016.
 */
@Component
public class ColorPrintCostCalculator implements PrintCostCalculator {

    @Override
    public BigDecimal cost(int pagesCount) {
        return new BigDecimal(pagesCount * 0.10);
    }
}