package org.vistula.customer;

import org.junit.Test;

public class CustomerTest {
    @Test
    public void shouldCheckIfAdult(){
       Customer Zbyszek = new Customer();
       Zbyszek.setAge(18);
       assert Zbyszek.isCustomerAnAdult()==true;

    }
}
