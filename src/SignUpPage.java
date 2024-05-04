import java.util.InputMismatchException;
import java.util.Scanner;

public class SignUpPage {
    public void SignUp(){
        System.out.println("1. Sign up as a normal user");
        System.out.println("2. Sign up as an administrator");
        System.out.println("3. Back to the Welcome page");
        int userChoice;

        Scanner sc = new Scanner(System.in);
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


                break;
            case 2:
                Administrator newAdmin = new Administrator();
                newAdmin.Registration();
                break;
            case 3:
                return;
            default:

        }
    }

}
