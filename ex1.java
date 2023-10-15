/**
 * Using only the programming techniques you learned in this chapter, write an application
 * that calculates the squares and cubes of the numbers from 0 to 10 and prints the resulting values in
 * table format, as show below. [Note: This program does not require any input from the user.]
 * number	square	cube
 * 0		0		0
 * 1		1		1
 * 2		4		8
 * 3		9		27
 * 4		16		64
 * 5		25		125
 * 6		36		216
 * 7		49		343
 * 8		64		512
 * 9		81		729
 * 10		100		1000
 */
public class ex1 {
    public static void main(String[] args) {
		int number;	
		System.out.println("number"+"\t"+"square"+"\t"+"cube");
		
		number = 0;
		System.out.printf("%d \t %d \t %d\n", (number), (number * number), (number * number * number));
        number = 1;
		System.out.printf("%d \t %d \t %d\n", (number), (number * number), (number * number * number));
        number = 2;
		System.out.printf("%d \t %d \t %d\n", (number), (number * number), (number * number * number));
        number = 3;
		System.out.printf("%d \t %d \t %d\n", (number), (number * number), (number * number * number));
        number = 4;
		System.out.printf("%d \t %d \t %d\n", (number), (number * number), (number * number * number));
        number = 5;
		System.out.printf("%d \t %d \t %d\n", (number), (number * number), (number * number * number));
        number = 6;
		System.out.printf("%d \t %d \t %d\n", (number), (number * number), (number * number * number));
        number = 7;
		System.out.printf("%d \t %d \t %d\n", (number), (number * number), (number * number * number));
        number = 8;
		System.out.printf("%d \t %d \t %d\n", (number), (number * number), (number * number * number));
        number = 9;
		System.out.printf("%d \t %d \t %d\n", (number), (number * number), (number * number * number));
        number = 10;
		System.out.printf("%d \t %d \t %d\n", (number), (number * number), (number * number * number));
    }
}
