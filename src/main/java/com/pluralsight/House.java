package com.pluralsight;

import java.math.BigDecimal;

public class House extends Asset{
    private String address;
    private int condition;
    private int squareFoot;
    private int lotSize;

    public House(String description, String dataAcquired, BigDecimal originalCost) {
        super(description, dataAcquired, originalCost);
    }

    public House(String description, String dataAcquired, BigDecimal originalCost, String address, int condition, int squareFoot, int lotSize) {
        super(description, dataAcquired, originalCost);
        this.address = address;
        this.condition = condition;
        this.squareFoot = squareFoot;
        this.lotSize = lotSize;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCondition() {
        return condition;
    }

    public void setCondition(int condition) {
        this.condition = condition;
    }

    public int getSquareFoot() {
        return squareFoot;
    }

    public void setSquareFoot(int squareFoot) {
        this.squareFoot = squareFoot;
    }

    public double getLotSize() {
        return lotSize * 0.25;
    }

    public void setLotSize(int lotSize) {
        this.lotSize = lotSize;
    }

    @Override
    public BigDecimal getValue() {
        if (getCondition() == 1){
            return BigDecimal.valueOf((getSquareFoot() * 180.00) + (getLotSize()));
        }
        else if (getCondition() == 2){
            return BigDecimal.valueOf((getSquareFoot() * 130.00) + (getLotSize()));
        }
        else if(getCondition() == 3){
            return BigDecimal.valueOf((getSquareFoot() * 90.00) + (getLotSize()));
        }
        else if (getCondition() == 4){
            return BigDecimal.valueOf((getSquareFoot() * 80.00) + (getLotSize()));
        }
        else
    }
}
