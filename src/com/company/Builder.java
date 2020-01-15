package com.company;

public class Builder {

    public static void main(String[] args) {
        Person person = Person.builder() //PersonBuilder
                .age(22)    //PersonBuilder
                .name("John") //PersonBuilder
                .build(); //Person

        System.out.println(person);
    }
}

class Person {

    private String name;
    private Integer age;

    private Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    private Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static PersonBuilder builder() {
        return new PersonBuilder();
    }

    public static class PersonBuilder {
        private Person person;

        public PersonBuilder() {
            this.person = new Person();
        }

        public PersonBuilder age(Integer age) {
            this.person.setAge(age);
            return this;
        }

        public PersonBuilder name(String name) {
            this.person.setName(name);
            return this;
        }

        public Person build() {
            return this.person;
        }
    }

}