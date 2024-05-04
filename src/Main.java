import java.util.Scanner;
import java.util.InputMismatchException;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Welcome to Airline Ticket Management System!");
        System.out.println("*********************************************");
        System.out.println("Please enter a number to continue:");
        System.out.println("1. Log in with an existing account");
        System.out.println("2. Register a new account");
        System.out.println("3. Close the program");
        System.out.println("*********************************************");

        //ask the user until select a correct option
        Scanner sc = new Scanner(System.in);
        int userChoice;
        while(true) {
            try {
                userChoice = sc.nextInt();
                if(userChoice < 1 || userChoice > 3)
                    throw new InputMismatchException();     //throw an instance of InputMismatchException
            }
            catch(InputMismatchException e){
                System.out.println("Please enter a number between 1 and 3: ");
                sc.nextLine();
                continue;
            }
            break;
        }

        //After selection is valid, go to execute the corresponding function
        switch(userChoice){
            case 1:
                //log in

                break;
            case 2:
                //register
                System.out.println("1. Register as a normal user");
                System.out.println("2. Register as an administrator");
                int registerOption;
                registerOption = sc.nextInt();
                if(registerOption == 1){

                }
                else if(registerOption == 2){
                    Administrator newAdmin = new Administrator();
                    newAdmin.Registration();
                }


                break;
            case 3:
                System.out.println("Program is closing. Thank you for using! See you!");
                System.exit(0);
                break;
            default:

        }



    }


}
