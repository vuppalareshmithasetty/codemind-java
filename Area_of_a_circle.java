import java.util.Scanner;
public class Area{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int r;
        r=sc.nextInt();
        double area;
        area=3.14*r*r;
        System.out.printf("%.2f",area);
    }
}