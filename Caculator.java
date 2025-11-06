
import java.util.Scanner;

public class Caculator
{
    public static void main(String[]args)
    {
        double a,b, sum;
        Scanner scan = new Scanner(System.in);;
        
        System.out.println( " Plus two value of a and b ");
        System.out.println( " *************************");
        System.out.println(" Enter the number of a :");
        a = scan.nextDouble();
        
        System.out.println(" Enter the number of b :");
        b = scan.nextDouble();
        
        sum = a + b ;
        
        System.out.println( " Total of a and b is : " +sum);
        
    }
}