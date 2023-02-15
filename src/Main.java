import java.util.Scanner;

class CalculateG {
    public int menuSelectionNumber;
    public double sumResult;

    public double squareResult;

    public double multiplicationResult;




    public static void main(String[] arguments) {
        double gravity = -9.81;
        double fallingTime = 30;
        double initialVelocity = 0.0;
        double finalVelocity;
        double initialPosition = 0.0;
        double finalPosition;
        finalVelocity =  (gravity * fallingTime+initialVelocity)/fallingTime ;
        finalPosition =( 0.5 * gravity * Math.pow(fallingTime, 2) + initialVelocity * fallingTime + initialPosition)/fallingTime;
        System.out.println("The object's position after " + fallingTime + " seconds is " + finalPosition + " m.");
        System.out.println("The object's velocity after " + fallingTime + " seconds is " + finalVelocity + " m/s.");

        CalculateG customCalculateG = new CalculateG();
        customCalculateG.outline();

    }
    double square() {
        double squareNumber;
// method for squaring of one number from scanner input

        Scanner squareInput = new Scanner(System.in);
        System.out.println("Enter the Number to Square: ");
        squareNumber = squareInput.nextDouble();
        return squareNumber * squareNumber;


    }

    double sum() {
// method for sum of two numbers from scanner input
        double firstSumNumber;
        double secondSumNumber;

        Scanner sumNumberInput = new Scanner(System.in);
        System.out.println("Enter the First Number to add: ");
        firstSumNumber = sumNumberInput.nextDouble();
        System.out.println("Enter the Second Number to add: ");
        secondSumNumber = sumNumberInput.nextDouble();
        return firstSumNumber + secondSumNumber;
    }

    double multiply() {
        double firstMultiplicationNumber;
        double secondMultiplicationNumber;

        Scanner multiplicationNumberInput = new Scanner(System.in);
        System.out.println("Enter the First Number to Multiply: ");
        firstMultiplicationNumber = multiplicationNumberInput.nextDouble();
        System.out.println("Enter the Second Number to Multiply: ");
        secondMultiplicationNumber = multiplicationNumberInput.nextDouble();

        return firstMultiplicationNumber * secondMultiplicationNumber;
    }

    void outline() {
        //prompt menu and selection input
        System.out.println("The available operations are:\n1.Squaring of a Number\n2.Summation of Two Numbers\n3.Multiplication of Two Numbers\nEnter the operation number to perform ");
        Scanner menuSelectionNumberInput = new Scanner(System.in);
        menuSelectionNumber = menuSelectionNumberInput.nextInt();


// method for printing out a result using return from methods multiply square and sum
        switch (menuSelectionNumber) {
            case 1:
                squareResult = square();
                System.out.println("The square result is: " + squareResult);
                break;
            case 2:
                sumResult = sum();
                System.out.println("The sum result is: " + sumResult);
                break;
            case 3:
                multiplicationResult = multiply();
                System.out.println("The multiplication result is:" + multiplicationResult);
                break;

            default:
                System.out.println("You did not chosen a valid operation");
        }

    }















}