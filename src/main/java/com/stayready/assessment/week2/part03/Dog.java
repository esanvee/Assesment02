package com.stayready.assessment.week2.part03;

public class Dog extends Pet {
    /**
     * @param name name of this Dog
     * @param age age of this dog
     */

    String name;
    int age;


    public Dog(String name, Integer age) {
        this.name = name;
        this.age = age;

    }

    /**
     * @param age age of this dog
     */
    public Dog(Integer age) {
        this.name = "Dog name";
        this.age = age;

    }

    /**
     * @param name name of this dog
     */
    public Dog(String name) {

        this.name = name;
        this.age = 0;

    }

    /**
     * nullary constructor
     * by default, a dog's
     * name is DogName
     * age is 0
     */
    public Dog() {
        this.name = "Dog name";
        this.age = 0;
    }

    /**
     * @return bark as a string
     */
    public String speak() {
        return "Bark";
    }

    public String getName(){
        return name;
    }

    public Integer getAge() {
        return age;
    }
}
