package day03.practice;

public class Truck extends Car {
    
    public Truck(int maxWeight, double oilTankSize, double efficiency) {
        super(maxWeight, oilTankSize, efficiency);
    }

    // 5Kg 증가 당 연비 0.2Km 감소한 값을 리턴한다.
    public double getEfficiency() {
        return super.getEfficiency() - ((getCurWeight() / 5) * 0.2);
    }
    
    // 잔여오일에서 거리에 따른 소모 오일을 차감하여 저장한다.
    public void moving(int distance) {
        double oil = calcOil(distance);
        setRestOil( getRestOil() - oil );
    }
    
    // 소모 오일 = 거리 / 연비
    private double calcOil(int distance) {
        return distance / getEfficiency();
    }
    
    // 오일 소모 1L 당 3000원의 요금을 지불한다.
    // 소수점 이하는 버린다.
    public int getCost(int distance) {
        double oil = calcOil(distance);
        
        return (int)(oil * 3000);
    }
    
    public String toString() {
        return super.toString() + "\t\t" + getEfficiency();
    }
}

