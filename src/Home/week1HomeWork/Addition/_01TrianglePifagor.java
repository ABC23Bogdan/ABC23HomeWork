package Home.week1HomeWork.Addition;

import java.util.Scanner;

/**
 * Ввести с клавиатуры значения трех сторон треугольника a, b и c и опреде-
 лить, является ли он прямоугольным. Ответ вывести в виде сообщения.
 */
public class _01TrianglePifagor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter side A");
        int a = sc.nextInt();
        System.out.println("Please enter side B");
        int b = sc.nextInt();
        System.out.println("Please enter side C");
        int c = sc.nextInt();

        if ((a * a) + (b * b) == (c * c)) {
            System.out.println("Triange is right");
        } else {
            System.out.println("Triangle not right");
        }
    }
}
