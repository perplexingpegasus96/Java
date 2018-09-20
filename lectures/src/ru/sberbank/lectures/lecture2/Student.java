package ru.sberbank.lectures.lecture2;//acess restrictions and can name classes same way


public class Student {
    public static void main(String[] args){
        Student exmpl = new Student("Oleg", 22);
        exmpl.sayHello();
    }

    private final String name;//==null//by default, all classes in the same package got acess to it
    private int age;//==0

    public Student(String name, int age){
        this.name = name;
        this.age = age;
    }
//getter
    public String getName(){//get name from outside of class
        return name;
    }
//setter
//    public void setName(String name) {//set name outside class
//        this.name = name;//if name is final, can not modify it, !!better not use it!!
//    }

    public void sayHello(){//if static, can not call class params, con not call not static methods
        System.out.println("Hello, I am " + name + ", " + age + " old");
    }
}

