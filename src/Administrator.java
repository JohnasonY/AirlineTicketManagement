import java.io.*;
import java.util.Scanner;

public class Administrator extends User{
    private final String AuthorizedCode = "CSC330";
    private String RealName;

    public Administrator(){

    }
    public Administrator(String userName){
        super(userName);
    }


    @Override
    public void Registration() {
        System.out.println("You are registering as a Administrator.");
        System.out.println("Please enter the authorization code to continue: ");

        Scanner sc = new Scanner(System.in);
        String userCode = sc.nextLine();
        if(userCode.equals(AuthorizedCode)) {

                String username;
                String password;
                String realname;

                System.out.print("Username: ");
                username = sc.nextLine();

                System.out.print("Password: ");
                password = sc.nextLine();

                System.out.print("Name: ");
                realname = sc.nextLine();

            try(PrintWriter writer = new PrintWriter(new FileWriter("AdminInfo.txt", true))){
                writer.print(username);
                writer.print("|" + password);
                writer.print("|" + realname);
                System.out.println("Registration succeed");
                writer.println("");
            }
            catch (IOException E){
                System.out.println("Error writing to file: " + E.getMessage());
            }
        }
        else
        {
            System.out.println("Authorization failed.");
        }
    }

    @Override
    public Administrator Login(){
        System.out.println("You are signing in as a Administrator.");

        String Enteredusername;
        String Enteredpassword;

        Scanner sc = new Scanner(System.in);
        System.out.print("Username: ");
        Enteredusername = sc.nextLine();

        System.out.print("Password: ");
        Enteredpassword = sc.nextLine();

        try (Scanner fileScanner = new Scanner(new File("AdminInfo.txt"))) {
            while (fileScanner.hasNextLine())
            {
                String curLine = fileScanner.nextLine();
                String[] curAdminInfo = curLine.split("\\|");
                String curUserName = curAdminInfo[0];
                String curPassword = curAdminInfo[1];

                if(curUserName.equals(Enteredusername) && curPassword.equals(Enteredpassword)){
                    System.out.println("Login succeed.");
                    return new Administrator(Enteredusername);
                }
            }

        } catch (IOException E) {
            System.out.println("Error reading the file");
        }

        System.out.println("Username or Password incorrect.");
        return null;
    }

    public void setRealName(String realName) {
        RealName = realName;
    }

    public String getRealName() {
        return RealName;
    }
}
