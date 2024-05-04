import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Client extends User{
    private int phoneNumber;
    private String email;
    private ArrayList<FlightTicket> TicketList;

    public Client(){

    }
    public Client(String userName)
    {
        super(userName);
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTicketList(ArrayList<FlightTicket> ticketList) {
        TicketList = ticketList;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public ArrayList<FlightTicket> getTicketList() {
        return TicketList;
    }

    @Override
    public void Registration(){
        System.out.println("You are registering as a normal user.");
        Scanner sc = new Scanner(System.in);
            String username;
            String password;
            String phoneNum;
            String email;

            System.out.print("Username: ");
            username = sc.nextLine();

            System.out.print("Password: ");
            password = sc.nextLine();

            System.out.print("Phone number: ");
            phoneNum = sc.nextLine();

            System.out.print("Email: ");
            email = sc.nextLine();
        try(PrintWriter writer = new PrintWriter(new FileWriter("ClientInfo.txt", true))) {
            writer.print(username);
            writer.print("|" + password);
            writer.print("|" + phoneNum);
            writer.print("|" + email);
            System.out.println("Registration succeed");
            writer.println("");
        }
        catch (IOException E){
            System.out.println("Error writing to file: " + E.getMessage());
        }
    }

    @Override
    public Client Login() {
        System.out.println("You are signing in as a normal user.");

        String Enteredusername;
        String Enteredpassword;

        Scanner sc = new Scanner(System.in);
        System.out.print("Username: ");
        Enteredusername = sc.nextLine();

        System.out.print("Password: ");
        Enteredpassword = sc.nextLine();

        try (Scanner fileScanner = new Scanner(new File("ClientInfo.txt"))) {
            while (fileScanner.hasNextLine())
            {
                String curLine = fileScanner.nextLine();
                String[] curAdminInfo = curLine.split("\\|");
                String curUserName = curAdminInfo[0];
                String curPassword = curAdminInfo[1];

                if(curUserName.equals(Enteredusername) && curPassword.equals(Enteredpassword)){
                    System.out.println("Login succeed.");
                    return new Client(Enteredusername);
                }
            }

        } catch (IOException E) {
            System.out.println("Error reading the file");
        }

        System.out.println("Username or Password incorrect.");
        return null;
    }
}
