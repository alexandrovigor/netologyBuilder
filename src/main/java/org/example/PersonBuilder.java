package org.example;

public class PersonBuilder {
    protected String name;
    protected String surname;
    protected int age;
    protected String address;
    protected int dateGiveBirth;

    public PersonBuilder setName(String name) throws IllegalArgumentException {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Введите имя");
        } else this.name = name;
        return this;
    }

    public PersonBuilder setSurname(String surname) throws IllegalArgumentException {
        if (surname == null || surname.isEmpty()) {
            throw new IllegalArgumentException("Введите фамилию");
        } else this.surname = surname;
        return this;
    }

    public PersonBuilder setAge(int age) throws IllegalArgumentException {
        if (age < 0) {
            throw new IllegalArgumentException("Возраст недопустимый");
        } else {
            this.age = age;
        }
        return this;
    }

    public PersonBuilder setAddress(String address) {
        this.address = address;
        return this;
    }
    public PersonBuilder setDateGiveBirth(int dateGiveBirth){
        this.dateGiveBirth = dateGiveBirth;
        return this;
    }

    public Person build() throws IllegalArgumentException {

        if (name == null || surname == null) {
            throw new IllegalStateException("Не хватает обязательных полей");
        }
        return new Person(name, surname, age, address,dateGiveBirth);
    }
}
