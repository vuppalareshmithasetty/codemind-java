import java.util.Scanner;
public class sample {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a,b,c,d;
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        d=a*b*(c*2)*512;
        System.out.println(d);
      }
}