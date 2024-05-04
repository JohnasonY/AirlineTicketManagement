import java.io.FileNotFoundException;
import java.util.Scanner;
public abstract class User
{
    protected String userName;
    protected String password;

    public User(){

    }
    public User(String userName){
        this.userName = userName;
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

    public abstract void Registration();

    public abstract User Login();

    public void Logout(){

    }
}
