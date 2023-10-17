//comparision examples

// == equal to
// != not equal to
// > greater
// < smaller
// >= greater than or equal to
// <= smaller than or equal to

import java.util.Scanner;
public class comparison {
    public static void main(String[] args){
        try (Scanner input = new Scanner(System.in)) {
            int number1; 
            int number2; 
            System.out.print("Enter first number: ");
            number1 = input.nextInt();
            System.out.print("Enter second number: ");
            number2 = input.nextInt();

            if (number1 == number2)
                System.out.printf("%d == %d\n", number1, number2);
            if (number1 != number2)
                System.out.printf("%d != %d\n", number1, number2);
            if (number1 < number2)
                System.out.printf("%d < %d\n", number1, number2);
            if (number1 > number2)
                System.out.printf("%d > %d\n", number1, number2);
            if (number1 <= number2)
                System.out.printf("%d <= %d\n", number1, number2);
            if (number1 >= number2)
                System.out.printf("%d >= %d\n", number1, number2);
        }
        
    }
}
