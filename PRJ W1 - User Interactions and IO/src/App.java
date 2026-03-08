import java.util.Scanner;



public class App {
    public static void main(String[] args) throws Exception {
        System.out.println();
        System.out.println("PROJECT Iteration 1.4 User interactions and I/0");
        System.out.println();
        System.out.printf("\t\t\t\tWelcome To My Calculator Program!%n%n\tIn this iteration you will be able to perform addition on two integers of your choice %n\t     and subtraction on two floats (with up to 2 decimal spaces) of your choice%n%n");

        int num1, num2, sum;
        double fnum1, fnum2, fdifference;


        Scanner input = new Scanner(System.in);

        

        //Taking input for int values 
        System.out.println();
        System.out.println("Enter your first integer value: ");
        num1 = input.nextInt();
        System.out.println("Enter your second integer value:: ");
        num2 = input.nextInt();

        sum = num1 + num2;

        System.out.printf("%n%d + %d = %d%n", num1, num2, sum);



        //Taking input for float values 
        System.out.println();
        System.out.println("Enter your first float value: ");
        fnum1 = input.nextDouble();
        System.out.println("Enter your second float value: ");
        fnum2 = input.nextDouble();

        fdifference = fnum1 - fnum2;

        System.out.printf("%n%.2f - %.2f = %.2f%n", fnum1, fnum2, fdifference);

        System.out.println();
        System.out.printf("Thank you for taking the time to use my program! Have a great day!%n%n");

    }
}
