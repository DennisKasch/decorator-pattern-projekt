package org.example;

public class BonusService {
    private final double minimumValue = 0;
    private final double maximumValue = 1500;

    public BonusService()
    {
    }

    public double getMinimumValue() {
        return minimumValue;
    }

    public double getMaximumValue() {
        return maximumValue;
    }

    public double calculateCorrectBonus(double bonusSum) {
        if (bonusSum < minimumValue) {
            return minimumValue;
        }
        else if(bonusSum <= maximumValue) {
            return bonusSum;
        }
        else if(bonusSum > maximumValue) {
            return maximumValue;
        }

        return -1;
    }
}
