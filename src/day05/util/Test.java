package day05.util;

import java.math.BigDecimal;

public class Test {
    private String name;
    private Integer age;
    private BigDecimal weight;

    // Test 기본생성자 확인
    public Test() {
        System.out.println("day05.util.Test 기본생성자 생성확인");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public BigDecimal getWeight() {
        return weight;
    }

    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Test{" +
                "name=" + name +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }
}
