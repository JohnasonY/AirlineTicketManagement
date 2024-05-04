import java.io.FileNotFoundException;
import java.util.Scanner;
public abstract class User
{
    protected String userName;
    protected String password;

    public User(){

    }
    public User(String userName, String password){
        this.userName = userName;
        this.password = password;
    }


    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public abstract void Registration() throws FileNotFoundException;

    public void Login(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Username: ");
        String username;
        sc.nextLine();

        System.out.println(" ");

        System.out.print("Password: ");
        String password;
        sc.nextLine();



    }

    public void Logout(){

    }
}
