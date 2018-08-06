package day05.generics.chapter01;

/*
    이런식으로 콤마를 통해 자료형을 여러개 만들 수 있습니다.
     - 알파벳은 아무렇게 쓰셔도 되지만(소문자도 허용), 관용적으로 쓰시길 권합니다 Student 클래스 참조!
 */
public class Teacher<K, V> {
    private K key;
    private V value;

    public Teacher(K key, V value) {
        this.key = key;
        this.value = value;
    }


    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

}
