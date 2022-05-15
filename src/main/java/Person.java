import java.util.Objects;

public class Person {

    private String name;
    private String surname;
    private int age;
    private boolean hasAge;
    private String address;
    private boolean hasAddress;

    public Person() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(int age) {
        this.age = age;
        hasAge = true;
    }

    public void setAddress(String adress) {
        this.address = adress;
        hasAddress = true;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public boolean isHasAge() {
        return hasAge;
    }

    public String getAddress() {
        return address;
    }

    public boolean isHasAddress() {
        return hasAddress;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return age == person.age && name.equals(person.name) && surname.equals(person.surname) && Objects.equals(address, person.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, age, address);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }

    public void happyBirthday(){
        age++;
    }

    public PersonBuilder newChildBuilder() throws IllegalArgumentException {
        return new PersonBuilder()
                .setSurname(this.surname)
                .setAge(this.age)
                .setAddress(this.address);
    }
}
