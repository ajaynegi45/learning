package Multitasking;

public class Diffthread {
    public static void main(String[] args) {

        E Obj = new E();
        F Obj2  = new F();

        Thread t1 = new Thread(Obj);
        Thread t2 = new Thread(Obj2);

        t1.start();
        t2.start();
    }
}


class E implements Runnable{

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

class F implements Runnable{

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
