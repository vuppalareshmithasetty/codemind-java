import java.util.Scanner;
public class area{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int a;
        a=sc.nextInt();
        int ans=(a*(a-1))/2;
        System.out.print(ans);
    }
}