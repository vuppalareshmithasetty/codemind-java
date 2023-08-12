import java.util.Scanner;
public class hi{
public static void main(String[] args){
    Scanner n =new Scanner(System.in);
    char ch;
    ch=n.next().charAt(0);
    if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'||ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
    {
        System.out.print("Vowel");
    }
    else{
        System.out.print("Consonant");
    }
}
}