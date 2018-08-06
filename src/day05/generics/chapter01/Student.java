package day05.generics.chapter01;


/*
    제네릭스란?
      - 간단히 설명드리면 타입을 정해주는 역할을 하여 코딩에 안정성을 확보합니다.
      - 제네릭스를 통해 다형성을 좀 더 폭넓게 사용하여 일반화를 통해 코드의 간결성을 높여주게 됩니다.
      - 자료형을 상황에 맞게 사용시점에서 정해주며 객체만 다룹니다.

    제네릭스의 종류
    1. 제네릭스 클래스
      - 타입매개변수가 1개 이상 있는 클래스를 제네릭스 클래스라 합니다.
        여기서 타입매개변수란 Student<T> 에서 T를 가르킵니다. T말고 A, B 등등 알파벳이 가능하지만 관용적 표현이 암묵적으로
        사용되므로 관용표현을 지켜주시기 바랍니다.
        T : 타입(어떤 클래스의 자료형 ex.. String, Object, Integer 등등 자료형을 말합니다)
        K : Key (키) 를 나타내는 관용어
        V : Value (값) 를 나타내는 관용어
        E : Element (요소) 를 나타내는 관용어

    2. 제네릭스 메서드
      - 위 정의에서 메서드에 제네릭스가 사용되면 제네릭스 메서드라 합니다.
 */
public class Student<T> {
    private String name;
    private int age;
    private T item;     // 제네릭스를 사용하여 item변수의 자료형은 동적으로 정의 되어집니다.

    // 이런식으로 멤버메서드도 구현할 수 있습니다. 반환형에 주목해주세요. 자료형이 정적으로 결정되어 있지 않고, 동적으로 정의됩니다.
    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }

}
