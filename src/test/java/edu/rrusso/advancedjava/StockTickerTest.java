package edu.rrusso.advancedjava;

import org.junit.Test;
import java.math.BigDecimal;
import static org.junit.Assert.*;
import org.mockito.Mockito;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.when;

public class StockTickerTest {
    private StockTicker stockTicker;

    /**
     * This method verifies that the a StockQuote can be correctly returned
     */
    @Test
    public void getStockQuote() {
        StockService stockServiceMock = Mockito.mock(StockService.class);

        String expectedStockSymbol = "APPLxx";
        BigDecimal expectedPrice = new BigDecimal(120);

        when(stockServiceMock.getQuote(any(String.class))).thenReturn(new StockQuote(expectedStockSymbol, expectedPrice));

        stockTicker = new StockTicker(stockServiceMock);

        StockQuote stockQuote = stockTicker.getStockQuote(expectedStockSymbol);

        assertSame("Should be true", stockQuote.getStockPrice(), expectedPrice);
    }
}
