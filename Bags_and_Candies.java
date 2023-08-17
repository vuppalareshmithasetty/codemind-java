import java.util.Scanner;
public class sample{
    public static void main(String[] args){
        Scanner sc =new Scanner (System.in);
        int tot =sc.nextInt();
        int pockets =sc.nextInt();
        int hold =sc.nextInt();
        int a=(pockets*hold);
        if(tot==a){
            System.out.print("1");
        }
        else if(tot%a==0){
            System.out.print(tot/a);
        }
        else{
            System.out.print(1+(tot/a));
        }
    }
}