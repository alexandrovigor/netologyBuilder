package org.example;

import java.util.OptionalInt;

public class Person {

    protected final String name;
    protected final String surname;
    protected int age;
    protected String address;
    protected int dateGiveBirth;


    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Person(String name, String surname, int age, String address,int dateGiveBirth) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.address = address;
        this.dateGiveBirth = dateGiveBirth;

    }

    public boolean hasAge() {
        return age >= 0;
    }

    public OptionalInt getAge() {
        return OptionalInt.of(age);
    }

    public void happyBirthday() {
        if (hasAge()) age++;
    }

    public boolean hasAddress() {
        return address != null;
    }

    public String getAddress() {
        return String.valueOf(hasAddress());
    }

    public void setAddress() {
        this.address = getAddress();

    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }
    public int getDateGiveBirth(){ return dateGiveBirth;}

    public PersonBuilder newChildBuilder() {

        return new PersonBuilder()
                .setSurname(surname)
                .setAge(age-dateGiveBirth)
                .setAddress(address);
    }
    @Override
    public int hashCode() {
        return super.hashCode();
    }
    @Override
    public String toString() {
        return name + " " + surname + ", age: " + age + ", address: " + address;
    }
}
