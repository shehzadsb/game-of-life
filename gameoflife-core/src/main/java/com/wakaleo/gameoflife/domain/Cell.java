package com.wakaleo.gameoflife.domain;

public enum Cell {
    LIVE_CELL("*"), DEAD_CELL(".");

    private String symbol;
    
    //constructor
    private Cell(final String initialSymbol) {
        this.symbol = initialSymbol;
    }

    
    @Override
    public String toString() {
        return symbol;
    }

    static Cell fromSymbol(final String symbol) {
        Cell cellRepresentedBySymbol = null;
        for (Cell cell : Cell.values()) {
            if (cell.symbol.equals(symbol)) {
                cellRepresentedBySymbol = cell;
                break;
            }
        }
        return cellRepresentedBySymbol;
    }

    public String getSymbol() {
        return symbol;
    }
    public String getString()
    {
    	String str = "abc";
    	return str;
    }
    public String getString2()
    {
    	String str = "abc";
    	return str;
    }
}
