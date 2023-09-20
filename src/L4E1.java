import java.util.Scanner;

public class L4E1 {

    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your first name: ");
        String firstName = input.nextLine();
        System.out.print("Please enter your Surname: ");
        String surName = input.nextLine();
        System.out.print("Please enter the total value of your order: £");
        Float totalValue = input.nextFloat();
        System.out.print("Please enter the amount you wish to pay as a deposit: £");
        Float Deposit = input.nextFloat();

        Float Remainder = totalValue - Deposit;

        System.out.println("==RECEIPT==");
        System.out.println("Customer : " + firstName.substring(0,1) + " " + surName);
        System.out.println("Order Total: £" + totalValue);
        System.out.format("Deposit Paid: £%.2f %n" , Deposit);
        System.out.println("Remainder: £" + Remainder);
        if (Deposit > 100) {
            System.out.println("You get a free toaster!");
        }
        System.out.println("Have a nice day.");
    }
}
