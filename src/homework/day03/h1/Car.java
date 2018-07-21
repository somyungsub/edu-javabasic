package homework.day03.h1;

public class Car extends Vehicle {
    private double restOil;        // 현재 탱크에 남은 오일 
    private int curWeight;      // 현재 적재 중량 (최대 적재중량을 넘어설 수 없다.
    
    public Car(int maxWeight, double oilTankSize, double efficiency) {
        super(maxWeight, oilTankSize, efficiency);
    }
    
public void addOil(int oil) {
        if( (restOil + oil) <= getOilTankSize() ) {
            restOil += oil;
        }
    }
    public void moving(int distance) {
        restOil -= (distance / getEfficiency());
    }
    public void addWeight(int weight) {
        if( (curWeight + weight) <= getMaxWeight() ) {
            curWeight += weight;
        }
    }
    
    public double getRestOil() {
        return restOil;
    }

    public void setRestOil(double restOil) {
        this.restOil = restOil;
    }

    public int getCurWeight() {
        return curWeight;
    }

    public void setCurWeight(int curWeight) {
        this.curWeight = curWeight;
    }
    
    public String toString() {
        return super.toString() + "\t\t" + restOil + "\t\t" + curWeight;
    }
}

