package lesson02;

import java.util.Objects;

public class Person {

    private String firstName;
    private String secondName;
    private int age;
    private static int count;

    Person(String firstName, String secondName, int age) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;
        count++;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {
        Person P1 = new Person("Merlin", "Monro", 100);
        Person P2 = new Person("Merlin", "Monro", 100);
        Person P3 = new Person("Merlin", "Menson", 55);

        System.out.println();
        System.out.println("Testing '=='");
        System.out.print("'P1 == P2' => ");
        System.out.println(P1 == P2);
        System.out.print("'P1 == P3' => ");
        System.out.println(P1 == P3);

        System.out.println();
        System.out.println("Testing '.equals()'");
        System.out.print("'P1.equals(P2)' => ");
        System.out.println(P1.equals(P2));
        System.out.print("'P1.equals(P3)' => ");
        System.out.println(P1.equals(P3));

        System.out.println();
        System.out.println("Testing '.toString()'");
        System.out.println("'P1.toString()' => " + P1.toString());
        System.out.println("'P2.toString()' => " + P2.toString());
        System.out.println("'P3.toString()' => " + P3.toString());

        System.out.println();
        System.out.println("Testing '.hashCode()'");
        System.out.print("'P1.hashCode()' => ");
        System.out.println(P1.hashCode());
        System.out.print("'P2.hashCode()' => ");
        System.out.println(P2.hashCode());
        System.out.print("'P3.hashCode()' => ");
        System.out.println(P3.hashCode());
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                firstName.equals(person.firstName) &&
                secondName.equals(person.secondName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, secondName, age);
    }

    static {
        System.out.println("First class loading.");
    }

    {
        System.out.println(count + " class loading.");
    }
}
