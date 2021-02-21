package edu.pingpong.stockx;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import edu.pingpong.stockx.item.Ask;

public class AskTest {
    
    @Test
    public void toStringTest(){
        Ask sneaker = new Ask("Estilo", 200);
        assertEquals("Estilo 200", sneaker.toString());
    }
}
