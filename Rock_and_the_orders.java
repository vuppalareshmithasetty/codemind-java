import java.util.Scanner;
public class Sample{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int d =sc.nextInt();
        int c =sc.nextInt();
        int a1 =sc.nextInt();
        int a2=sc.nextInt();
        int a3=sc.nextInt();
        int b1 =sc.nextInt();
        int b2=sc.nextInt();
        int b3=sc.nextInt();
        int day1 = a1+a2+a3;
        int day2 = b1+b2+b3;
        int tot =day1+day2;
        if((day1>=150) && (day2>=150)){
            if ((tot+d+d)> (tot+c)){
                System.out.print("YES");
            }
            else{
                System.out.print("NO");
            }
        }
        else if(((day1>=150) && (day2<=150) )||((day1<=150)&&(day2>=150) )){
            if((tot+d+d)> (tot+d+c)){
                  System.out.print("YES");
            }
            else{
                System.out.print("NO");
            }
        }
        else{
            if((tot+d+d)> (tot+c+d+d)){
                  System.out.print("YES");
            }
            else{
                System.out.print("NO");
            }
        }
    }
}