package homework.day03.extendCar;

public class Car extends Vehicle {
    private double restOil;        // 현재 탱크에 남은 오일 
    private int curWeight;      // 현재 적재 중량 (최대 적재중량을 넘어설 수 없다.

    public Car(int maxWeight, double oilTankSize, double efficiency) {
        super(maxWeight, oilTankSize, efficiency);
    }

    // 현재 오일량을 추가
    public void addOil(int oil) {
        if ((restOil + oil) <= getOilTankSize()) {
            restOil += oil;
        }
    }

    // 연비와 주행량 거리에 따라 오일량 감소
    public void moving(int distance) {
        restOil -= (distance / getEfficiency());
    }

    // 현재 적재량에 물건을 추가 (단, 최대적재중량을 넘어서면 안된다)
    public void addWeight(int weight) {
        if ((curWeight + weight) <= getMaxWeight()) {
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

