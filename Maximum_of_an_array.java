import java.util.Scanner;
public class Sample{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
           arr[i] = sc.nextInt();
        }
        int c=arr[0];
        for(int i=0;i<n;i++)
        {
             if(c<arr[i]){
                 c=arr[i];
             }
        }
        System.out.println(c);
    }
}