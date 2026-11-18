package com.pluralsight;

import java.math.BigDecimal;

public class Vehicle extends Asset{
    private String makeModel;
    private int odometer;

    public Vehicle(String description, String dataAcquired, BigDecimal originalCost) {
        super(description, dataAcquired, originalCost);
    }

    public Vehicle(String description, String dataAcquired, BigDecimal originalCost, String makeModel, int odometer) {
        super(description, dataAcquired, originalCost);
        this.makeModel = makeModel;
        this.odometer = odometer;
    }

    public String getMakeModel() {
        return makeModel;
    }

    public void setMakeModel(String makeModel) {
        this.makeModel = makeModel;
    }

    public int getOdometer() {
        return odometer;
    }

    public void setOdometer(int odometer) {
        this.odometer = odometer;
    }
}
