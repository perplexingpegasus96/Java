package ru.sberbank.homework.homework_4;

public class Dog {
    private String name;
    private Integer age;
    private Boolean sex;
    private String bread;

    public Dog(String name, Integer age, Boolean sex, String bread) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.bread = bread;
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

    public String getBread() {
        return bread;
    }

    public void setBread(String bread) {
        this.bread = bread;
    }


    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                ", bread='" + bread + '\'' +
                '}';
    }
}
