import java.util.Scanner;
public class Sample{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        int odd=0,even=0;
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
           arr[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
           if(i%2==0){
               even=even+arr[i];
           }
           else{
               odd=odd +arr[i];
           }
        }
        if(even>odd){
            System.out.print(even-odd);
        }
        else{
            System.out.print(odd-even);
        }
    }
}