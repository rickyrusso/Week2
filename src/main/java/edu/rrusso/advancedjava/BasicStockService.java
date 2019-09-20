package edu.rrusso.advancedjava;

import java.math.BigDecimal;

/**
 * This class provides a simple implementation of a StockService to aid in testing
 */
public class BasicStockService implements StockService {
    public StockQuote getQuote(String symbol) {

        if ("MSFT".equals(symbol)) {
            return new StockQuote(symbol, new BigDecimal(100));
        } else if ("APPL".equals(symbol)) {
            return new StockQuote(symbol, new BigDecimal(120));
        } else if ("IBM".equals(symbol)) {
            return new StockQuote(symbol, new BigDecimal(90));
        } else {
            return new StockQuote("", new BigDecimal(0));
        }

    }
}
