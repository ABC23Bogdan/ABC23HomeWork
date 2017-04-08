package Home.week1HomeWork;
import java.util.Scanner;

/**
 * Created by Asus on 05.04.2017.
 */
public class _08TrueOrFalse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int dif1 = n1/n2;
        int dif2 = n2/n1;
        boolean n1d = true;
        boolean n2d = true;
        boolean f   = false;


        if (n1 % n2 == 0 ){
            System.out.println ( n1d+" " +dif1);
        }
        else if(n2 % n1 == 0){
            System.out.println(n2d + "" + dif2  );
        }
        else if (n1 % n2 !=0 || n2 % n1 !=0){
            System.out.println(f);
        }
    }
}
