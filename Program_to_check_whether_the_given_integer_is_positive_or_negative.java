import java.util.Scanner;
public class sample{
    public static void main(String[] args){
        Scanner n = new Scanner(System.in);
        int a;
        a=n.nextInt();
        if(a>=0){
            System.out.print("Positive Number");
        }
        else{
            System.out.print("Negative Number");
        }
    }
}