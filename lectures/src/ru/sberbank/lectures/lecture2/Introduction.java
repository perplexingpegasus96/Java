package ru.sberbank.lectures.lecture2;

public class Introduction {
    public static void main(String[] args){
//        Introduction.basicTypes();
//        Introduction.refTypes();
        Introduction.classes();
    }
    private static void basicTypes(){
        System.out.println("Basic types:");
        byte b = 10;//2^8 = 256, -128...127
        short s = 1000;//2^16 = 65536, -32768...32767
        int i = 54564564;//2^32 = 4 млрд
        long l = 354345345354L;//2^64 = ахуевшее число

//      приведение результатов
        int result = s + b;//ctrl + alt + v = привидение типов
        System.out.println(result);

//        инкремент
//        ctr+shift+arrow = move code line up/down
        System.out.println(s++);
        System.out.println(++s);
        //float/double
        float r = 23334.23123F;
        double d = 23232.232112123534345;//does not over fill, better use it
        double infin = Double.NEGATIVE_INFINITY + Double.POSITIVE_INFINITY;// == Nan
        System.out.println(infin);
        //chars
        char c = 'a';//0...65536
        int t = c;
        //bool
        boolean bool = m1() && m2();
        System.out.println(bool);
        //literals
        long lit = 121_123_232_323L;
//error
//        System.out.println(4/0);
        Integer i1 = Integer.parseInt("123");//class Integer, same for short, long etc


    }

    private static void refTypes(){
        Integer age = 10;
        run(10);
        System.out.println(age);
    }
//i can access java class that is in another file
    private static void classes(){
        Student expl1 = new Student("Alex", 24);
        Student expl2 = new Student("Oleg", 32);

        expl1.sayHello();
        expl2.sayHello();
        String className = expl1.getName();
        System.out.println(className);
//        Student.sayHello()-> not static, can not call

        //won't work
//        Student expl3 = new Student();
    }

    private static void run(Integer age) {
        ++age;// same as age = age + 1
        System.out.println(age);
    }

    private static boolean m1() {
        return true;
    }

    private static boolean m2() {
        return false;
    }

}

