import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void before(){
        director = new Director("Director1", "1AA", 200.00, "Glasgow", 10.00);
    }

    @Test
    public void canReturnSalary(){
        assertEquals(200.00, director.getSalary(),0.01);
    }

    @Test
    public void canRaiseSalary(){
        assertEquals(210.00, director.raiseSalary(10),0.01);
    }

    @Test
    public void canHaveBonus(){
        assertEquals(202.00, director.payBonus(),0.01);
    }

}
