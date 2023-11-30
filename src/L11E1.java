import java.util.Scanner;
public class L11E1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = input.nextInt();
        for(int i = 1; i <= 12; ++i) {
            System.out.printf("%d * %d = %d \n", num, i, num * i);
        }
        
    }
}
