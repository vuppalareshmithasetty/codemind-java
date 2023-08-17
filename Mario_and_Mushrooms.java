import java.util.Scanner;
public class Sample{
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        int a=sc.nextInt();
        int s=a-2;
        int h=a-1;
        if(a%3==0){
            System.out.print("NORMAL");
        }
        else if(s%3==0){
            System.out.print("SMALL");
        }
        else if(h%3==0){
            System.out.print("HUGE");
        }
    }
}