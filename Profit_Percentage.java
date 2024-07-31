import java.util.Scanner;
public class Profit{
    public static void main(String[] args){
        int cp,sp;
        float profit,per;
        Scanner read=new Scanner(System.in);
        cp=read.nextInt();
        sp=read.nextInt();
        profit=sp-cp;
        per=(profit*100)/cp;
        System.out.printf("%.2f",per);
    }
}