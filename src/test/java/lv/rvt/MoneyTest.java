package lv.rvt;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class MoneyTest {

    @Test
    public void PlusMethod() {
        Money money1 = new Money(4,2);
        Money money2 = new Money(10, 12);
        Money money3 = money1.plus(money2);

        assertTrue(money2.euros() == 5);
        assertTrue(money3.cents() == 6);
    }

    @Test
    public void LessThanMethod() {

    }

    @Test
    public void SubstractMethod() {

    }
}
