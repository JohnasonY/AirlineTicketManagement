public abstract class User
{
    protected String userName;
    protected int userID;
    protected String password;


    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public int getUserID() {
        return userID;
    }

    public String getPassword() {
        return password;
    }
}
