import java.util.Scanner;

public class Newclass {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String login, password;

        System.out.print("Enter login : ");
        login = s.nextLine();

        System.out.print("Enter password : ");
        password = s.nextLine();

        int length = login.length();
        int lenght = password.length();

        try {
            if (length > 20)
                throw new LoginException("Login should be less than 20 characters ");
            else
                System.out.println("Login Successful");
        } catch (LoginException u) {
            u.printStackTrace();
        }

        try {
            if (length > 20) {
                throw new PasswordException("Password should be less than 20 numbers ");
            } else {
                System.out.println("Password is validate");
            }
        } catch (PasswordException p) {
            p.printStackTrace();
        }
    }
}
