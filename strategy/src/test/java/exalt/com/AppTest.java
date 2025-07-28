package exalt.com;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void applyDiscountTest()
    {
        EasterDiscounter ed = new EasterDiscounter();

        BigDecimal actualResult = ed.applyDiscount(BigDecimal.valueOf(100));

        assertEquals(BigDecimal.valueOf(50.0), actualResult);
    }
}
