import java.util.Scanner;
public class Sample{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        int sum=0;
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
           arr[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
             sum =sum+arr[i];
        }
        int avg =sum/n;
        int c=100;
        for(int i=0;i<n;i++)
        {
            if(avg==arr[i]){
                c=0;
                break;
            }
            else{
                c=100;
            }
        }
        int z=c;
        if(z==0){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}