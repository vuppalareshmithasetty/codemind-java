import java.util.Scanner;
public class temp{
    public static void main(String[] args){
        float c;
        double f;
        Scanner sc=new Scanner(System.in);
        c=sc.nextFloat();
        f=32+(c*9/5);
        System.out.printf("%.2f",f);
    }
}