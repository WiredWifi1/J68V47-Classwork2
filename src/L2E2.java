import java.util.Scanner;
public class L2E2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num1 = input.nextInt();
        System.out.println("Great! now enter a second number:");
        int num2 = input.nextInt();
        int result1 = num1 + num2;
        System.out.println(num1 + " + " + num2 +" = " + result1);
        int result2 = num1 - num2;
        System.out.println(num1 + " - " + num2 +" = " + result2);
        int result3 = num1 * num2;
        System.out.println(num1 + " * " + num2 +" = " + result3);
        int result4 = num1 / num2;
        System.out.println(num1 + " / " + num2 +" = " + result4);
        int result5 = num1 % num2;
        System.out.println(num1 + " % " + num2 +" = " + result5);
    }
}
