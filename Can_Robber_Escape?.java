import java.util.Scanner;
public class jfd{
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int c=0;
    for(int i=1;i<=n;i++){
        int a=sc.nextInt();
        if(n>a){
            c++;
        }
    }
    if(c==n){
        System.out.print("YES");
    }
    else{
        System.out.print("NO");
    }
    }
}