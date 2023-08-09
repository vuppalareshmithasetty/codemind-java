import java.util.Scanner;
public class def{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n,a,b,c;
        n=sc.nextInt();
        for(int i=1;i<=n;i++){
          a=sc.nextInt();
          b=sc.nextInt();
          c=sc.nextInt();
          if((a+b)<c || (b+c)<a || (c+a)<b){
              System.out.print("YES
");
          }
          else
          {
               System.out.print("NO
");
          }
        }
    }
}