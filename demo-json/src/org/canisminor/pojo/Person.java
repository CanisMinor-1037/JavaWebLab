package org.canisminor.pojo;

import java.util.Arrays;
import java.util.Objects;

public class Person {
    private String name;
    private int age;
    private PetDog petDog;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(String name, int age, PetDog petDog) {
        this.name = name;
        this.age = age;
        this.petDog = petDog;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public PetDog getPetDog() {
        return petDog;
    }

    public void setPetDog(PetDog petDog) {
        this.petDog = petDog;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name) && Objects.equals(petDog, person.petDog);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, petDog);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", petDog=" + petDog +
                '}';
    }
}
