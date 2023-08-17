import java.util.Scanner;
public class sample{
    public static void main(String[] args){
        Scanner sc =new Scanner (System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=21-(a+b);
        if(c<=10){
            System.out.print(c);
        }
        else{
            System.out.print(-1);
        }
    }
}