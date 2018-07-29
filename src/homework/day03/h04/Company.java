package homework.day03.h04;

public class Company {
    private double salary;          // 월 기본급
    private double income;          // 연 기본급의 합
    private double afterTaxIncome;  // 연 기본급의 세후
    private double bonus;           // 연 보너스 합
    private double afterTaxBonus;   // 연 보너스 세후

    public Company() {
    }

    public Company(double salary) {
        this.salary = salary;
        this.income = salary * 12;
        this.bonus = salary * 4 * 0.2;
        this.afterTaxIncome = this.income * 0.9;
        this.afterTaxBonus = this.bonus * 0.945;
    }

    // 월기본급 리턴
    public double getSalary() {
        return salary;
    }

    // 연기본급 리턴
    public double getIncome() {
        return income;
    }

    // 세후 연봉
    public double getAfterTaxIncome() {
        return afterTaxIncome;
    }

    // 연 보너스 합
    public double getBonus() {
        return bonus;
    }

    // 세후 연보너스
    public double getAfterTaxBonus() {
        return afterTaxBonus;
    }
}
