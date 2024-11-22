package Database;

import java.util.Scanner;

public class Student {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (true) {

            try {
                choice();
                int choice = in.nextInt();

                while (!(choice == 1 || choice == 2 || choice == 0)) {
                    System.out.println("You have entered wrong input\n");
                    System.out.print("Enter you Choice: ");
                    choice = in.nextInt();
                }

                if (choice == 0) {

                    System.out.println("\nThanks for reaching out us ❤️\n");
                    break;
                }



                CallDb up = new CallDb();
                up.signup();
//                switch (choice) {
//
//                    case 1:
//                        System.out.println("Under Process");
//
//                        break;
//
//                    case 2:
//                        CallDb up = new CallDb();
//                        // First Name
//                        System.out.print("Enter your Full Name: ");
//                        String name = in.nextLine();
//                        in.nextLine();
//
////                        // Last Name
////                        System.out.print("Enter your Last name: ");
////                        String lastName = in.nextLine();
//
//
//                        // Email Id
//                        System.out.print("Enter your Email Id: ");
//                        String emailId = in.nextLine();
//
//
////                        // Gender
////                        System.out.println("\nSelect your Gender");
////                        System.out.println("1: Male");
////                        System.out.println("2: Female");
////                        System.out.println("3: Other");
////                        System.out.print("Enter Your Gender:");
////                        choice = in.nextInt();
////                        String gender = null;
////                        switch (choice) {
////                            case 1 -> gender = "Male";
////                            case 2 -> gender = "Female";
////                            case 3 -> gender = "Other";
////                            default -> System.out.println("!! Error !!");
////                        }
//
//
//                        // Phone Number
//                        System.out.print("Enter your Phone No.: ");
//                       String phoneNo = in.nextLine();
//                        in.nextLine();
//
//                        // Calling Object
//                        up.signup(name, emailId, phoneNo);
//                        break;
//
//
//                    default:
//                        System.out.println("!! Error !!");
//                        break;
//                }


            }catch(Exception e){

                System.out.println("Invalid input. Please enter a number\n");
                in.nextLine(); // Consume the invalid input
            }
        }




        in.close();
    }

    static void choice(){
        System.out.println("Welcome to Ajay's Database");
        System.out.println("1: Sign in");
        System.out.println("2: Sign up");
        System.out.println("0: exit");
        System.out.print("Enter you Choice: ");
    }

}
