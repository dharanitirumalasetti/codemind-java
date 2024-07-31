import java.util.Scanner;
public class Hypo{
    public static void main(String[] args){
        int a,b;
        double c;
        Scanner read = new Scanner(System.in);
        a = read.nextInt();
        b = read.nextInt();
        c = Math.sqrt((a*a) + (b*b));
        System.out.printf("%.2f",c);
    }
}