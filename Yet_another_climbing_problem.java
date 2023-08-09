import java.util.Scanner;
public class clm{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int i,run;
        run=sc.nextInt();
        for(i=1;i<=run;i++){
            int x,y,a,b;
            x=sc.nextInt();
            y=sc.nextInt();
            a=x/y;
            b=x%y;
            System.out.println(a+b);
        }
    }
}