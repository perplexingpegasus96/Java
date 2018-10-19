package ru.sberbank.homework.homework_4;

public class Person {
    private String name;
    private Integer age;
    private boolean sex;
    private String birthplace;
    private Integer childrenNumber;

//конструктор

    public Person(String name, Integer age, boolean sex, String birthplace,
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

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
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

}
