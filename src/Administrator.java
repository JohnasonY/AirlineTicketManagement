import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Administrator extends User{

    String AuthorizedCode = "CSC330";
    private String RealName;

    public Administrator(){

    }
    public Administrator(String userName, String password, String RealName){
        super(userName, password);
        this.RealName = RealName;
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

            String AdminFile = "AdminInfo.txt";
            PrintWriter outFS = null;
            try {
                FileOutputStream AdminFileStream = new FileOutputStream("AdminInfo.txt");
                outFS = new PrintWriter(AdminFileStream);
                outFS.println(username);
                outFS.println(password);
                outFS.println(realname);

            }
            catch (FileNotFoundException e) {
                System.out.println("File Not Found");
            }
            finally {
                if(outFS != null)
                {
                    outFS.close();
                }
            }
        }
        else
        {
            System.out.println("Authorization failed.");
        }
    }

    @Override
    public void Login(){
        System.out.println("You are logging in as a Administrator.");

        String username;
        String password;

        Scanner sc = new Scanner(System.in);
        System.out.print("Username: ");
        username = sc.nextLine();

        System.out.print("Password: ");
        password = sc.nextLine();



    }


}
