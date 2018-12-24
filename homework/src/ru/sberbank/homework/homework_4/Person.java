package ru.sberbank.homework.homework_4;

public class Person {
    private String name;
    private Integer age;
    private Boolean sex;
    private String birthplace;
    private Integer childrenNumber;

//конструктор

    public Person(String name, Integer age, Boolean sex, String birthplace,
                   Integer childrenNumber) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.birthplace = birthplace;
        this.childrenNumber = childrenNumber;
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

    public void setAge(Integer age) {
        this.age = age;
    }

    public boolean getSex() {
        return sex;
    }

    public void setSex(Boolean sex) {
        this.sex = sex;
    }

    public String getBirthplace() {
        return birthplace;
    }

    public void setBirthplace(String birthplace) {
        this.birthplace = birthplace;
    }

    public int getChildrenNumber() {
        return childrenNumber;
    }

    public void setChildrenNumber(Integer childrenNumber) {
        this.childrenNumber = childrenNumber;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                ", bread='" + birthplace + '\'' +
                ", childrenNumber='" + childrenNumber + '\'' +
                '}';
    }
}
