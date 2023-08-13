import java.util.Scanner;
public class inch{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a =sc.nextInt();
        int b = sc.nextInt();
        double c =(a+b)/2.0;
        System.out.printf("Average of %d and %d is: %.2f",a,b,c);
    }
}