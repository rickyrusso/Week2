package edu.rrusso.advancedjava;

import java.math.BigDecimal;

public class StockQuote {
    private String symbol;
    private BigDecimal price;

    /**
     *  Create a new  StockQuote instance
     * @param symbol the stock symbol
     * @param price the price
     */
    public StockQuote(String symbol, BigDecimal price){
        this.symbol = symbol;
        this.price = price;
    }

    /**
     * @return the stock symbol
     */
    public String getStockSymbol() {
        return symbol;
    }

    /**
     * @return The price of the stock.
     */
    public BigDecimal getStockPrice() {
        return price;
    }
}
