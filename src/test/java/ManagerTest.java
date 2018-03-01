import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void before(){
        manager = new Manager("Manager1", "1A", 100.00, "Glasgow");
    }

    @Test
    public void canReturnSalary(){
        assertEquals(100.00, manager.getSalary(),0.01);
    }

    @Test
    public void canReturnName(){
        assertEquals("Manager1", manager.getName());
    }

    @Test
    public void canChangeName(){
        manager.setName("Ria");
        assertEquals("Ria", manager.getName());
    }

    @Test
    public void canNotEnterNullName(){
        manager.setName(null);
        assertEquals("You need to enter a name", manager.getName());
    }

    @Test
    public void canRaiseSalary(){
        assertEquals(110.00, manager.raiseSalary(10),0.01);
    }

    @Test
    public void canNotHaveNegativeValue(){
        assertEquals(110.00, manager.raiseSalary(-10),0.01);
    }

    @Test
    public void canHaveBonus(){
        assertEquals(101.00, manager.payBonus(),0.01);
    }

}
