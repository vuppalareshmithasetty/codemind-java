import java.util.Scanner;
public class Sample{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int c=0;
        for(int i=1;i<=n/2;i++){
            if((i*(i+1))==n){
                c++;
            }
        }
        if(c>=1){
            System.out.print("YES");
        }
        else{
            System.out.print("NO");
        }
    }
}