package edu.rrusso.advancedjava;

import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class StockQuoteTest {
    private StockQuote stockQuote;

    @Before
    public void setUp(){
        stockQuote = new StockQuote("APPL", new BigDecimal(120));
    }

    @Test
    public void getStockSymbol() {
        assertEquals("Test for correct symbol", "APPL", stockQuote.getStockSymbol());
    }


    @Test
    public void getStockPrice() {
        assertEquals("test for correct value", new BigDecimal(120), stockQuote.getStockPrice());
    }
}