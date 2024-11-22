package Multitasking;

public class Multitasking {
    public static void main(String[] args) {

        A obj = new A();
        B obj1 = new B();

      obj.start();
      obj1.start();

        System.out.println(obj.getPriority()); // Getting Priority
        System.out.println(obj1.getPriority()); // Getting Priority

        obj.setPriority(1); // Setting Priority in specific Number
        obj1.setPriority(Thread.MAX_PRIORITY); // Setting Priority

        System.out.println(obj.getPriority()); // Getting Priority
        System.out.println(obj1.getPriority()); // Getting Priority

        obj.start(); // Calling method
        obj1.start(); // Calling method


        D obj3 = new D();
        System.out.println("Get class: " +obj3.getClass());

        System.out.println("To String: " +obj3.toString());

        System.out.println("Hash CODE: " +obj3.hashCode());
    }
}


class A extends Thread{
    public void run(){
        for (int i =0; i<1000; i++) {
            System.out.println("Hi");
            try{
            Thread.sleep(10);
            }catch (Exception e){
                e.printStackTrace();

            }
        }
    }
}

class B extends Thread {

    public void run() {

        for (int i = 0; i < 1000; i++) {
            System.out.println("Hello");

            try {
                Thread.sleep(10);
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    }
}

class D {
    public void act(){
        System.out.println("Inside D");
    }
}