import java.util.Scanner;
public class Square{
    public static void main(String[] args){
        int a,A,p;
        Scanner read=new Scanner(System.in);
        a=read.nextInt();
        A=a*a;
        p=4*a;
        System.out.println(A+" "+p);
    }
}