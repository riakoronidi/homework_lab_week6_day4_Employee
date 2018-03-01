import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void before(){
        developer = new Developer("Developer", "2B", 80.00);

    }

    @Test
    public void canReturnSalary(){
        assertEquals(80.00, developer.getSalary(),0.01);
    }

    @Test
    public void canRaiseSalary(){
        assertEquals(90.00, developer.raiseSalary(10),0.01);
    }

    @Test
    public void canHaveBonus(){
        assertEquals(80.80, developer.payBonus(),0.01);
    }
}
