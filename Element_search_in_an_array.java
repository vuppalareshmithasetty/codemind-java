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
        int s = sc.nextInt();
        int i=0;
        while(i<n)
        {
             if(s==arr[i]){
                 System.out.println("True"); 
                 break;
             }
             else if(i==n-1){
                 System.out.println("False");
                 break;
             }
             else{
                 i++;
             }
        }
    }
}