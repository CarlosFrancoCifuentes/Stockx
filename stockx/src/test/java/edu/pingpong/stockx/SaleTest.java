package edu.pingpong.stockx;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import edu.pingpong.stockx.item.Sale;

public class SaleTest {
    
    @Test
    public void toStringTest(){
        Sale sale = new Sale("Size", 200);
        assertEquals("\n\t\t"+ "Size" +"\t\t"+ "200", sale.toString());
    }
}
