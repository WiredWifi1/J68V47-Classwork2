import java.util.Scanner;
public class L3E1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first name: ");
        String firstName = input.nextLine();
        System.out.println("Enter your surname: ");
        String lastName = input.nextLine();
        System.out.println("Enter your year of birth YYYY: ");
        int year = input.nextInt();

        System.out.println("Username: " + firstName.substring(0,1).toUpperCase() + lastName.toLowerCase());
        System.out.println("Password: " + lastName.substring(0,1).toLowerCase() + firstName.substring(0,3).toUpperCase() + year);

    }
}
