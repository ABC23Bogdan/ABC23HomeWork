package Home.week1HomeWork.Addition;

import java.util.Scanner;

/**
 * Ввести с клавиатуры три числа, положительные возвести в куб, а отрица-
 тельные заменить на 0.
 */
public class _02Cube {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter three numbers:");
        int firstNumber = sc.nextInt();
        int secondNumber = sc.nextInt();
        int thirdNumber = sc.nextInt();

        if (firstNumber > 0){
            System.out.println((int)Math.pow(firstNumber,3));
        }else {
            System.out.println(0);
        }
        if (secondNumber >0){
            System.out.println((int)Math.pow(secondNumber,3));
        }else{
            System.out.println(0);
        }
        if (thirdNumber > 0){
            System.out.println((int)Math.pow(thirdNumber,3));
        }else {
            System.out.println(0);
        }
    }
}
