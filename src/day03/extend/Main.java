package day03.extend;

public class Main {
    public static void main(String[] args)  {
        Student s1 = new Student();
        Student s2 = new Student();
        Person engineer = new Person();
        engineer.getNamePerson();
        Student student = new Student();
        student.getNamePerson();

        Person person = new Student();
        person.getNamePerson();

        Object obj = new Object();
        System.out.println(obj.hashCode());
        Object obj2 = new Object();
        System.out.println(obj2.hashCode());

    }
}
