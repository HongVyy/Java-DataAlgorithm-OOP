
/*
 * We introduced the body mass index (BMI) calculator in Exercise 1.10. The formulas for calculating BMI are

                weightInPounds × 703
    BMI =      -----------------------
            heightInInches × heightInInches

Create a BMI calculator that reads the user’s weight in pounds and height in inches (or, if you pre- fer, the user’s weight in kilograms and height in meters), 
then calculates and displays the user’s body mass index. Also, display the following information from the Department of Health and Human Services/National Institutes of Health 
so the user can evaluate his/her BMI:

BMI VALUES
Underweight: less than 18.5
Normal:      between 18.5 and 24.9
Overweight:  between 25 and 29.9
Obese:       30 or greater

 */
import java.util.Scanner;

public class BMIcalculate {
    public static void main(String[] args){
        try (Scanner input = new Scanner(System.in)) {
            float BMI, weightinpounds, heightininches;
            //Ask the user their weight
            //For loop if it true ask the user enter their input, if not print a error and continue ask them again 
            
            while(true){
                try{
                    System.out.println("Enter your weight in pounds:");
                    weightinpounds = input.nextInt();
                    if (weightinpounds <= 0){
                        throw new ArithmeticException();
                    }
                    break;
                }
                catch(ArithmeticException e){
                    System.out.println("Invalid weight, Try again.");
                    continue;
                }
            }
            /*Ask the user their height*/
            while(true){
                try{
                    System.out.println("Enter your height in inches: ");
                    heightininches = input.nextInt();
                    if (heightininches <= 0){
                        throw new ArithmeticException();
                    }
                    break;
                }
                catch(ArithmeticException e){
                    System.out.println("Invalid height, Try again.");
                    continue;
                }
            }

            /*BMI calculation part*/
            BMI = (weightinpounds * 703)/(heightininches*heightininches);
            System.out.print("Calculating...\n");
            System.out.printf("Your BMI is: " + BMI);

            if(BMI < 18.5){ 
                System.out.println("\nUnderweight ");
            } else if(BMI >=18.5 && BMI <25.0) {
                System.out.println("\nNormal weight");
            } else if(BMI >=25.0 && BMI <30.0) {
                System.out.println("\nOverweight");
            } else {
                System.out.println("\nObese");
            }
        }
    }    
}
