import java.util.InputMismatchException;
import java.util.Scanner;

public class SignInPage {
    public void SignIn(){
        System.out.println("*********************************************");
        System.out.println("1. Sign in as a normal user");
        System.out.println("2. Sign in as an administrator");
        System.out.println("3. Back to the Welcome page");
        System.out.println("*********************************************");
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
                Client newClient = new Client();
                newClient = newClient.Login();
                break;
            case 2:
                Administrator newAdmin = new Administrator();
                newAdmin = newAdmin.Login();
                break;
            case 3:
                return;
            default:

        }

    }
}
