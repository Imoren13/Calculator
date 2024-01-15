//---------------------------------------------------
//  Calculator.java     Author: Isaac Moreno
//
//  Simple calculators that uses switch statements to
//  preform 4 operations and uses a while statement to
//  continue program until user is done.
//---------------------------------------------------

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args){

        char operator;

        //  Declares doubles
        Double number1, number2, result = 0.0;

        //  creates object as scanner class
        Scanner scan = new Scanner(System.in);

        Welcome();


        // Ask the User to input operator.
            System.out.println("Enter Operator: [ + - / * c q ]");
            operator = scan.next().charAt(0);


            //  Ask the user to input values.
            System.out.println("Enter first value: ");
            number1 = scan.nextDouble();

            System.out.println("Enter second value: ");
            number2 = scan.nextDouble();



        switch (operator) {

            //preforms the adding of the two values
            case '+':
                result = number1 + number2;
                System.out.println("Result: " + result);
                break;

            // preforms the subtracting of the two values
            case '-':
                result = number1 - number2;
                System.out.println("Result: " + result);
                break;

            //preforms the multiplication of the two values
            case '*':
                result = number1 * number2;
                System.out.println("Result: " + result);
                break;

            //preforms the division of the two values
            case '/':
                result = number1 / number2;
                System.out.println("Result: " + result);
                break;

            default:
                System.out.println("Invalid operator");
                break;



        }


        while(true){

            // Ask the User to input operator.
            System.out.println("Enter Operator: [ + - / * c q ]");
            operator = scan.next().charAt(0);


            //  Ask the user to input values.
            System.out.println("Enter value: ");
            number2 = scan.nextDouble();

            switch (operator) {

                //preforms the adding of the two values
                case '+':
                    result = result + number2;
                    System.out.println("Result: " + result);
                    break;

                // preforms the subtracting of the two values
                case '-':
                    result = result - number2;
                    System.out.println("Result: " + result);
                    break;

                //preforms the multiplication of the two values
                case '*':
                    result = result * number2;
                    System.out.println("Result: " + result);
                    break;

                //preforms the division of the two values
                case '/':
                    result = result / number2;
                    System.out.println("Result: " + result);
                    break;

                case 'c':
                    result = 0.0;
                    System.out.println("Result: " + result);
                    break;

                default:
                    System.out.println("Invalid operator");
                    break;

            }


            // this if statement ends the program when 00 is entered as a value in number2
            if (operator == 'q'){
                System.out.println("Result: " + result);
                break;
            }


        }



    }

    // Method that prints out the welcome part of the program.
    private static void Welcome() {
        System.out.println();
        System.out.println("==============");
        System.out.println(">>Calculator<<");
        System.out.println("==============");
        System.out.println();
        System.out.println("TO QUIT ENTER q ON operator!");
        System.out.println();
        System.out.println("To Clear result enter c on operator!");
        System.out.println();
    }
}