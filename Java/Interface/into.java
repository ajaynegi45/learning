package Interface;

import java.lang.invoke.LambdaConversionException;
import java.util.Scanner;

public class into {
    public static void main(String[] args){


        // Lambda Expression for multiple line
        A obj =  () ->
            {
                System.out.println("in Main ");
            }
        ;

        obj.add(); // calling method



        // Lambda Expression for single line
        A obj2 =  () -> System.out.println("in Main ");

        obj2.add(); // calling method



        // Lambda Expression for single line and Parameter taking
        Q obj1 = (a,b) -> System.out.println("Sum: " +(a+b));

        obj1.sum(1,8); // calling method


        // Lambda Expression for return statement
        Z obj4 = (int a, int b)-> {
            return a-b;
        };
        int result = obj4.sub(10,2);
        System.out.println("Sub: "+result);


        // Lambda Expression for return statement in single line
        Z obj5 = (int a, int b)-> a-b;
        int result2 = obj5.sub(10,2);
        System.out.println("Sub: "+result2);

    }
}

@FunctionalInterface
interface A{
    void add();
}

class B implements A{
    @Override
    public void add() {
        System.out.println("Hello World");
    }
}

@FunctionalInterface
interface Q{
    void sum(int a, int b);
}

@FunctionalInterface
interface Z{
    int sub(int a, int b);
}