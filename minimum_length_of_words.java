import java.util.Scanner;
public class sample{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int c=0;
        String[] arr=s.split(" ");
        for(int i=0;i<arr.length;i++)
        {
            int z=arr[i].length();
            if(c<=z)
            {
                c=z;
            }
        }
        System.out.print(c);
    }
}