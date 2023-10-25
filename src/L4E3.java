import java.util.Scanner;
public class L4E3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the total order amount: £");
        Float order = input.nextFloat();
        int shipping = 10;
        if (order <= 50); {
            order = (order + shipping);
        } if (order >= 50); {
            System.out.print("Your final total is: £" + order);

        }
    }
}
