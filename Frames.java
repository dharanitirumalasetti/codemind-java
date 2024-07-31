import java.util.Scanner;
public class Frames{
    public static void main(String[] args){
        int a,b,c,d;
        Scanner read=new Scanner(System.in);
        a=read.nextInt();
        b=read.nextInt();
        c=read.nextInt();
        d=(2*(a+b)*c);
        System.out.println(d);
    }
}