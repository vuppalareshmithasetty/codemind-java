import java.util.Scanner;
public class Sample{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int c=0;
        for(int i=1;i<n;i++){
            if(n%i==0){
                c=c+i;
            }
        }
        if(c==n){
            System.out.print("True");
        }
        else{
            System.out.print("False");
        }
    }
}