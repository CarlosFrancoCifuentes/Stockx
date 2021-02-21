package edu.pingpong.stockx;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import edu.pingpong.stockx.item.Ask;

public class AskTest {
    
    @Test
    public void toStringTest(){
        Ask ask = new Ask("Size", 200);
        assertEquals("\n\t\t"+ "Size" +"\t\t"+ "200", ask.toString());
    }
}
