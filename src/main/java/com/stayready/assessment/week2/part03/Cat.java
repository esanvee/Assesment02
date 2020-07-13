package com.stayready.assessment.week2.part03;

public class Cat extends Pet {
    /**
     * @param name name of this Cat
     * @param age age of this Cat
     */

     String name;
     int age;

    public Cat(String name, Integer age) {
        this.name = name;
        this.age = age;

    }

    /**
     * @param age age of this Cat
     */
    public Cat(Integer age) {

        this.name = "Cat name";
        this.age = age;
    }

    /**
     * @param name name of this Cat
     */
    public Cat(String name) {
        this.name = name;
        this.age = 0;

        

    }

    /**
     * nullary constructor
     * by default, a Cat's
     * name is CatName
     * age is 0
     */
    public Cat() {

        this.name = "Cat name";
        this.age = 0;
    }

    /**
     * @return meow as a string
     */
    public String speak() {
        return "Meow";
    }

    public String getName(){
        return name;
    }

    public Integer getAge() {
        return age;
    }
}
