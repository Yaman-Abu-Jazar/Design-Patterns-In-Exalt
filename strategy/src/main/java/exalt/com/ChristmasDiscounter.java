package exalt.com;

import java.math.BigDecimal;

public class ChristmasDiscounter implements Discounter {
    // apply 10% discount in Christmas
    @Override
    public BigDecimal applyDiscount(final BigDecimal amount){
        return amount.multiply(BigDecimal.valueOf(0.9));    
    }
    
}
