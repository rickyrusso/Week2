package edu.rrusso.advancedjava;

/**
 * This class looks up and returns a StockQuote
 */
public class StockTicker {
    private StockService stockService;

    /**
     * Create a new <CODE>StockTicker</CODE> instance
     *
     * @param stockService implementation used to get actual stock data
     */
    public StockTicker(StockService stockService){
        this.stockService = stockService;
    }

    /**
     * Gets the <CODE>StockQuote</CODE> for the specified Symbol
     *
     * @param symbol  used to get the StockQuote
     */
    public StockQuote getStockQuote(String symbol){
        return stockService.getQuote(symbol);
    }
}
