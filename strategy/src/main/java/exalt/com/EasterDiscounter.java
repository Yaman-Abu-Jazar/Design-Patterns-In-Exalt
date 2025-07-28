package exalt.com;

import java.math.BigDecimal;

public class EasterDiscounter implements Discounter {
    // apply 50% discount in Easter
    @Override
    public BigDecimal applyDiscount(final BigDecimal amount){
        
        return amount.multiply(BigDecimal.valueOf(0.5));
    }   
}
