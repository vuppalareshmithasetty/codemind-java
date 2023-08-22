import java.util.Scanner;
public class Sample{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int a=sc.nextInt();
        int sum=0;
        int pro=1;
        int s;
        while(a>0){
            s=a%10;
            sum=sum+s;
            pro=pro*s;
            a=a/10;
        }
      if(sum==pro){
          System.out.print("Spy Number");
      }
      else{
          System.out.print("Not Spy Number"); 
      }
    }
}