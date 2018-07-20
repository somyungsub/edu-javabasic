package day03.practice;

public class Vehicle {
    private int maxWeight;      // 최대 적재 중량
    private double oilTankSize;    // 주유 탱크 크기 (리터)
    private double efficiency;  // 연비
    
    public Vehicle(int maxWeight, double oilTankSize, double efficiency) {
        this.maxWeight = maxWeight;
        this.oilTankSize = oilTankSize;
        this.efficiency = efficiency;
    }
    
    public double getEfficiency() {
        return efficiency;
    }

    public void setEfficiency(double efficiency) {
        this.efficiency = efficiency;
    } 
    
    public int getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(int maxWeight) {
        this.maxWeight = maxWeight;
    }

    public double getOilTankSize() {
        return oilTankSize;
    }

    public void setOilTankSize(double oilTankSize) {

        this.oilTankSize = oilTankSize;
    }

    public String toString() {
        return maxWeight + "\t\t" + oilTankSize;
    }
}

