package edu.rrusso.advancedjava;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class BasicStockServiceTest {

    @Test
    public void getQuote() {
        BasicStockService basicStockService = new BasicStockService();
        StockQuote stockQuote = basicStockService.getQuote("APPL");

        assertEquals("Test Stock Price Value", stockQuote.getStockPrice(), new BigDecimal(120));
    }
}