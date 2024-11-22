package Multitasking;

public class Fastthread {
    public static void main(String[] args) {


        // Creating Anonymous class Without lambda Expression
        Runnable Ob = new Runnable() {
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    System.out.println("Hi");

                    try {
                        Thread.sleep(10);
                    } catch (Exception e) {
                        e.printStackTrace();

                    }
                }
            }
        };


        // Creating Anonymous class With Lambda Expression
        Runnable Ob2 =()  ->  {
                for (int i = 0; i < 1000; i++) {
                    System.out.println("Hello");

                    try {
                        Thread.sleep(10);
                    } catch (Exception e) {
                        e.printStackTrace();

                    }
                }
            };




        Thread t1 = new Thread(Ob);
        Thread t2 = new Thread(Ob2);

        t1.start();
        t2.start();
    }
}
