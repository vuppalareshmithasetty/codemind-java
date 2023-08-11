import java.util.Scanner;
public class Sample{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        int x=Integer.parseInt(a,8);
        System.out.println(x);
    }
}