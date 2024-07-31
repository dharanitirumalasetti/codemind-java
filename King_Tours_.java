import java.util.Scanner;
public class Tour{
    public static void main(String[] args){
        int a,b,c;
        Scanner read=new Scanner(System.in);
        a=read.nextInt();
        b=read.nextInt();
        c=(a*5)+(b*7);
        System.out.println(c);
    }
}