import java.util.Scanner;

public class Math {

    public static void main(String[] args) {
        int mathType = 0;
        double num1 = 0;
        double num2 = 0;
        int whileCondition = 1;
        Scanner scan= new Scanner(System.in);
        while(whileCondition == 1) {

            System.out.println("Welcome to Nicks basic math program that allows for addition, subtraction, multiplication, and division");
            System.out.println("For addition enter 1, for subtraction enter 2, for multiplication enter 3, for division enter 4");
            mathType = scan.nextInt();
            System.out.print("Enter the first number:");
            if (scan.hasNextDouble()) {
                num1 = scan.nextDouble();
            } else {
                System.out.println("Wrong value entered, you did not enter a number, terminating program");
            }
            System.out.print("Enter the second number:");
            if (scan.hasNextDouble()) {
                num2 = scan.nextDouble();
            } else {
                System.out.println("Wrong value entered, you did not enter a number, terminating program");
            }

            doMath(mathType,num1,num2);

            System.out.print("Would you like to enter another equation?  If so enter 1, or anything else to quit");
            whileCondition = scan.nextInt();

        }



    }

    public static double doMath(int mathType, double num1, double num2){
        double total = 0;
        if(mathType == 1) {
            total = num1 + num2;
            System.out.println(num1 + " + " + num2 + " = " + total);
            return total;
        }
        if(mathType == 2) {
            total = num1 - num2;
            System.out.println(num1 + " - " + num2 + " = " + total);
            return total;
        }
        if(mathType == 3) {
            total = num1 * num2;
            System.out.println(num1 + " * " + num2 + " = " + + total);
            return total;
        }
        if(mathType == 4) {
            if(num2 == 0) {
                System.out.println(num1 + " / " + num2 + " = is a divide by 0 error");
                return 0;
            }
            total = num1 / num2;
            System.out.println(num1 + " / " + num2 + " = " + + total);
            return total;
        }
        return total;
    }


}
