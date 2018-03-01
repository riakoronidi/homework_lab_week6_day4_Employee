import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    DatabaseAdmin databaseAdmin;

    @Before
    public void before(){
        databaseAdmin = new DatabaseAdmin("DB admin", "3C", 85.00);

    }

    @Test
    public void canReturnSalary(){
        assertEquals(85.00, databaseAdmin.getSalary(),0.01);
    }

    @Test
    public void canRaiseSalary(){
        assertEquals(95.00, databaseAdmin.raiseSalary(10),0.01);
    }

    @Test
    public void canHaveBonus(){
        assertEquals(85.85, databaseAdmin.payBonus(),0.01);
    }
}
