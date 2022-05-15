public class PersonBuilder {

    private Person newPerson;

    public PersonBuilder() {
        newPerson = new Person();
    }

    public PersonBuilder setName(String name) {
        newPerson.setName(name);
        return this;
    }

    public PersonBuilder setSurname(String surname) {
        newPerson.setSurname(surname);
        return this;
    }

    public PersonBuilder setAge(int age) throws IllegalArgumentException {
        if (age >= 0 && age < 200) {
            newPerson.setAge(age);
        } else throw new IllegalArgumentException();
        return this;
    }

    public PersonBuilder setAddress(String address) {
        newPerson.setAddress(address);
        return this;
    }

    public Person build() throws IllegalStateException {
        if (newPerson.getName() != null && newPerson.getSurname() != null) {
            return newPerson;
        } else throw new IllegalStateException();
    }


}
