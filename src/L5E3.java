import java.util.Scanner;
import java.util.Random;
public class L5E3 {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner input = new Scanner(System.in);
        int score = 0;
        for (int count=1; count <= 10; count++) {
            int number1 = rand.nextInt(100);
            int number2 = rand.nextInt(100);
            System.out.print("What is "+number1+" + "+ number2+": ");
            float Q1 = input.nextFloat();
            if (Q1==(number1+number2)){
                System.out.println("AWESOME!");
                score ++;
            } else {
                System.out.println("Wrong. It is "+(number1+number2));
            }
        }
        System.out.println("You scored " + score);

        //System.out.print("What is 5 x 5: ");
        //        float Q2 = input.nextFloat();
        //        System.out.print("What is 3 - 1: ");
        //        float Q3 = input.nextFloat();
        //        System.out.print("What is 16 / 4: ");
        //        float Q4 = input.nextFloat();
        //        System.out.print("What is 34 + 16: ");
        //        float Q5 = input.nextFloat();
        //        System.out.print("What is 100 - 99: ");
        //        float Q6 = input.nextFloat();
        //        System.out.print("What is 30 x 3: ");
        //        float Q7 = input.nextFloat();
        //        System.out.print("What is 50 / 5: ");
        //        float Q8 = input.nextFloat();
        //        System.out.print("What is 45 - 42: ");
        //        float Q9 = input.nextFloat();
        //        System.out.print("What is  + 1: ");
        //        float Q10 = input.nextFloat();

    }
}
