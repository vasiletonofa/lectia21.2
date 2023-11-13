package person;

public class Person extends Object {

    int age;

    public Person(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int hashCode() {
        return this.age;
    }

    @Override
    public boolean equals(Object obj) {
        Person person = (Person) obj;
        return this.age == person.getAge();
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                '}';
    }
}
