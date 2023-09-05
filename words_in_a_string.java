import java.util.Scanner;
public class sample{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int c=0;
        String[] arr=s.split(" ");
        for(int i=0;i<arr.length;i++)
        {
            c=c+1;
        }
        System.out.print(c);
    }
}