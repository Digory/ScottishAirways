import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class CustomerTest {

        Customer customer;
        @Before
        public void before(){
            customer = new Customer("Mike", 1);
        }

        @Test
        public void hasName(){
            assertEquals("Mike", customer.getName());
        }

        @Test
    public void hasID(){
            assertEquals(1, customer.getID());
        }

}
