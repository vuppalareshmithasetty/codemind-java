import java.util.Scanner;
public class sample{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n,x,y;
        n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            x=sc.nextInt();
            y=sc.nextInt();
            System.out.println(x+y);
        }
    }
}