package org.example;

public class BonusService {
    private double minimumValue;
    private double maximumValue;

    public BonusService(double minimumValue, double maximumValue)
    {
        this.minimumValue = minimumValue;
        this.maximumValue = maximumValue;
    }

    public double getMinimumValue() {
        return minimumValue;
    }

    public double getMaximumValue() {
        return maximumValue;
    }

    public double calculateCorrectBonus(double bonusSum)
    {
        return 0;
    }

}
